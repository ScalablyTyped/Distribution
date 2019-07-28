package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IstopSearchBeacons extends BaseParams {
  // 关闭查找完成后的回调函数
  @JSName("complete")
  def complete_MIstopSearchBeacons(res: js.Any): Unit
}

object IstopSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IstopSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IstopSearchBeacons]
  }
}

