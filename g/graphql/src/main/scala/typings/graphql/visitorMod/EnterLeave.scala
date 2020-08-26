package typings.graphql.visitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterLeave[T] extends js.Object {
  val enter: js.UndefOr[T] = js.native
  val leave: js.UndefOr[T] = js.native
}

object EnterLeave {
  @scala.inline
  def apply[T](): EnterLeave[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterLeave[T]]
  }
  @scala.inline
  implicit class EnterLeaveOps[Self <: EnterLeave[_], T] (val x: Self with EnterLeave[T]) extends AnyVal {
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
    def setEnter(value: T): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setLeave(value: T): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
  
}

