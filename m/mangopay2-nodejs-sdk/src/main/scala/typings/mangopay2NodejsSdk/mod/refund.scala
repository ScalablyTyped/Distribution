package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
import typings.mangopay2NodejsSdk.mod.transaction.TransactionData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refund {
  
  @js.native
  trait CreatePayInRefund extends StObject {
    
    var AuthorId: String = js.native
    
    var DebitedFunds: js.UndefOr[MoneyData] = js.native
    
    var Fees: js.UndefOr[MoneyData] = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreatePayInRefund {
    
    @scala.inline
    def apply(AuthorId: String): CreatePayInRefund = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePayInRefund]
    }
    
    @scala.inline
    implicit class CreatePayInRefundMutableBuilder[Self <: CreatePayInRefund] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait CreateTransferRefund extends StObject {
    
    var AuthorId: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateTransferRefund {
    
    @scala.inline
    def apply(AuthorId: String): CreateTransferRefund = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTransferRefund]
    }
    
    @scala.inline
    implicit class CreateTransferRefundMutableBuilder[Self <: CreateTransferRefund] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait RefundData extends TransactionData {
    
    /**
      * The initial transaction ID
      */
    var InitialTransactionId: String = js.native
    
    /**
      * The initial transaction type
      */
    var InitialTransactionType: TransactionType = js.native
    
    /**
      * The nature of the transaction
      */
    @JSName("Nature")
    var Nature_RefundData: REFUND = js.native
    
    /**
      * Contains info about the reason for refund
      */
    var RefundReason: typings.mangopay2NodejsSdk.mod.refund.RefundReason = js.native
  }
  object RefundData {
    
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
      InitialTransactionId: String,
      InitialTransactionType: TransactionType,
      Nature: REFUND,
      RefundReason: RefundReason,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): RefundData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], RefundReason = RefundReason.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefundData]
    }
    
    @scala.inline
    implicit class RefundDataMutableBuilder[Self <: RefundData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: REFUND): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefundReason extends StObject {
    
    var RefundReasonType: typings.mangopay2NodejsSdk.mod.refund.RefundReasonType = js.native
  }
  object RefundReason {
    
    @scala.inline
    def apply(RefundReasonType: RefundReasonType): RefundReason = {
      val __obj = js.Dynamic.literal(RefundReasonType = RefundReasonType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefundReason]
    }
    
    @scala.inline
    implicit class RefundReasonMutableBuilder[Self <: RefundReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefundReasonType(value: RefundReasonType): Self = StObject.set(x, "RefundReasonType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  */
  trait RefundReasonType extends StObject
  object RefundReasonType {
    
    @scala.inline
    def BANKACCOUNT_HAS_BEEN_CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED = "BANKACCOUNT_HAS_BEEN_CLOSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED]
    
    @scala.inline
    def BANKACCOUNT_INCORRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT = "BANKACCOUNT_INCORRECT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT]
    
    @scala.inline
    def INITIALIZED_BY_CLIENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT = "INITIALIZED_BY_CLIENT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT]
    
    @scala.inline
    def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    
    @scala.inline
    def OWNER_DO_NOT_MATCH_BANKACCOUNT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT = "OWNER_DO_NOT_MATCH_BANKACCOUNT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT]
    
    @scala.inline
    def WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS = "WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS]
  }
}
