package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent extends StObject {
  
  /**
    * Additional cases to be evaluated.
    */
  var additionalCases: js.UndefOr[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases] = js.undefined
  
  /**
    * Returned message.
    */
  var message: js.UndefOr[SchemaGoogleCloudDialogflowCxV3ResponseMessage] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent](x: Self) {
    
    inline def setAdditionalCases(value: SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases): Self = StObject.set(x, "additionalCases", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCasesUndefined: Self = StObject.set(x, "additionalCases", js.undefined)
    
    inline def setMessage(value: SchemaGoogleCloudDialogflowCxV3ResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
