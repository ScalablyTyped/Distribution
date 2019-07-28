package typings.jweixin.jweixinMod

import typings.jweixin.Anon_CardExt
import typings.jweixin.Anon_CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IaddCard extends BaseParams {
  var cardList: js.Array[Anon_CardExt]
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: Anon_CardList): Unit
}

object IaddCard {
  @scala.inline
  def apply(
    cardList: js.Array[Anon_CardExt],
    success: Anon_CardList => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IaddCard]
  }
}

