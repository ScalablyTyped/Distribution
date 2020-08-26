package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  var default: js.Array[scala.Nothing] = js.native
  var items: Ref = js.native
  var `type`: String = js.native
}

object Items {
  @scala.inline
  def apply(default: js.Array[scala.Nothing], items: Ref, `type`: String): Items = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
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
    def setDefaultVarargs(value: scala.Nothing*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: js.Array[scala.Nothing]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: Ref): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

