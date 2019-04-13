package typings
package jweixinLib.jweixinMod

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
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IopenProductSpecificView = {
    val __obj = js.Dynamic.literal(productId = productId, viewType = viewType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IopenProductSpecificView]
  }
}

