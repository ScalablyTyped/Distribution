package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/payIn.payIn.BankWireDirectPayInData, 'Tag' | 'CreditedUserId', 'AuthorId' | 'CreditedWalletId' | 'DeclaredDebitedFunds' | 'DeclaredFees'> */
trait CreateBankWireDirectPayIn extends StObject {
  
  var AuthorId: String
  
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  var CreditedWalletId: String
  
  var DeclaredDebitedFunds: MoneyData
  
  var DeclaredFees: MoneyData
  
  var ExecutionType: DIRECT
  
  var PaymentType: BANK_WIRE
  
  var Tag: js.UndefOr[String] = js.undefined
}
object CreateBankWireDirectPayIn {
  
  inline def apply(
    AuthorId: String,
    CreditedWalletId: String,
    DeclaredDebitedFunds: MoneyData,
    DeclaredFees: MoneyData
  ): CreateBankWireDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionType = "DIRECT", PaymentType = "BANK_WIRE")
    __obj.asInstanceOf[CreateBankWireDirectPayIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBankWireDirectPayIn] (val x: Self) extends AnyVal {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDeclaredDebitedFunds(value: MoneyData): Self = StObject.set(x, "DeclaredDebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDeclaredFees(value: MoneyData): Self = StObject.set(x, "DeclaredFees", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
