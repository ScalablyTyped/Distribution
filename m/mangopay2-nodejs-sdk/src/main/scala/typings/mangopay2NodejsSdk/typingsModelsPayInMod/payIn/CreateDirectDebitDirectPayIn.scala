package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectDebitDirectPayIn extends StObject {
  
  var AuthorId: String
  
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  var CreditedWalletId: String
  
  var DebitedFunds: MoneyData
  
  var ExecutionType: DIRECT
  
  var Fees: MoneyData
  
  var MandateId: String
  
  var PaymentType: DIRECT_DEBIT
  
  var StatementDescriptor: js.UndefOr[String] = js.undefined
}
object CreateDirectDebitDirectPayIn {
  
  inline def apply(
    AuthorId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    Fees: MoneyData,
    MandateId: String
  ): CreateDirectDebitDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], MandateId = MandateId.asInstanceOf[js.Any], PaymentType = "DIRECT_DEBIT")
    __obj.asInstanceOf[CreateDirectDebitDirectPayIn]
  }
  
  extension [Self <: CreateDirectDebitDirectPayIn](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setMandateId(value: String): Self = StObject.set(x, "MandateId", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: DIRECT_DEBIT): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
  }
}
