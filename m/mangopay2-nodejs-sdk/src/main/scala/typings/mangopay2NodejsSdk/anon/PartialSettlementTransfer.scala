package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReason
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/settlementTransfer.settlementTransfer.SettlementTransferData> */
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
  
  var RefundReason: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReason] = js.undefined
  
  var RepudiationId: js.UndefOr[String] = js.undefined
  
  var ResultCode: js.UndefOr[String] = js.undefined
  
  var ResultMessage: js.UndefOr[String] = js.undefined
  
  var Status: js.UndefOr[TransactionStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var Type: js.UndefOr[TransactionType] = js.undefined
}
object PartialSettlementTransfer {
  
  inline def apply(): PartialSettlementTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSettlementTransfer]
  }
  
  extension [Self <: PartialSettlementTransfer](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
    
    inline def setCreditedFundsUndefined: Self = StObject.set(x, "CreditedFunds", js.undefined)
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setCreditedWalletIdUndefined: Self = StObject.set(x, "CreditedWalletId", js.undefined)
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedWalletIdUndefined: Self = StObject.set(x, "DebitedWalletId", js.undefined)
    
    inline def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setExecutionDateUndefined: Self = StObject.set(x, "ExecutionDate", js.undefined)
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
    
    inline def setInitialTransactionIdUndefined: Self = StObject.set(x, "InitialTransactionId", js.undefined)
    
    inline def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
    
    inline def setInitialTransactionTypeUndefined: Self = StObject.set(x, "InitialTransactionType", js.undefined)
    
    inline def setNature(value: SETTLEMENT): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
    
    inline def setNatureUndefined: Self = StObject.set(x, "Nature", js.undefined)
    
    inline def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
    
    inline def setRefundReasonUndefined: Self = StObject.set(x, "RefundReason", js.undefined)
    
    inline def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
    
    inline def setRepudiationIdUndefined: Self = StObject.set(x, "RepudiationId", js.undefined)
    
    inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    inline def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
