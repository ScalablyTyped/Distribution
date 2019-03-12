package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelOptions extends OptionsBase {
                // the path to the value (used to create related observables from the factory).
  var factories: js.UndefOr[js.Any] = js.undefined
  var internals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
          // an array of atttributes that will have kb.Observables created even if they do not exist on the Backbone.Model. Useful for binding Views that require specific observables to exist
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
         // an array of atttributes that should be scoped with an underscore, eg. name -> _name
  var requires: js.UndefOr[js.Array[java.lang.String]] = js.undefined
              // restricts the keys used on a model. Useful for reducing the number of kb.Observables created from a limited set of Backbone.Model attributes
  def `if`(objOrArray: js.Any): js.Any
}

object ViewModelOptions {
  @scala.inline
  def apply(
    `if`: js.Any => js.Any,
    factories: js.Any = null,
    factory: Factory = null,
    internals: js.Array[java.lang.String] = null,
    keys: js.Array[java.lang.String] = null,
    options: js.Any = null,
    path: java.lang.String = null,
    requires: js.Array[java.lang.String] = null,
    store: Store = null
  ): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
    if (factories != null) __obj.updateDynamic("factories")(factories)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    if (internals != null) __obj.updateDynamic("internals")(internals)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (options != null) __obj.updateDynamic("options")(options)
    if (path != null) __obj.updateDynamic("path")(path)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ViewModelOptions]
  }
}

