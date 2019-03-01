package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcheckJsApi extends BaseParams {
  var jsApiList: jsApiList
   // 需要检测的JS接口列表，所有JS接口列表见附录2,
  // 以键值对的形式返回，可用的api值true，不可用为false
  // 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
  @JSName("success")
  def success_MIcheckJsApi(res: jweixinLib.Anon_Api): scala.Unit
}

object IcheckJsApi {
  @scala.inline
  def apply(
    jsApiList: jsApiList,
    success: js.Function1[jweixinLib.Anon_Api, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IcheckJsApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jsApiList")(jsApiList)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IcheckJsApi]
  }
}

