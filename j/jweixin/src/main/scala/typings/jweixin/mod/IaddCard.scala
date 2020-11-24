package typings.jweixin.mod

import typings.jweixin.anon.CardExt
import typings.jweixin.anon.CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IaddCard extends BaseParams {
  
  var cardList: js.Array[CardExt] = js.native
  
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: CardList): Unit = js.native
}
object IaddCard {
  
  @scala.inline
  def apply(cardList: js.Array[CardExt], success: CardList => Unit): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IaddCard]
  }
  
  @scala.inline
  implicit class IaddCardOps[Self <: IaddCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCardListVarargs(value: CardExt*): Self = this.set("cardList", js.Array(value :_*))
    
    @scala.inline
    def setCardList(value: js.Array[CardExt]): Self = this.set("cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: CardList => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
