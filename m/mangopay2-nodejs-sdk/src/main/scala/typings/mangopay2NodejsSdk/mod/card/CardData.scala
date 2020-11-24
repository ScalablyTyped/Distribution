package typings.mangopay2NodejsSdk.mod.card

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardData extends EntityBaseData {
  
  /**
    * Whether the card is active or not
    */
  var Active: Boolean = js.native
  
  /**
    * A partially obfuscated version of the credit card number
    */
  var Alias: String = js.native
  
  /**
    * The bank code
    */
  var BankCode: String = js.native
  
  /**
    * The provider of the card
    */
  var CardProvider: String = js.native
  
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
  
  /**
    * The Country of the Address
    */
  var Country: String = js.native
  
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO = js.native
  
  /**
    * The expiry date of the card - must be in format MMYY
    */
  var ExpirationDate: String = js.native
  
  /**
    * A unique representation of a 16-digits card number
    */
  var Fingerprint: String = js.native
  
  /**
    * The card product type - more info
    */
  var Product: String = js.native
  
  /**
    * Whether the card is valid or not. Once they process (or attempt to process) a payment with the card we are able to indicate if it is "valid" or "invalid".
    * If they didn’t process a payment yet the "Validity" stay at "unknown".
    */
  var Validity: CardValidity = js.native
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
  
  @scala.inline
  implicit class CardDataOps[Self <: CardData] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankCode(value: String): Self = this.set("BankCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardProvider(value: String): Self = this.set("CardProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: CardType): Self = this.set("CardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: CurrencyISO): Self = this.set("Currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = this.set("Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: CardValidity): Self = this.set("Validity", value.asInstanceOf[js.Any])
  }
}
