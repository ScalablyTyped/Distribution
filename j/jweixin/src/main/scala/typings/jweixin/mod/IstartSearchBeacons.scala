package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
trait IstartSearchBeacons extends BaseParams {
  var ticket: String
    // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: js.Any): Unit
}

object IstartSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    ticket: String,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IstartSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), ticket = ticket.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IstartSearchBeacons]
  }
}

