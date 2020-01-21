package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseParams extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object BaseParams {
  @scala.inline
  def apply(
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): BaseParams = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[BaseParams]
  }
}

