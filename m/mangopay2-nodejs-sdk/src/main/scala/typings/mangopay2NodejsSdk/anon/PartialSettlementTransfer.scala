package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.refund.RefundReason
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.settlementTransfer.SettlementTransferData> */
trait PartialSettlementTransfer extends StObject {
  
  var AuthorId: js.UndefOr[String] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var CreditedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  var CreditedWalletId: js.UndefOr[String] = js.undefined
  
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var DebitedWalletId: js.UndefOr[String] = js.undefined
  
  var ExecutionDate: js.UndefOr[Timestamp] = js.undefined
  
  var Fees: js.UndefOr[MoneyData] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var InitialTransactionId: js.UndefOr[String] = js.undefined
  
  var InitialTransactionType: js.UndefOr[TransactionType] = js.undefined
  
  var Nature: js.UndefOr[SETTLEMENT] = js.undefined
  
  var RefundReason: js.UndefOr[typings.mangopay2NodejsSdk.mod.refund.RefundReason] = js.undefined
  
  var RepudiationId: js.UndefOr[String] = js.undefined
  
  var ResultCode: js.UndefOr[String] = js.undefined
  
  var ResultMessage: js.UndefOr[String] = js.undefined
  
  var Status: js.UndefOr[TransactionStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var Type: js.UndefOr[TransactionType] = js.undefined
}
object PartialSettlementTransfer {
  
  @scala.inline
  def apply(): PartialSettlementTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSettlementTransfer]
  }
  
  @scala.inline
  implicit class PartialSettlementTransferMutableBuilder[Self <: PartialSettlementTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedFundsUndefined: Self = StObject.set(x, "CreditedFunds", js.undefined)
    
    @scala.inline
    def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    @scala.inline
    def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedWalletIdUndefined: Self = StObject.set(x, "CreditedWalletId", js.undefined)
    
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    @scala.inline
    def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedWalletIdUndefined: Self = StObject.set(x, "DebitedWalletId", js.undefined)
    
    @scala.inline
    def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionDateUndefined: Self = StObject.set(x, "ExecutionDate", js.undefined)
    
    @scala.inline
    def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTransactionIdUndefined: Self = StObject.set(x, "InitialTransactionId", js.undefined)
    
    @scala.inline
    def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTransactionTypeUndefined: Self = StObject.set(x, "InitialTransactionType", js.undefined)
    
    @scala.inline
    def setNature(value: SETTLEMENT): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatureUndefined: Self = StObject.set(x, "Nature", js.undefined)
    
    @scala.inline
    def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundReasonUndefined: Self = StObject.set(x, "RefundReason", js.undefined)
    
    @scala.inline
    def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepudiationIdUndefined: Self = StObject.set(x, "RepudiationId", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
