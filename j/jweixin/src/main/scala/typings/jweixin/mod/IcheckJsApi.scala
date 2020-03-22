package typings.jweixin.mod

import typings.jweixin.AnonCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcheckJsApi extends BaseParams {
  var jsApiList: typings.jweixin.mod.jsApiList
   // 需要检测的JS接口列表，所有JS接口列表见附录2,
  // 以键值对的形式返回，可用的api值true，不可用为false
  // 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
  @JSName("success")
  def success_MIcheckJsApi(res: AnonCheckResult): Unit
}

object IcheckJsApi {
  @scala.inline
  def apply(
    jsApiList: jsApiList,
    success: AnonCheckResult => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IcheckJsApi = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IcheckJsApi]
  }
}

