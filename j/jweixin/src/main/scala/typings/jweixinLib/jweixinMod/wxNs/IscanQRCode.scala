package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IscanQRCode extends BaseParams {
  var needResult: jweixinLib.jweixinLibNumbers.`0` | jweixinLib.jweixinLibNumbers.`1`
   // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
  var scanType: js.Array[scanType]
   // 可以指定扫二维码还是一维码，默认二者都有
  // 当needResult 为 1 时，扫码返回的结果
  @JSName("success")
  def success_MIscanQRCode(res: jweixinLib.Anon_ResultStr): scala.Unit
}

object IscanQRCode {
  @scala.inline
  def apply(
    needResult: jweixinLib.jweixinLibNumbers.`0` | jweixinLib.jweixinLibNumbers.`1`,
    scanType: js.Array[scanType],
    success: js.Function1[jweixinLib.Anon_ResultStr, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IscanQRCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("needResult")(needResult.asInstanceOf[js.Any])
    __obj.updateDynamic("scanType")(scanType)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IscanQRCode]
  }
}

