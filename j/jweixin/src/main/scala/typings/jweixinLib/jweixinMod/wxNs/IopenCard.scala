package typings
package jweixinLib.jweixinMod.wxNs

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
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IopenCard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardList")(cardList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IopenCard]
  }
}

