package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
trait IstartSearchBeacons extends BaseParams {
  var ticket: java.lang.String
    // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: js.Any): scala.Unit
}

object IstartSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Function1[js.Any, scala.Unit],
    ticket: java.lang.String,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IstartSearchBeacons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("ticket")(ticket)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IstartSearchBeacons]
  }
}

