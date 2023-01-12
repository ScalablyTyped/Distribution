package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.typingsBaseMod.base.BrowserInfoData
import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingData
import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsSecurityInfoMod.securityInfo.SecurityInfoData
import typings.mangopay2NodejsSdk.typingsModelsShippingMod.shipping.ShippingData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsCardPreauthorizationMod {
  
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
        * This object describes the Browser being user by an end user
        */
      var BrowserInfo: BrowserInfoData
      
      /**
        * The ID of a card
        */
      var CardId: String
      
      /**
        * The language to use for the payment page - needs to be the ISO code of the language
        */
      var Culture: CountryISO
      
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
        * IP Address of the end user (format IPV4 or IPV6)
        */
      var IpAddress: String
      
      /**
        * The Id of the associated PayIn
        */
      var PayInId: String
      
      /**
        * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
        */
      var PaymentStatus: typings.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.PaymentStatus
      
      /**
        * Value of the funds remaining on a pre-authorization
        */
      var RemainingFunds: MoneyData
      
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
      var SecureMode: typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
      
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
        * Contains every useful information's related to the user shipping
        */
      var Shipping: ShippingData
      
      /**
        * A custom description to appear on the user's bank statement.
        * It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
        * See here for important info. Note that each bank handles this information differently, some show less or no information.
        */
      var StatementDescriptor: String
      
      /**
        * Status of the PreAuthorization
        */
      var Status: PreAuthorizationStatus
    }
    object CardPreAuthorizationData {
      
      inline def apply(
        AuthorId: String,
        Billing: BillingData,
        BrowserInfo: BrowserInfoData,
        CardId: String,
        CreationDate: Double,
        Culture: CountryISO,
        DebitedFunds: MoneyData,
        ExecutionType: PreAuthorizationExecutionType,
        ExpirationDate: Timestamp,
        Id: String,
        IpAddress: String,
        PayInId: String,
        PaymentStatus: PaymentStatus,
        RemainingFunds: MoneyData,
        ResultCode: String,
        ResultMessage: String,
        SecureMode: SecureMode,
        SecureModeNeeded: Boolean,
        SecureModeRedirectURL: String,
        SecureModeReturnURL: String,
        SecurityInfo: SecurityInfoData,
        Shipping: ShippingData,
        StatementDescriptor: String,
        Status: PreAuthorizationStatus,
        Tag: String
      ): CardPreAuthorizationData = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], BrowserInfo = BrowserInfo.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], PayInId = PayInId.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any], RemainingFunds = RemainingFunds.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], Shipping = Shipping.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[CardPreAuthorizationData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CardPreAuthorizationData] (val x: Self) extends AnyVal {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
        
        inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
        
        inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
        
        inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setExecutionType(value: PreAuthorizationExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
        
        inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
        
        inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
        
        inline def setPayInId(value: String): Self = StObject.set(x, "PayInId", value.asInstanceOf[js.Any])
        
        inline def setPaymentStatus(value: PaymentStatus): Self = StObject.set(x, "PaymentStatus", value.asInstanceOf[js.Any])
        
        inline def setRemainingFunds(value: MoneyData): Self = StObject.set(x, "RemainingFunds", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
        
        inline def setSecureModeNeeded(value: Boolean): Self = StObject.set(x, "SecureModeNeeded", value.asInstanceOf[js.Any])
        
        inline def setSecureModeRedirectURL(value: String): Self = StObject.set(x, "SecureModeRedirectURL", value.asInstanceOf[js.Any])
        
        inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
        
        inline def setSecurityInfo(value: SecurityInfoData): Self = StObject.set(x, "SecurityInfo", value.asInstanceOf[js.Any])
        
        inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
        
        inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: PreAuthorizationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/cardPreauthorization.cardPreAuthorization.CardPreAuthorizationData, 'Tag' | 'Billing' | 'SecureMode' | 'Culture' | 'StatementDescriptor' | 'Shipping', 'AuthorId' | 'DebitedFunds' | 'CardId' | 'SecureModeReturnURL' | 'IpAddress' | 'BrowserInfo'> */
    trait CreateCardPreAuthorization extends StObject {
      
      var AuthorId: String
      
      var Billing: js.UndefOr[BillingData] = js.undefined
      
      var BrowserInfo: BrowserInfoData
      
      var CardId: String
      
      var Culture: js.UndefOr[CountryISO] = js.undefined
      
      var DebitedFunds: MoneyData
      
      var IpAddress: String
      
      var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode] = js.undefined
      
      var SecureModeReturnURL: String
      
      var Shipping: js.UndefOr[ShippingData] = js.undefined
      
      var StatementDescriptor: js.UndefOr[String] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateCardPreAuthorization {
      
      inline def apply(
        AuthorId: String,
        BrowserInfo: BrowserInfoData,
        CardId: String,
        DebitedFunds: MoneyData,
        IpAddress: String,
        SecureModeReturnURL: String
      ): CreateCardPreAuthorization = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BrowserInfo = BrowserInfo.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateCardPreAuthorization]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CreateCardPreAuthorization] (val x: Self) extends AnyVal {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
        
        inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
        
        inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
        
        inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
        
        inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
        
        inline def setCultureUndefined: Self = StObject.set(x, "Culture", js.undefined)
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
        
        inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
        
        inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
        
        inline def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
        
        inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
        
        inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
        
        inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
        
        inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
    */
    trait PaymentStatus extends StObject
    object PaymentStatus {
      
      inline def CANCELED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED]
      
      inline def EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED]
      
      inline def VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = "VALIDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED]
      
      inline def WAITING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING = "WAITING".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING]
    }
    
    type PreAuthorizationExecutionType = DIRECT
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
    */
    trait PreAuthorizationStatus extends StObject
    object PreAuthorizationStatus {
      
      inline def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = "FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED]
      
      inline def SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED]
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/cardPreauthorization.cardPreAuthorization.CardPreAuthorizationData, 'Tag', 'PaymentStatus' | 'Id'> */
    trait UpdateCardPreAuthorization extends StObject {
      
      var Id: String
      
      var PaymentStatus: typings.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.PaymentStatus
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object UpdateCardPreAuthorization {
      
      inline def apply(Id: String, PaymentStatus: PaymentStatus): UpdateCardPreAuthorization = {
        val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateCardPreAuthorization]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UpdateCardPreAuthorization] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setPaymentStatus(value: PaymentStatus): Self = StObject.set(x, "PaymentStatus", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
  }
}
