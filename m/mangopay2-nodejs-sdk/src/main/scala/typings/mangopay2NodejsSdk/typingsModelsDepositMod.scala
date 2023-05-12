package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.BrowserInfoData
import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.CompleteBillingData
import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInExecutionType
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInPaymentType
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.`3DSVersion`
import typings.mangopay2NodejsSdk.typingsModelsShippingMod.shipping.ShippingData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsDepositMod {
  
  object deposit {
    
    trait CreateDeposit extends StObject {
      
      var AuthorId: String
      
      var Billing: js.UndefOr[CompleteBillingData] = js.undefined
      
      var BrowserInfo: BrowserInfoData
      
      var CardId: String
      
      var Culture: js.UndefOr[CountryISO] = js.undefined
      
      var DebitedFunds: MoneyData
      
      var IpAddress: String
      
      var SecureModeReturnURL: String
      
      var Shipping: js.UndefOr[ShippingData] = js.undefined
      
      var StatementDescriptor: js.UndefOr[String] = js.undefined
    }
    object CreateDeposit {
      
      inline def apply(
        AuthorId: String,
        BrowserInfo: BrowserInfoData,
        CardId: String,
        DebitedFunds: MoneyData,
        IpAddress: String,
        SecureModeReturnURL: String
      ): CreateDeposit = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BrowserInfo = BrowserInfo.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateDeposit]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CreateDeposit] (val x: Self) extends AnyVal {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBilling(value: CompleteBillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
        
        inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
        
        inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
        
        inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
        
        inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
        
        inline def setCultureUndefined: Self = StObject.set(x, "Culture", js.undefined)
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
        
        inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
        
        inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
        
        inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
        
        inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
        
        inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
      }
    }
    
    trait DepositData
      extends StObject
         with EntityBaseData {
      
      var Applied3DSVersion: `3DSVersion`
      
      var AuthorId: String
      
      var Billing: CompleteBillingData
      
      var BrowserInfo: BrowserInfoData
      
      var CardId: String
      
      var Culture: CountryISO
      
      var DebitedFunds: MoneyData
      
      var ExecutionType: PayInExecutionType
      
      var ExpirationDate: Timestamp
      
      var IpAddress: String
      
      var PayinsLinked: PayinsLinkedData
      
      var PaymentStatus: typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.PaymentStatus
      
      var PaymentType: PayInPaymentType
      
      var Requested3DSVersion: `3DSVersion`
      
      var ResultCode: String
      
      var ResultMessage: String
      
      var SecureModeNeeded: Boolean
      
      var SecureModeRedirectURL: String
      
      var SecureModeReturnURL: String
      
      var Shipping: ShippingData
      
      var StatementDescriptor: String
      
      var Status: DepositStatus
    }
    object DepositData {
      
      inline def apply(
        Applied3DSVersion: `3DSVersion`,
        AuthorId: String,
        Billing: CompleteBillingData,
        BrowserInfo: BrowserInfoData,
        CardId: String,
        CreationDate: Double,
        Culture: CountryISO,
        DebitedFunds: MoneyData,
        ExecutionType: PayInExecutionType,
        ExpirationDate: Timestamp,
        Id: String,
        IpAddress: String,
        PayinsLinked: PayinsLinkedData,
        PaymentStatus: PaymentStatus,
        PaymentType: PayInPaymentType,
        Requested3DSVersion: `3DSVersion`,
        ResultCode: String,
        ResultMessage: String,
        SecureModeNeeded: Boolean,
        SecureModeRedirectURL: String,
        SecureModeReturnURL: String,
        Shipping: ShippingData,
        StatementDescriptor: String,
        Status: DepositStatus,
        Tag: String
      ): DepositData = {
        val __obj = js.Dynamic.literal(Applied3DSVersion = Applied3DSVersion.asInstanceOf[js.Any], AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], BrowserInfo = BrowserInfo.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], PayinsLinked = PayinsLinked.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], Requested3DSVersion = Requested3DSVersion.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], Shipping = Shipping.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[DepositData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DepositData] (val x: Self) extends AnyVal {
        
        inline def setApplied3DSVersion(value: `3DSVersion`): Self = StObject.set(x, "Applied3DSVersion", value.asInstanceOf[js.Any])
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBilling(value: CompleteBillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
        
        inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
        
        inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
        
        inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setExecutionType(value: PayInExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
        
        inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
        
        inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
        
        inline def setPayinsLinked(value: PayinsLinkedData): Self = StObject.set(x, "PayinsLinked", value.asInstanceOf[js.Any])
        
        inline def setPaymentStatus(value: PaymentStatus): Self = StObject.set(x, "PaymentStatus", value.asInstanceOf[js.Any])
        
        inline def setPaymentType(value: PayInPaymentType): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
        
        inline def setRequested3DSVersion(value: `3DSVersion`): Self = StObject.set(x, "Requested3DSVersion", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setSecureModeNeeded(value: Boolean): Self = StObject.set(x, "SecureModeNeeded", value.asInstanceOf[js.Any])
        
        inline def setSecureModeRedirectURL(value: String): Self = StObject.set(x, "SecureModeRedirectURL", value.asInstanceOf[js.Any])
        
        inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
        
        inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
        
        inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: DepositStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/enums.enums.IDepositStatus> */
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
    */
    trait DepositStatus extends StObject
    object DepositStatus {
      
      inline def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = "FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED]
      
      inline def SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED]
    }
    
    trait PayinsLinkedData extends StObject {
      
      var PayinCaptureId: String
      
      var PayinComplementId: String
    }
    object PayinsLinkedData {
      
      inline def apply(PayinCaptureId: String, PayinComplementId: String): PayinsLinkedData = {
        val __obj = js.Dynamic.literal(PayinCaptureId = PayinCaptureId.asInstanceOf[js.Any], PayinComplementId = PayinComplementId.asInstanceOf[js.Any])
        __obj.asInstanceOf[PayinsLinkedData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PayinsLinkedData] (val x: Self) extends AnyVal {
        
        inline def setPayinCaptureId(value: String): Self = StObject.set(x, "PayinCaptureId", value.asInstanceOf[js.Any])
        
        inline def setPayinComplementId(value: String): Self = StObject.set(x, "PayinComplementId", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/enums.enums.IPaymentStatus> */
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED
    */
    trait PaymentStatus extends StObject
    object PaymentStatus {
      
      inline def CANCELED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED]
      
      inline def WAITING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING = "WAITING".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING]
    }
  }
}
