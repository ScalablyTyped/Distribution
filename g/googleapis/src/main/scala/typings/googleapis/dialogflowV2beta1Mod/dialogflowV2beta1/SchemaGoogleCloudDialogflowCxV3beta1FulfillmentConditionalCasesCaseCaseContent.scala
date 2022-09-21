package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent extends StObject {
  
  /**
    * Additional cases to be evaluated.
    */
  var additionalCases: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases] = js.undefined
  
  /**
    * Returned message.
    */
  var message: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent](x: Self) {
    
    inline def setAdditionalCases(value: SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases): Self = StObject.set(x, "additionalCases", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCasesUndefined: Self = StObject.set(x, "additionalCases", js.undefined)
    
    inline def setMessage(value: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
