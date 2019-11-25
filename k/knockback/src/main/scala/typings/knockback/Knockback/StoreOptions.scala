package typings.knockback.Knockback

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
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoreOptions]
  }
}

