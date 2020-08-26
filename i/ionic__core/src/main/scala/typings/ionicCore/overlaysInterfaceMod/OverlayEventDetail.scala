package typings.ionicCore.overlaysInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayEventDetail[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var role: js.UndefOr[String] = js.native
}

object OverlayEventDetail {
  @scala.inline
  def apply[T](): OverlayEventDetail[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayEventDetail[T]]
  }
  @scala.inline
  implicit class OverlayEventDetailOps[Self <: OverlayEventDetail[_], T] (val x: Self with OverlayEventDetail[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

