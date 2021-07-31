package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object card {
  
  trait CardData
    extends StObject
       with EntityBaseData {
    
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
    
    @scala.inline
    implicit class CardDataMutableBuilder[Self <: CardData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankCode(value: String): Self = StObject.set(x, "BankCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardProvider(value: String): Self = StObject.set(x, "CardProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidity(value: CardValidity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR
  */
  trait CardStatus extends StObject
  object CardStatus {
    
    @scala.inline
    def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
    
    @scala.inline
    def ERROR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR = "ERROR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR]
    
    @scala.inline
    def VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = "VALIDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB
  */
  trait CardType extends StObject
  object CardType {
    
    @scala.inline
    def BCMC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC = "BCMC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC]
    
    @scala.inline
    def CB_VISA_MASTERCARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD = "CB_VISA_MASTERCARD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD]
    
    @scala.inline
    def DINERS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS = "DINERS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS]
    
    @scala.inline
    def IDEAL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL = "IDEAL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL]
    
    @scala.inline
    def MAESTRO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO = "MAESTRO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO]
    
    @scala.inline
    def MASTERPASS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS = "MASTERPASS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS]
    
    @scala.inline
    def P24: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24 = "P24".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24]
    
    @scala.inline
    def PAYLIB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB = "PAYLIB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
  */
  trait CardValidity extends StObject
  object CardValidity {
    
    @scala.inline
    def INVALID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = "INVALID".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID]
    
    @scala.inline
    def UNKNOWN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
    
    @scala.inline
    def VALID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = "VALID".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID]
  }
  
  trait UpdateCard extends StObject {
    
    var Active: js.UndefOr[`false`] = js.undefined
    
    var Id: String
  }
  object UpdateCard {
    
    @scala.inline
    def apply(Id: String): UpdateCard = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCard]
    }
    
    @scala.inline
    implicit class UpdateCardMutableBuilder[Self <: UpdateCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: `false`): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    }
  }
}
