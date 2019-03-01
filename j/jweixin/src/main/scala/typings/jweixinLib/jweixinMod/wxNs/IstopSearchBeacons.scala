package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IstopSearchBeacons extends BaseParams {
  // 关闭查找完成后的回调函数
  @JSName("complete")
  def complete_MIstopSearchBeacons(res: js.Any): scala.Unit
}

object IstopSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Function1[js.Any, scala.Unit],
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IstopSearchBeacons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IstopSearchBeacons]
  }
}

