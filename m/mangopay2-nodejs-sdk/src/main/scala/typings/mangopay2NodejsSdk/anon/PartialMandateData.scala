package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateCultureCode
import typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateExecutionType
import typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateScheme
import typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateStatus
import typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/mandate.mandate.MandateData> */
trait PartialMandateData extends StObject {
  
  var BankAccountId: js.UndefOr[String] = js.undefined
  
  var BankReference: js.UndefOr[String] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var Culture: js.UndefOr[MandateCultureCode] = js.undefined
  
  var DocumentURL: js.UndefOr[String] = js.undefined
  
  var ExecutionType: js.UndefOr[MandateExecutionType] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var MandateType: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsMandateMod.mandate.MandateType] = js.undefined
  
  var RedirectURL: js.UndefOr[String] = js.undefined
  
  var ResultCode: js.UndefOr[String] = js.undefined
  
  var ResultMessage: js.UndefOr[String] = js.undefined
  
  var ReturnURL: js.UndefOr[String] = js.undefined
  
  var Scheme: js.UndefOr[MandateScheme] = js.undefined
  
  var Status: js.UndefOr[MandateStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var UserId: js.UndefOr[String] = js.undefined
}
object PartialMandateData {
  
  inline def apply(): PartialMandateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMandateData]
  }
  
  extension [Self <: PartialMandateData](x: Self) {
    
    inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
    
    inline def setBankAccountIdUndefined: Self = StObject.set(x, "BankAccountId", js.undefined)
    
    inline def setBankReference(value: String): Self = StObject.set(x, "BankReference", value.asInstanceOf[js.Any])
    
    inline def setBankReferenceUndefined: Self = StObject.set(x, "BankReference", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCulture(value: MandateCultureCode): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "Culture", js.undefined)
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    inline def setDocumentURLUndefined: Self = StObject.set(x, "DocumentURL", js.undefined)
    
    inline def setExecutionType(value: MandateExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setExecutionTypeUndefined: Self = StObject.set(x, "ExecutionType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMandateType(value: MandateType): Self = StObject.set(x, "MandateType", value.asInstanceOf[js.Any])
    
    inline def setMandateTypeUndefined: Self = StObject.set(x, "MandateType", js.undefined)
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "RedirectURL", js.undefined)
    
    inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    inline def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
    
    inline def setReturnURLUndefined: Self = StObject.set(x, "ReturnURL", js.undefined)
    
    inline def setScheme(value: MandateScheme): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    inline def setStatus(value: MandateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
