package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBase extends js.Object {
                 // a store used to cache and share view models.
  var factory: js.UndefOr[Factory] = js.undefined
             // a factory used to create view models.
  var options: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
                 // the path to the value (used to create related observables from the factory).
  var store: js.UndefOr[Store] = js.undefined
}

object OptionsBase {
  @scala.inline
  def apply(factory: Factory = null, options: js.Any = null, path: String = null, store: Store = null): OptionsBase = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory)
    if (options != null) __obj.updateDynamic("options")(options)
    if (path != null) __obj.updateDynamic("path")(path)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[OptionsBase]
  }
}

