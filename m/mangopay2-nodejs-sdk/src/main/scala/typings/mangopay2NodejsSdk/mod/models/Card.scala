package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.card.CardData
import typings.mangopay2NodejsSdk.mod.card.CardValidity
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Card")
@js.native
class Card protected ()
  extends EntityBase[CardData]
     with CardData {
  def this(data: CardData) = this()
  /**
    * Whether the card is active or not
    */
  /* CompleteClass */
  override var Active: Boolean = js.native
  /**
    * A partially obfuscated version of the credit card number
    */
  /* CompleteClass */
  override var Alias: String = js.native
  /**
    * The bank code
    */
  /* CompleteClass */
  override var BankCode: String = js.native
  /**
    * The provider of the card
    */
  /* CompleteClass */
  override var CardProvider: String = js.native
  /**
    * The type of card
    */
  /* CompleteClass */
  override var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  override var Country: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The currency - should be ISO_4217 format
    */
  /* CompleteClass */
  override var Currency: CurrencyISO = js.native
  /**
    * The expiry date of the card - must be in format MMYY
    */
  /* CompleteClass */
  override var ExpirationDate: String = js.native
  /**
    * A unique representation of a 16-digits card number
    */
  /* CompleteClass */
  override var Fingerprint: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The card product type - more info
    */
  /* CompleteClass */
  override var Product: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * Whether the card is valid or not. Once they process (or attempt to process) a payment with the card we are able to indicate if it is "valid" or "invalid".
    * If they didn’t process a payment yet the "Validity" stay at "unknown".
    */
  /* CompleteClass */
  override var Validity: CardValidity = js.native
}

