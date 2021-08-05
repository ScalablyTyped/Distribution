package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardPreAuthorization {
  
  trait CardPreAuthorizationData
    extends StObject
       with EntityBaseData {
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * Contains useful information related to the user billing
      */
    var Billing: BillingData
    
    /**
      * The ID of a card
      */
    var CardId: String
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData
    
    /**
      * How the PreAuthorization has been executed
      */
    var ExecutionType: PreAuthorizationExecutionType
    
    /**
      * The date when the payment is to be processed by
      */
    var ExpirationDate: Timestamp
    
    /**
      * The Id of the associated PayIn
      */
    var PayInId: String
    
    /**
      * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
      */
    var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus
    
    /**
      * The result code
      */
    var ResultCode: String
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
      * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
      * "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode
    
    /**
      * The value is 'true' if the SecureMode was used
      */
    var SecureModeNeeded: Boolean
    
    /**
      * This is the URL where to redirect users to proceed to 3D secure validation
      */
    var SecureModeRedirectURL: String
    
    /**
      * This is the URL where users are automatically redirected after 3D secure validation (if activated)
      */
    var SecureModeReturnURL: String
    
    /**
      * Contains useful information related to security and fraud
      */
    var SecurityInfo: SecurityInfoData
    
    /**
      * Status of the PreAuthorization
      */
    var Status: PreAuthorizationStatus
  }
  object CardPreAuthorizationData {
    
    inline def apply(
      AuthorId: String,
      Billing: BillingData,
      CardId: String,
      CreationDate: Double,
      DebitedFunds: MoneyData,
      ExecutionType: PreAuthorizationExecutionType,
      ExpirationDate: Timestamp,
      Id: String,
      PayInId: String,
      PaymentStatus: PaymentStatus,
      ResultCode: String,
      ResultMessage: String,
      SecureMode: SecureMode,
      SecureModeNeeded: Boolean,
      SecureModeRedirectURL: String,
      SecureModeReturnURL: String,
      SecurityInfo: SecurityInfoData,
      Status: PreAuthorizationStatus,
      Tag: String
    ): CardPreAuthorizationData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PayInId = PayInId.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardPreAuthorizationData]
    }
    
    extension [Self <: CardPreAuthorizationData](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
      
      inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: PreAuthorizationExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      inline def setPayInId(value: String): Self = StObject.set(x, "PayInId", value.asInstanceOf[js.Any])
      
      inline def setPaymentStatus(value: PaymentStatus): Self = StObject.set(x, "PaymentStatus", value.asInstanceOf[js.Any])
      
      inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      inline def setSecureModeNeeded(value: Boolean): Self = StObject.set(x, "SecureModeNeeded", value.asInstanceOf[js.Any])
      
      inline def setSecureModeRedirectURL(value: String): Self = StObject.set(x, "SecureModeRedirectURL", value.asInstanceOf[js.Any])
      
      inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
      
      inline def setSecurityInfo(value: SecurityInfoData): Self = StObject.set(x, "SecurityInfo", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PreAuthorizationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag' | 'Billing' | 'SecureMode', 'AuthorId' | 'DebitedFunds' | 'CardId' | 'SecureModeReturnURL'> */
  trait CreateCardPreAuthorization extends StObject {
    
    var AuthorId: String
    
    var Billing: js.UndefOr[BillingData] = js.undefined
    
    var CardId: String
    
    var DebitedFunds: MoneyData
    
    var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.undefined
    
    var SecureModeReturnURL: String
    
    var Tag: js.UndefOr[String] = js.undefined
  }
  object CreateCardPreAuthorization {
    
    inline def apply(AuthorId: String, CardId: String, DebitedFunds: MoneyData, SecureModeReturnURL: String): CreateCardPreAuthorization = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardPreAuthorization]
    }
    
    extension [Self <: CreateCardPreAuthorization](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
      
      inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
      
      inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
      
      inline def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag', 'PaymentStatus' | 'Id'> */
  trait UpdateCardPreAuthorization extends StObject {
    
    var Id: String
    
    var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus
    
    var Tag: js.UndefOr[String] = js.undefined
  }
  object UpdateCardPreAuthorization {
    
    inline def apply(Id: String, PaymentStatus: PaymentStatus): UpdateCardPreAuthorization = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCardPreAuthorization]
    }
    
    extension [Self <: UpdateCardPreAuthorization](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setPaymentStatus(value: PaymentStatus): Self = StObject.set(x, "PaymentStatus", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
