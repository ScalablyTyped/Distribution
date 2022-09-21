package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.refundMod.refund.RefundReason
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repudiationMod {
  
  object repudiation {
    
    trait RepudiationData
      extends StObject
         with TransactionData {
      
      /**
        * The initial transaction ID
        */
      var InitialTransactionId: String
      
      /**
        * The initial transaction type
        */
      var InitialTransactionType: TransactionType
      
      /**
        * The nature of the transaction
        */
      @JSName("Nature")
      var Nature_RepudiationData: REPUDIATION
      
      /**
        * Contains info about the reason for refund
        */
      var RefundReason: typings.mangopay2NodejsSdk.refundMod.refund.RefundReason
    }
    object RepudiationData {
      
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
        InitialTransactionId: String,
        InitialTransactionType: TransactionType,
        RefundReason: RefundReason,
        ResultCode: String,
        ResultMessage: String,
        Status: TransactionStatus,
        Tag: String,
        Type: TransactionType
      ): RepudiationData = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = "REPUDIATION", RefundReason = RefundReason.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[RepudiationData]
      }
      
      extension [Self <: RepudiationData](x: Self) {
        
        inline def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
        
        inline def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
        
        inline def setNature(value: REPUDIATION): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
        
        inline def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
      }
    }
  }
}
