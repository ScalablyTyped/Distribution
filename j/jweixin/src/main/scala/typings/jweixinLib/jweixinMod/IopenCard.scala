package typings
package jweixinLib.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IopenCard extends BaseParams {
  var cardList: js.Array[jweixinLib.Anon_CardId]
}

object IopenCard {
  @scala.inline
  def apply(
    cardList: js.Array[jweixinLib.Anon_CardId],
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IopenCard = {
    val __obj = js.Dynamic.literal(cardList = cardList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IopenCard]
  }
}

