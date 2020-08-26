package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
@js.native
trait IstartSearchBeacons extends BaseParams {
  var ticket: String = js.native
    // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: js.Any): Unit = js.native
}

object IstartSearchBeacons {
  @scala.inline
  def apply(complete: js.Any => Unit, ticket: String): IstartSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IstartSearchBeacons]
  }
  @scala.inline
  implicit class IstartSearchBeaconsOps[Self <: IstartSearchBeacons] (val x: Self) extends AnyVal {
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
    def setComplete(value: js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setTicket(value: String): Self = this.set("ticket", value.asInstanceOf[js.Any])
  }
  
}

