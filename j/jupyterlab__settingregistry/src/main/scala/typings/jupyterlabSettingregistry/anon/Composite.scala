package typings.jupyterlabSettingregistry.anon

import typings.luminoCoreutils.jsonMod.PartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Composite extends js.Object {
  var composite: js.UndefOr[PartialJSONValue] = js.native
  var user: js.UndefOr[PartialJSONValue] = js.native
}

object Composite {
  @scala.inline
  def apply(): Composite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Composite]
  }
  @scala.inline
  implicit class CompositeOps[Self <: Composite] (val x: Self) extends AnyVal {
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
    def setComposite(value: PartialJSONValue): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setCompositeNull: Self = this.set("composite", null)
    @scala.inline
    def setUser(value: PartialJSONValue): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
  
}

