package typings.jweixin.mod

import typings.jweixin.anon.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetNetworkType extends BaseParams {
  @JSName("success")
  def success_MIgetNetworkType(res: NetworkType): Unit
}

object IgetNetworkType {
  @scala.inline
  def apply(
    success: NetworkType => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IgetNetworkType = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IgetNetworkType]
  }
}

