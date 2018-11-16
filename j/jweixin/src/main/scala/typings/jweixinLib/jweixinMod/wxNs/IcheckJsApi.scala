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
  def success_MIcheckJsApi(res: jweixinLib.Anon_ErrMsg): scala.Unit
}

