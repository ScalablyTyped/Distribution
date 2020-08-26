package typings.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keycloakConnect.mod.Config because Already inherited */ @js.native
trait StoreConfig extends BaseConfig {
  var store: js.Any = js.native
}

object StoreConfig {
  @scala.inline
  def apply(store: js.Any): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
  @scala.inline
  implicit class StoreConfigOps[Self <: StoreConfig] (val x: Self) extends AnyVal {
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
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

