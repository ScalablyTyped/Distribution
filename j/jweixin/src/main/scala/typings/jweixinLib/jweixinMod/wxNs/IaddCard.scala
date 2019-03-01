package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IaddCard extends BaseParams {
  var cardList: js.Array[jweixinLib.Anon_CardExt]
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: jweixinLib.Anon_CardList): scala.Unit
}

object IaddCard {
  @scala.inline
  def apply(
    cardList: js.Array[jweixinLib.Anon_CardExt],
    success: js.Function1[jweixinLib.Anon_CardList, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IaddCard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardList")(cardList)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IaddCard]
  }
}

