package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetNetworkType extends BaseParams {
  @JSName("success")
  def success_MIgetNetworkType(res: jweixinLib.Anon_NetworkType): scala.Unit
}

object IgetNetworkType {
  @scala.inline
  def apply(
    success: js.Function1[jweixinLib.Anon_NetworkType, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IgetNetworkType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IgetNetworkType]
  }
}

