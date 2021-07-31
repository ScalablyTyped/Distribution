package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.card.CardData
import typings.mangopay2NodejsSdk.mod.card.CardValidity
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var Active: Boolean = js.native
  
  /**
    * A partially obfuscated version of the credit card number
    */
  /* CompleteClass */
  var Alias: String = js.native
  
  /**
    * The bank code
    */
  /* CompleteClass */
  var BankCode: String = js.native
  
  /**
    * The provider of the card
    */
  /* CompleteClass */
  var CardProvider: String = js.native
  
  /**
    * The type of card
    */
  /* CompleteClass */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
  
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  var Country: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The currency - should be ISO_4217 format
    */
  /* CompleteClass */
  var Currency: CurrencyISO = js.native
  
  /**
    * The expiry date of the card - must be in format MMYY
    */
  /* CompleteClass */
  var ExpirationDate: String = js.native
  
  /**
    * A unique representation of a 16-digits card number
    */
  /* CompleteClass */
  var Fingerprint: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The card product type - more info
    */
  /* CompleteClass */
  var Product: String = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * Whether the card is valid or not. Once they process (or attempt to process) a payment with the card we are able to indicate if it is "valid" or "invalid".
    * If they didn’t process a payment yet the "Validity" stay at "unknown".
    */
  /* CompleteClass */
  var Validity: CardValidity = js.native
}
