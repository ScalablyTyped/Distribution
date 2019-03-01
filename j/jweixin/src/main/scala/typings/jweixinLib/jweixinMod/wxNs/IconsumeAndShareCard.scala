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
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IconsumeAndShareCard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardId")(cardId)
    __obj.updateDynamic("code")(code)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IconsumeAndShareCard]
  }
}

