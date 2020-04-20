package typings.mangopay2NodejsSdk.mod.cardRegistration

import typings.mangopay2NodejsSdk.mod.card.CardStatus
import typings.mangopay2NodejsSdk.mod.card.CardType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardRegistrationData extends EntityBaseData {
  /**
    * A special key to use when registering a card
    */
  var AccessKey: String
  /**
    * The ID of a card
    */
  var CardId: String
  /**
    * The URL to submit the card details form to
    */
  var CardRegistrationURL: String
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO
  /**
    * A specific value to pass to the CardRegistrationURL
    */
  var PreregistrationData: String
  /**
    * Having registered a card, this confirmation hash needs to be updated to the card item
    */
  var RegistrationData: String
  /**
    * The result code
    */
  var ResultCode: String
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  /**
    * Status of the card registration
    */
  var Status: CardStatus
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object CardRegistrationData {
  @scala.inline
  def apply(
    AccessKey: String,
    CardId: String,
    CardRegistrationURL: String,
    CardType: CardType,
    CreationDate: Double,
    Currency: CurrencyISO,
    Id: String,
    PreregistrationData: String,
    RegistrationData: String,
    ResultCode: String,
    ResultMessage: String,
    Status: CardStatus,
    Tag: String,
    UserId: String
  ): CardRegistrationData = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CardRegistrationURL = CardRegistrationURL.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PreregistrationData = PreregistrationData.asInstanceOf[js.Any], RegistrationData = RegistrationData.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardRegistrationData]
  }
}

