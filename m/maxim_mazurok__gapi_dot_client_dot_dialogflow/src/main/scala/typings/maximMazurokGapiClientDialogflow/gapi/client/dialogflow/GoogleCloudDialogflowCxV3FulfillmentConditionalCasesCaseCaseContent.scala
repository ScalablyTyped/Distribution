package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent extends StObject {
  
  /** Additional cases to be evaluated. */
  var additionalCases: js.UndefOr[GoogleCloudDialogflowCxV3FulfillmentConditionalCases] = js.undefined
  
  /** Returned message. */
  var message: js.UndefOr[GoogleCloudDialogflowCxV3ResponseMessage] = js.undefined
}
object GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent {
  
  inline def apply(): GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent] (val x: Self) extends AnyVal {
    
    inline def setAdditionalCases(value: GoogleCloudDialogflowCxV3FulfillmentConditionalCases): Self = StObject.set(x, "additionalCases", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCasesUndefined: Self = StObject.set(x, "additionalCases", js.undefined)
    
    inline def setMessage(value: GoogleCloudDialogflowCxV3ResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
