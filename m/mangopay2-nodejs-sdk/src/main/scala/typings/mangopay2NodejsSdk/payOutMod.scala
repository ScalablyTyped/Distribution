package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.baseMod.base.FallbackReasonData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payOutMod {
  
  object payOut {
    
    trait CheckPayOutEligibility extends StObject {
      
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
      var Fees: js.UndefOr[MoneyData] = js.undefined
      
      var PaymentType: BANK_WIRE
      
      /**
        * Payout mode requested. May take one of the following values:
        * STANDARD (value by default if no parameter is sent): a standard bank wire is requested and the processing time of the funds is about 48 hours;
        * INSTANT_PAYMENT: an instant payment bank wire is requested and the processing time is within 25 seconds (subject to prerequisites)
        * INSTANT_PAYMENT_ONLY: an instant payment bank wire is requested and the processing time is within 25 seconds,
        * but if any prerequisite is not met or another problem occurs, there is no fallback: the wallet is automatically refunded and the payout is not completed.
        */
      var PayoutModeRequested: PayoutModeRequestedType
    }
    object CheckPayOutEligibility {
      
      inline def apply(
        AuthorId: String,
        BankAccountId: String,
        DebitedFunds: MoneyData,
        DebitedWalletId: String,
        PayoutModeRequested: PayoutModeRequestedType
      ): CheckPayOutEligibility = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], PaymentType = "BANK_WIRE", PayoutModeRequested = PayoutModeRequested.asInstanceOf[js.Any])
        __obj.asInstanceOf[CheckPayOutEligibility]
      }
      
      extension [Self <: CheckPayOutEligibility](x: Self) {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
        
        inline def setBankWireRef(value: String): Self = StObject.set(x, "BankWireRef", value.asInstanceOf[js.Any])
        
        inline def setBankWireRefUndefined: Self = StObject.set(x, "BankWireRef", js.undefined)
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
        
        inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
        
        inline def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
        
        inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
        
        inline def setPayoutModeRequested(value: PayoutModeRequestedType): Self = StObject.set(x, "PayoutModeRequested", value.asInstanceOf[js.Any])
      }
    }
    
    trait CheckPayOutEligibilityData extends StObject {
      
      var InstantPayout: InstantPayOutEligibilityData
    }
    object CheckPayOutEligibilityData {
      
      inline def apply(InstantPayout: InstantPayOutEligibilityData): CheckPayOutEligibilityData = {
        val __obj = js.Dynamic.literal(InstantPayout = InstantPayout.asInstanceOf[js.Any])
        __obj.asInstanceOf[CheckPayOutEligibilityData]
      }
      
      extension [Self <: CheckPayOutEligibilityData](x: Self) {
        
        inline def setInstantPayout(value: InstantPayOutEligibilityData): Self = StObject.set(x, "InstantPayout", value.asInstanceOf[js.Any])
      }
    }
    
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
      
      var PaymentType: BANK_WIRE
      
      /**
        * Payout mode requested. May take one of the following values:
        * STANDARD (value by default if no parameter is sent): a standard bank wire is requested and the processing time of the funds is about 48 hours;
        * INSTANT_PAYMENT: an instant payment bank wire is requested and the processing time is within 25 seconds (subject to prerequisites)
        * INSTANT_PAYMENT_ONLY: an instant payment bank wire is requested and the processing time is within 25 seconds,
        * but if any prerequisite is not met or another problem occurs, there is no fallback: the wallet is automatically refunded and the payout is not completed.
        */
      var PayoutModeRequested: js.UndefOr[PayoutModeRequestedType] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreatePayOut {
      
      inline def apply(
        AuthorId: String,
        BankAccountId: String,
        DebitedFunds: MoneyData,
        DebitedWalletId: String,
        Fees: MoneyData
      ): CreatePayOut = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = "BANK_WIRE")
        __obj.asInstanceOf[CreatePayOut]
      }
      
      extension [Self <: CreatePayOut](x: Self) {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
        
        inline def setBankWireRef(value: String): Self = StObject.set(x, "BankWireRef", value.asInstanceOf[js.Any])
        
        inline def setBankWireRefUndefined: Self = StObject.set(x, "BankWireRef", js.undefined)
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
        
        inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
        
        inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
        
        inline def setPayoutModeRequested(value: PayoutModeRequestedType): Self = StObject.set(x, "PayoutModeRequested", value.asInstanceOf[js.Any])
        
        inline def setPayoutModeRequestedUndefined: Self = StObject.set(x, "PayoutModeRequested", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait InstantPayOutEligibilityData extends StObject {
      
      var IsReachable: Boolean
      
      var UnreachableReason: js.UndefOr[FallbackReasonData] = js.undefined
    }
    object InstantPayOutEligibilityData {
      
      inline def apply(IsReachable: Boolean): InstantPayOutEligibilityData = {
        val __obj = js.Dynamic.literal(IsReachable = IsReachable.asInstanceOf[js.Any])
        __obj.asInstanceOf[InstantPayOutEligibilityData]
      }
      
      extension [Self <: InstantPayOutEligibilityData](x: Self) {
        
        inline def setIsReachable(value: Boolean): Self = StObject.set(x, "IsReachable", value.asInstanceOf[js.Any])
        
        inline def setUnreachableReason(value: FallbackReasonData): Self = StObject.set(x, "UnreachableReason", value.asInstanceOf[js.Any])
        
        inline def setUnreachableReasonUndefined: Self = StObject.set(x, "UnreachableReason", js.undefined)
      }
    }
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/transfer.transfer.TransferData, 'Type'> */
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
      
      inline def apply(
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
      
      extension [Self <: PayOutData](x: Self) {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
        
        inline def setBankWireRef(value: String): Self = StObject.set(x, "BankWireRef", value.asInstanceOf[js.Any])
        
        inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
        
        inline def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
        
        inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
        
        inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
        
        inline def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
        
        inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
        
        inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setType(value: PAYOUT): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STANDARD
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYMENT
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYMENT_ONLY
    */
    trait PayoutModeRequestedType extends StObject
    object PayoutModeRequestedType {
      
      inline def INSTANT_PAYMENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYMENT = "INSTANT_PAYMENT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYMENT]
      
      inline def INSTANT_PAYMENT_ONLY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYMENT_ONLY = "INSTANT_PAYMENT_ONLY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYMENT_ONLY]
      
      inline def STANDARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STANDARD = "STANDARD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STANDARD]
    }
  }
}
