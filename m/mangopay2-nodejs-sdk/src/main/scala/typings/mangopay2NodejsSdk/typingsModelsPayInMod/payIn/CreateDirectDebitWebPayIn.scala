package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectDebitWebPayIn extends StObject {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: CountryISO
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  
  /**
    * The type of web direct debit
    */
  var DirectDebitType: typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitType
  
  var ExecutionType: WEB
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  
  var PaymentType: DIRECT_DEBIT
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String
}
object CreateDirectDebitWebPayIn {
  
  inline def apply(
    AuthorId: String,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    DirectDebitType: DirectDebitType,
    Fees: MoneyData,
    ReturnURL: String
  ): CreateDirectDebitWebPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DirectDebitType = DirectDebitType.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], PaymentType = "DIRECT_DEBIT", ReturnURL = ReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectDebitWebPayIn]
  }
  
  extension [Self <: CreateDirectDebitWebPayIn](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDirectDebitType(value: DirectDebitType): Self = StObject.set(x, "DirectDebitType", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: DIRECT_DEBIT): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
  }
}
