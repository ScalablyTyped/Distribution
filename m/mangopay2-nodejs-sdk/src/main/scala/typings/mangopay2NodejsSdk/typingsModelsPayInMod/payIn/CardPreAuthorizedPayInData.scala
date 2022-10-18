package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardPreAuthorizedPayInData
  extends StObject
     with BasePayInData
     with PayInData {
  
  @JSName("ExecutionType")
  var ExecutionType_CardPreAuthorizedPayInData: DIRECT
  
  @JSName("PaymentType")
  var PaymentType_CardPreAuthorizedPayInData: PREAUTHORIZED
  
  var PreauthorizationId: String
}
object CardPreAuthorizedPayInData {
  
  inline def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PreauthorizationId: String,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): CardPreAuthorizedPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "PREAUTHORIZED", PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPreAuthorizedPayInData]
  }
  
  extension [Self <: CardPreAuthorizedPayInData](x: Self) {
    
    inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: PREAUTHORIZED): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setPreauthorizationId(value: String): Self = StObject.set(x, "PreauthorizationId", value.asInstanceOf[js.Any])
  }
}
