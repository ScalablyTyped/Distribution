package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsTransactionMod {
  
  object transaction {
    
    trait TransactionData
      extends StObject
         with EntityBaseData {
      
      /**
        * A user's ID
        */
      var AuthorId: String
      
      /**
        * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
        */
      var CreditedFunds: MoneyData
      
      /**
        * The user ID who is credited (defaults to the owner of the wallet)
        */
      var CreditedUserId: String
      
      /**
        * The ID of the wallet where money will be credited
        */
      var CreditedWalletId: String
      
      /**
        * Information about the funds that are being debited
        */
      var DebitedFunds: MoneyData
      
      /**
        * The ID of the wallet that was debited
        */
      var DebitedWalletId: String
      
      /**
        * When the transaction happened
        */
      var ExecutionDate: Timestamp
      
      /**
        * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
        */
      var Fees: MoneyData
      
      /**
        * The nature of the transaction
        */
      var Nature: TransactionNature
      
      /**
        * The result code
        */
      var ResultCode: String
      
      /**
        * A verbal explanation of the ResultCode
        */
      var ResultMessage: String
      
      /**
        * The status of the transaction
        */
      var Status: TransactionStatus
      
      /**
        * The type of the transaction
        */
      var Type: TransactionType
    }
    object TransactionData {
      
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
        ResultCode: String,
        ResultMessage: String,
        Status: TransactionStatus,
        Tag: String,
        Type: TransactionType
      ): TransactionData = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[TransactionData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TransactionData] (val x: Self) extends AnyVal {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
        
        inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
        
        inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
        
        inline def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
        
        inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
        
        inline def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
    */
    trait TransactionNature extends StObject
    object TransactionNature {
      
      inline def REFUND: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND = "REFUND".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND]
      
      inline def REGULAR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR = "REGULAR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR]
      
      inline def REPUDIATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION = "REPUDIATION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION]
      
      inline def SETTLEMENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT = "SETTLEMENT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
    */
    trait TransactionStatus extends StObject
    object TransactionStatus {
      
      inline def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = "FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED]
      
      inline def SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
    */
    trait TransactionType extends StObject
    object TransactionType {
      
      inline def PAYIN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN = "PAYIN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN]
      
      inline def PAYOUT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT = "PAYOUT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT]
      
      inline def TRANSFER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER = "TRANSFER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER]
    }
  }
}
