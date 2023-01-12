package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYCONIQ
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePayconiqWebPayInData extends StObject {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * The Country of the Address
    */
  var Country: CountryISO
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  
  var ExecutionType: WEB
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  
  var PaymentType: PAYCONIQ
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String
  
  /**
    * Custom data that you can add to this item
    */
  var Tag: js.UndefOr[String] = js.undefined
}
object CreatePayconiqWebPayInData {
  
  inline def apply(
    AuthorId: String,
    Country: CountryISO,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    Fees: MoneyData,
    ReturnURL: String
  ): CreatePayconiqWebPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], PaymentType = "PAYCONIQ", ReturnURL = ReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayconiqWebPayInData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePayconiqWebPayInData] (val x: Self) extends AnyVal {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: PAYCONIQ): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
