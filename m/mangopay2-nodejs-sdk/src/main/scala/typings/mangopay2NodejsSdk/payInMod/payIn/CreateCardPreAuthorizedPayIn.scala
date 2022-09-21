package typings.mangopay2NodejsSdk.payInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCardPreAuthorizedPayIn extends StObject {
  
  /**
    * A user's ID
    */
  var AuthorId: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  
  var ExecutionType: DIRECT
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  
  var PaymentType: PREAUTHORIZED
  
  /**
    * The ID of the Preauthorization object
    */
  var PreauthorizationId: String
  
  /**
    * Custom data that you can add to this item
    */
  var Tag: js.UndefOr[String] = js.undefined
}
object CreateCardPreAuthorizedPayIn {
  
  inline def apply(CreditedWalletId: String, DebitedFunds: MoneyData, Fees: MoneyData, PreauthorizationId: String): CreateCardPreAuthorizedPayIn = {
    val __obj = js.Dynamic.literal(CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], PaymentType = "PREAUTHORIZED", PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardPreAuthorizedPayIn]
  }
  
  extension [Self <: CreateCardPreAuthorizedPayIn](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: PREAUTHORIZED): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setPreauthorizationId(value: String): Self = StObject.set(x, "PreauthorizationId", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
