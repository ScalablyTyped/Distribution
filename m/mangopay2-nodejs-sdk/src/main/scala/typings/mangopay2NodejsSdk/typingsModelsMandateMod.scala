package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsMandateMod {
  
  object mandate {
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/mandate.mandate.MandateData, 'Tag', 'BankAccountId' | 'Culture' | 'ReturnURL'> */
    trait CreateMandate extends StObject {
      
      var BankAccountId: String
      
      var Culture: MandateCultureCode
      
      var ReturnURL: String
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateMandate {
      
      inline def apply(BankAccountId: String, Culture: MandateCultureCode, ReturnURL: String): CreateMandate = {
        val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateMandate]
      }
      
      extension [Self <: CreateMandate](x: Self) {
        
        inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
        
        inline def setCulture(value: MandateCultureCode): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
        
        inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EN
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL
    */
    trait MandateCultureCode extends StObject
    object MandateCultureCode {
      
      inline def DE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE = "DE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE]
      
      inline def EN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EN = "EN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EN]
      
      inline def ES: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES = "ES".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES]
      
      inline def FR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR = "FR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR]
      
      inline def IT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT = "IT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT]
      
      inline def NL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL = "NL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL]
      
      inline def PL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL = "PL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL]
    }
    
    trait MandateData
      extends StObject
         with EntityBaseData {
      
      /**
        * An ID of a Bank Account
        */
      var BankAccountId: String
      
      /**
        * The banking reference for this mandate
        */
      var BankReference: String
      
      /**
        * The language to use for the mandate confirmation page - needs to be the ISO code of the language
        */
      var Culture: MandateCultureCode
      
      /**
        * The URL to download the mandate
        */
      var DocumentURL: String
      
      /**
        * The execution type for creating the mandate
        */
      var ExecutionType: MandateExecutionType
      
      /**
        * The type of Mandate
        */
      var MandateType: typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateType
      
      /**
        * The URL to redirect to user to for them to proceed with the payment
        */
      var RedirectURL: String
      
      /**
        * The result code
        */
      var ResultCode: String
      
      /**
        * A verbal explanation of the ResultCode
        */
      var ResultMessage: String
      
      /**
        * The URL to redirect to after payment (whether successful or not)
        */
      var ReturnURL: String
      
      /**
        * The type of mandate, but will only be completed once the mandate has been submitted
        */
      var Scheme: MandateScheme
      
      /**
        * The status of the mandate:
        */
      var Status: MandateStatus
      
      /**
        * The object owner's UserId
        */
      var UserId: String
    }
    object MandateData {
      
      inline def apply(
        BankAccountId: String,
        BankReference: String,
        CreationDate: Double,
        Culture: MandateCultureCode,
        DocumentURL: String,
        ExecutionType: MandateExecutionType,
        Id: String,
        MandateType: MandateType,
        RedirectURL: String,
        ResultCode: String,
        ResultMessage: String,
        ReturnURL: String,
        Scheme: MandateScheme,
        Status: MandateStatus,
        Tag: String,
        UserId: String
      ): MandateData = {
        val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], BankReference = BankReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MandateType = MandateType.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
        __obj.asInstanceOf[MandateData]
      }
      
      extension [Self <: MandateData](x: Self) {
        
        inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
        
        inline def setBankReference(value: String): Self = StObject.set(x, "BankReference", value.asInstanceOf[js.Any])
        
        inline def setCulture(value: MandateCultureCode): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
        
        inline def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
        
        inline def setExecutionType(value: MandateExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
        
        inline def setMandateType(value: MandateType): Self = StObject.set(x, "MandateType", value.asInstanceOf[js.Any])
        
        inline def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
        
        inline def setScheme(value: MandateScheme): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: MandateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      }
    }
    
    type MandateExecutionType = WEB
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEPA
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BACS
    */
    trait MandateScheme extends StObject
    object MandateScheme {
      
      inline def BACS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BACS = "BACS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BACS]
      
      inline def SEPA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEPA = "SEPA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEPA]
    }
    
    /**
      * - "CREATED" - the mandate has been created
      * - "SUBMITTED" - the mandate has been submitted to the banks and you can now do payments with this mandate
      * - "ACTIVE" - the mandate is active and has been accepted by the banks and/or successfully used in a payment
      * - "FAILED" - the mandate has failed for a variety of reasons and is no longer available for payments
      */
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/enums.enums.IMandateStatus> */
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED
    */
    trait MandateStatus extends StObject
    object MandateStatus {
      
      inline def ACTIVE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE]
      
      inline def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED]
      
      inline def FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = "FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED]
      
      inline def SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED]
    }
    
    type MandateType = DIRECT_DEBIT
  }
}
