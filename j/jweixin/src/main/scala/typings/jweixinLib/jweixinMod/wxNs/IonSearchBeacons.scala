package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSearchBeacons extends BaseParams {
  // 回调函数，可以数组形式取得该商家注册的在周边的相关设备列表
  @JSName("complete")
  def complete_MIonSearchBeacons(argv: js.Any): scala.Unit
}

object IonSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Function1[js.Any, scala.Unit],
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IonSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IonSearchBeacons]
  }
}

