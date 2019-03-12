package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconsumeAndShareCard extends BaseParams {
  var cardId: java.lang.String
  var code: java.lang.String
}

object IconsumeAndShareCard {
  @scala.inline
  def apply(
    cardId: java.lang.String,
    code: java.lang.String,
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IconsumeAndShareCard = {
    val __obj = js.Dynamic.literal(cardId = cardId, code = code)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IconsumeAndShareCard]
  }
}

