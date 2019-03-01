package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var creator: js.Any
  var factory: Factory
  var path: java.lang.String
  var store: Store
}

object StoreOptions {
  @scala.inline
  def apply(creator: js.Any, factory: Factory, path: java.lang.String, store: Store): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creator")(creator)
    __obj.updateDynamic("factory")(factory)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[StoreOptions]
  }
}

