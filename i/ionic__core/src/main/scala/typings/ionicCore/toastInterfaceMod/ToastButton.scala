package typings.ionicCore.toastInterfaceMod

import typings.ionicCore.ionicCoreStrings.cancel
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastButton extends js.Object {
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var handler: js.UndefOr[js.Function0[Boolean | Unit | (js.Promise[Boolean | Unit])]] = js.native
  var icon: js.UndefOr[String] = js.native
  var role: js.UndefOr[cancel | String] = js.native
  var side: js.UndefOr[start | end] = js.native
  var text: js.UndefOr[String] = js.native
}

object ToastButton {
  @scala.inline
  def apply(): ToastButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastButton]
  }
  @scala.inline
  implicit class ToastButtonOps[Self <: ToastButton] (val x: Self) extends AnyVal {
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
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setHandler(value: () => Boolean | Unit | (js.Promise[Boolean | Unit])): Self = this.set("handler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setRole(value: cancel | String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSide(value: start | end): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

