package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreOptions extends js.Object {
  var creator: js.Any = js.native
  var factory: Factory = js.native
  var path: String = js.native
  var store: Store = js.native
}

object StoreOptions {
  @scala.inline
  def apply(creator: js.Any, factory: Factory, path: String, store: Store): StoreOptions = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreator(value: js.Any): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactory(value: Factory): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

