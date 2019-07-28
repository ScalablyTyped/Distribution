package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconsumeAndShareCard extends BaseParams {
  var cardId: String
  var code: String
}

object IconsumeAndShareCard {
  @scala.inline
  def apply(
    cardId: String,
    code: String,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IconsumeAndShareCard = {
    val __obj = js.Dynamic.literal(cardId = cardId, code = code)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IconsumeAndShareCard]
  }
}

