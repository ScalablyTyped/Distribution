package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transfer {
  
  @js.native
  trait CreateTransfer extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    /**
      * The ID of the wallet that was debited
      */
    var DebitedWalletId: String = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    /**
      * Custom data that you can add to this item
      */
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateTransfer {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      Fees: MoneyData
    ): CreateTransfer = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTransfer]
    }
    
    @scala.inline
    implicit class CreateTransferMutableBuilder[Self <: CreateTransfer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait TransferData extends EntityBaseData {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
      */
    var CreditedFunds: MoneyData = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: String = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    /**
      * The ID of the wallet that was debited
      */
    var DebitedWalletId: String = js.native
    
    /**
      * When the transaction happened
      */
    var ExecutionDate: Timestamp = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    /**
      * The nature of the transaction
      */
    var Nature: TransactionNature = js.native
    
    /**
      * The result code
      */
    var ResultCode: String = js.native
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String = js.native
    
    /**
      * The status of the transaction
      */
    var Status: TransactionStatus = js.native
    
    /**
      * The type of the transaction
      */
    var Type: TRANSFER = js.native
  }
  object TransferData {
    
    @scala.inline
    def apply(
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
      Type: TRANSFER
    ): TransferData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferData]
    }
    
    @scala.inline
    implicit class TransferDataMutableBuilder[Self <: TransferData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TRANSFER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
