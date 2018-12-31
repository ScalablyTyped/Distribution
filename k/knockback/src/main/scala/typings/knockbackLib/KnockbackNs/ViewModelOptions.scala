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

