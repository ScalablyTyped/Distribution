package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信扫一扫================================*/
/*=============================微信小店================================*/
trait IopenProductSpecificView extends BaseParams {
  var productId: java.lang.String
   // 商品id
  var viewType: jweixinLib.jweixinLibStrings.`0` | jweixinLib.jweixinLibStrings.`1` | jweixinLib.jweixinLibStrings.`2`
}

object IopenProductSpecificView {
  @scala.inline
  def apply(
    productId: java.lang.String,
    viewType: jweixinLib.jweixinLibStrings.`0` | jweixinLib.jweixinLibStrings.`1` | jweixinLib.jweixinLibStrings.`2`,
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IopenProductSpecificView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("productId")(productId)
    __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IopenProductSpecificView]
  }
}

