package typings.mangopay2NodejsSdk.mod.card

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardData extends EntityBaseData {
  /**
    * Whether the card is active or not
    */
  var Active: Boolean
  /**
    * A partially obfuscated version of the credit card number
    */
  var Alias: String
  /**
    * The bank code
    */
  var BankCode: String
  /**
    * The provider of the card
    */
  var CardProvider: String
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType
  /**
    * The Country of the Address
    */
  var Country: String
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO
  /**
    * The expiry date of the card - must be in format MMYY
    */
  var ExpirationDate: String
  /**
    * A unique representation of a 16-digits card number
    */
  var Fingerprint: String
  /**
    * The card product type - more info
    */
  var Product: String
  /**
    * Whether the card is valid or not. Once they process (or attempt to process) a payment with the card we are able to indicate if it is "valid" or "invalid".
    * If they didn’t process a payment yet the "Validity" stay at "unknown".
    */
  var Validity: CardValidity
}

object CardData {
  @scala.inline
  def apply(
    Active: Boolean,
    Alias: String,
    BankCode: String,
    CardProvider: String,
    CardType: CardType,
    Country: String,
    CreationDate: Double,
    Currency: CurrencyISO,
    ExpirationDate: String,
    Fingerprint: String,
    Id: String,
    Product: String,
    Tag: String,
    Validity: CardValidity
  ): CardData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], BankCode = BankCode.asInstanceOf[js.Any], CardProvider = CardProvider.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Fingerprint = Fingerprint.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CardData]
  }
}

