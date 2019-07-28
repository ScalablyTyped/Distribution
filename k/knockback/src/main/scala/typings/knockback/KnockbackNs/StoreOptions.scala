package typings.knockback.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var creator: js.Any
  var factory: Factory
  var path: String
  var store: Store
}

object StoreOptions {
  @scala.inline
  def apply(creator: js.Any, factory: Factory, path: String, store: Store): StoreOptions = {
    val __obj = js.Dynamic.literal(creator = creator, factory = factory, path = path, store = store)
  
    __obj.asInstanceOf[StoreOptions]
  }
}

