package typings.mangopay2NodejsSdk.payInMod.payIn

import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectDebitDirectPayInData
  extends StObject
     with BasePayInData
     with PayInData {
  
  /**
    * The date the user will be charged. Note that for direct debit payments, it will take one more day more the payment becomes successful
    */
  var ChargeDate: Timestamp
  
  /**
    * The ID of a Mandate
    */
  var MandateId: String
  
  /**
    * A custom description to appear on the user's bank statement.
    * It can be up to 100 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info and note that this functionality is only available for SEPA payments.
    */
  var StatementDescriptor: String
}
object DirectDebitDirectPayInData {
  
  inline def apply(
    AuthorId: String,
    ChargeDate: Timestamp,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    ExecutionType: PayInExecutionType,
    Fees: MoneyData,
    Id: String,
    MandateId: String,
    Nature: TransactionNature,
    PaymentType: PayInPaymentType,
    ResultCode: String,
    ResultMessage: String,
    StatementDescriptor: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): DirectDebitDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], ChargeDate = ChargeDate.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MandateId = MandateId.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectDebitDirectPayInData]
  }
  
  extension [Self <: DirectDebitDirectPayInData](x: Self) {
    
    inline def setChargeDate(value: Timestamp): Self = StObject.set(x, "ChargeDate", value.asInstanceOf[js.Any])
    
    inline def setMandateId(value: String): Self = StObject.set(x, "MandateId", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
  }
}
