package typings.mangopay2NodejsSdk.mod.cardRegistration

import typings.mangopay2NodejsSdk.mod.card.CardType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'CardType' | 'Tag', 'UserId' | 'Currency'> */
trait CreateCardRegistration extends js.Object {
  var CardType: js.UndefOr[typings.mangopay2NodejsSdk.mod.card.CardType] = js.undefined
  var Currency: CurrencyISO
  var Tag: js.UndefOr[String] = js.undefined
  var UserId: String
}

object CreateCardRegistration {
  @scala.inline
  def apply(Currency: CurrencyISO, UserId: String, CardType: CardType = null, Tag: String = null): CreateCardRegistration = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (CardType != null) __obj.updateDynamic("CardType")(CardType.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardRegistration]
  }
}

