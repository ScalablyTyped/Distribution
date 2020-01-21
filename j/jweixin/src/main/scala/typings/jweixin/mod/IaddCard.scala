package typings.jweixin.mod

import typings.jweixin.AnonCardExt
import typings.jweixin.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IaddCard extends BaseParams {
  var cardList: js.Array[AnonCardExt]
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: AnonCardList): Unit
}

object IaddCard {
  @scala.inline
  def apply(
    cardList: js.Array[AnonCardExt],
    success: AnonCardList => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IaddCard]
  }
}

