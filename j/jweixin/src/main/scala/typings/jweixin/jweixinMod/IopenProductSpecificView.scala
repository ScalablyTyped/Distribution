package typings.jweixin.jweixinMod

import typings.jweixin.jweixinStrings.`0`
import typings.jweixin.jweixinStrings.`1`
import typings.jweixin.jweixinStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信扫一扫================================*/
/*=============================微信小店================================*/
trait IopenProductSpecificView extends BaseParams {
  var productId: String
   // 商品id
  var viewType: `0` | `1` | `2`
}

object IopenProductSpecificView {
  @scala.inline
  def apply(
    productId: String,
    viewType: `0` | `1` | `2`,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IopenProductSpecificView = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IopenProductSpecificView]
  }
}

