package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispute {
  
  @js.native
  trait DisputeData extends EntityBaseData {
    
    /**
      * The deadline by which you must contest the dispute (if you wish to contest it)
      */
    var ContestDeadlineDate: Timestamp = js.native
    
    /**
      * The amount you wish to contest
      */
    var ContestedFunds: MoneyData = js.native
    
    /**
      * Info about the reason for the dispute
      */
    var DisputeReason: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason = js.native
    
    /**
      * The type of dispute
      */
    var DisputeType: typings.mangopay2NodejsSdk.mod.dispute.DisputeType = js.native
    
    /**
      * The amount of funds that were disputed
      */
    var DisputedFunds: MoneyData = js.native
    
    /**
      * The initial transaction ID
      */
    var InitialTransactionId: String = js.native
    
    /**
      * The initial transaction type
      */
    var InitialTransactionType: TransactionType = js.native
    
    /**
      * The ID of the associated repudiation transaction
      */
    var RepudiationId: String = js.native
    
    /**
      * The result code
      */
    var ResultCode: String = js.native
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String = js.native
    
    /**
      * The status of the dispute
      */
    var Status: DisputeStatus = js.native
    
    /**
      * Used to communicate information about the dispute status to you
      */
    var StatusMessage: String = js.native
  }
  object DisputeData {
    
    @scala.inline
    def apply(
      ContestDeadlineDate: Timestamp,
      ContestedFunds: MoneyData,
      CreationDate: Double,
      DisputeReason: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason,
      DisputeType: DisputeType,
      DisputedFunds: MoneyData,
      Id: String,
      InitialTransactionId: String,
      InitialTransactionType: TransactionType,
      RepudiationId: String,
      ResultCode: String,
      ResultMessage: String,
      Status: DisputeStatus,
      StatusMessage: String,
      Tag: String
    ): DisputeData = {
      val __obj = js.Dynamic.literal(ContestDeadlineDate = ContestDeadlineDate.asInstanceOf[js.Any], ContestedFunds = ContestedFunds.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DisputeReason = DisputeReason.asInstanceOf[js.Any], DisputeType = DisputeType.asInstanceOf[js.Any], DisputedFunds = DisputedFunds.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], RepudiationId = RepudiationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusMessage = StatusMessage.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisputeData]
    }
    
    @scala.inline
    implicit class DisputeDataMutableBuilder[Self <: DisputeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContestDeadlineDate(value: Timestamp): Self = StObject.set(x, "ContestDeadlineDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContestedFunds(value: MoneyData): Self = StObject.set(x, "ContestedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputeReason(value: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason): Self = StObject.set(x, "DisputeReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputeType(value: DisputeType): Self = StObject.set(x, "DisputeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputedFunds(value: MoneyData): Self = StObject.set(x, "DisputedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DisputeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisputeReason extends StObject {
    
    var DisputeReasonMessage: String = js.native
    
    var DisputeReasonType: typings.mangopay2NodejsSdk.mod.dispute.DisputeReasonType = js.native
  }
  object DisputeReason {
    
    @scala.inline
    def apply(DisputeReasonMessage: String, DisputeReasonType: DisputeReasonType): typings.mangopay2NodejsSdk.mod.dispute.DisputeReason = {
      val __obj = js.Dynamic.literal(DisputeReasonMessage = DisputeReasonMessage.asInstanceOf[js.Any], DisputeReasonType = DisputeReasonType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.dispute.DisputeReason]
    }
    
    @scala.inline
    implicit class DisputeReasonMutableBuilder[Self <: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisputeReasonMessage(value: String): Self = StObject.set(x, "DisputeReasonMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputeReasonType(value: DisputeReasonType): Self = StObject.set(x, "DisputeReasonType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED
  */
  trait DisputeReasonType extends StObject
  object DisputeReasonType {
    
    @scala.inline
    def AUTHORISATION_DISPUTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED = "AUTHORISATION_DISPUTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED]
    
    @scala.inline
    def CANCELED_REOCCURING_TRANSACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION = "CANCELED_REOCCURING_TRANSACTION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION]
    
    @scala.inline
    def DUPLICATE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE = "DUPLICATE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE]
    
    @scala.inline
    def FRAUD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD = "FRAUD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD]
    
    @scala.inline
    def LATE_FAILURE_BANKACCOUNT_CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED = "LATE_FAILURE_BANKACCOUNT_CLOSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED]
    
    @scala.inline
    def LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE = "LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE]
    
    @scala.inline
    def LATE_FAILURE_BANKACCOUNT_INCORRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT = "LATE_FAILURE_BANKACCOUNT_INCORRECT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT]
    
    @scala.inline
    def LATE_FAILURE_CONTACT_USER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER = "LATE_FAILURE_CONTACT_USER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER]
    
    @scala.inline
    def LATE_FAILURE_INSUFFICIENT_FUNDS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS = "LATE_FAILURE_INSUFFICIENT_FUNDS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS]
    
    @scala.inline
    def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    
    @scala.inline
    def PRODUCT_NOT_PROVIDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED = "PRODUCT_NOT_PROVIDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED]
    
    @scala.inline
    def PRODUCT_UNACCEPTABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE = "PRODUCT_UNACCEPTABLE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE]
    
    @scala.inline
    def REFUND_CONVERSION_RATE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE = "REFUND_CONVERSION_RATE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE]
    
    @scala.inline
    def REFUND_NOT_PROCESSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED = "REFUND_NOT_PROCESSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED]
    
    @scala.inline
    def TRANSACTION_NOT_RECOGNIZED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED = "TRANSACTION_NOT_RECOGNIZED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED]
    
    @scala.inline
    def UNKNOWN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED
  */
  trait DisputeStatus extends StObject
  object DisputeStatus {
    
    @scala.inline
    def CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED = "CLOSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED]
    
    @scala.inline
    def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
    
    @scala.inline
    def PENDING_BANK_ACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION = "PENDING_BANK_ACTION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION]
    
    @scala.inline
    def PENDING_CLIENT_ACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION = "PENDING_CLIENT_ACTION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION]
    
    @scala.inline
    def REOPENED_PENDING_CLIENT_ACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION = "REOPENED_PENDING_CLIENT_ACTION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION]
    
    @scala.inline
    def SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL
  */
  trait DisputeType extends StObject
  object DisputeType {
    
    @scala.inline
    def CONTESTABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE = "CONTESTABLE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE]
    
    @scala.inline
    def NOT_CONTESTABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE = "NOT_CONTESTABLE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE]
    
    @scala.inline
    def RETRIEVAL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL = "RETRIEVAL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL]
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData, 'ContestedFunds'> */
  @js.native
  trait SubmitDispute extends StObject {
    
    var ContestedFunds: js.UndefOr[MoneyData] = js.native
  }
  object SubmitDispute {
    
    @scala.inline
    def apply(): SubmitDispute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubmitDispute]
    }
    
    @scala.inline
    implicit class SubmitDisputeMutableBuilder[Self <: SubmitDispute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContestedFunds(value: MoneyData): Self = StObject.set(x, "ContestedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContestedFundsUndefined: Self = StObject.set(x, "ContestedFunds", js.undefined)
    }
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData, 'Tag'> */
  @js.native
  trait UpdateDispute extends StObject {
    
    var Tag: js.UndefOr[String] = js.native
  }
  object UpdateDispute {
    
    @scala.inline
    def apply(): UpdateDispute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDispute]
    }
    
    @scala.inline
    implicit class UpdateDisputeMutableBuilder[Self <: UpdateDispute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
