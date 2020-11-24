package typings.mangopay2NodejsSdk.mod.cardRegistration

import typings.mangopay2NodejsSdk.mod.card.CardType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'CardType' | 'Tag', 'UserId' | 'Currency'> */
@js.native
trait CreateCardRegistration extends js.Object {
  
  var CardType: js.UndefOr[typings.mangopay2NodejsSdk.mod.card.CardType] = js.native
  
  var Currency: CurrencyISO = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var UserId: String = js.native
}
object CreateCardRegistration {
  
  @scala.inline
  def apply(Currency: CurrencyISO, UserId: String): CreateCardRegistration = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardRegistration]
  }
  
  @scala.inline
  implicit class CreateCardRegistrationOps[Self <: CreateCardRegistration] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: CurrencyISO): Self = this.set("Currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: CardType): Self = this.set("CardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardType: Self = this.set("CardType", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
