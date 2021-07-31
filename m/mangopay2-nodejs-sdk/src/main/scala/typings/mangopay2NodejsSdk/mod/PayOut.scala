package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PayOut {
  
  trait CreatePayOut extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * An ID of a Bank Account
      */
    var BankAccountId: String
    
    /**
      * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
      */
    var BankWireRef: js.UndefOr[String] = js.undefined
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData
    
    /**
      * The ID of the wallet that was debited
      */
    var DebitedWalletId: String
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData
    
    var Tag: js.UndefOr[String] = js.undefined
  }
  object CreatePayOut {
    
    @scala.inline
    def apply(
      AuthorId: String,
      BankAccountId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      Fees: MoneyData
    ): CreatePayOut = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePayOut]
    }
    
    @scala.inline
    implicit class CreatePayOutMutableBuilder[Self <: CreatePayOut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankWireRef(value: String): Self = StObject.set(x, "BankWireRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankWireRefUndefined: Self = StObject.set(x, "BankWireRef", js.undefined)
      
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
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.TransferData, 'Type'> */
  trait PayOutData extends StObject {
    
    var AuthorId: String
    
    /**
      * An ID of a Bank Account
      */
    var BankAccountId: String
    
    /**
      * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
      */
    var BankWireRef: String
    
    var CreationDate: Double
    
    var CreditedFunds: MoneyData
    
    var CreditedUserId: String
    
    var CreditedWalletId: String
    
    var DebitedFunds: MoneyData
    
    var DebitedWalletId: String
    
    var ExecutionDate: Timestamp
    
    var Fees: MoneyData
    
    var Id: String
    
    var Nature: TransactionNature
    
    var PaymentType: BANK_WIRE
    
    var ResultCode: String
    
    var ResultMessage: String
    
    var Status: TransactionStatus
    
    var Tag: String
    
    /**
      * The type of the transaction
      */
    var Type: PAYOUT
  }
  object PayOutData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      BankAccountId: String,
      BankWireRef: String,
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
      Tag: String
    ): PayOutData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], BankWireRef = BankWireRef.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "BANK_WIRE", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = "PAYOUT")
      __obj.asInstanceOf[PayOutData]
    }
    
    @scala.inline
    implicit class PayOutDataMutableBuilder[Self <: PayOutData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankWireRef(value: String): Self = StObject.set(x, "BankWireRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
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
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PAYOUT): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
