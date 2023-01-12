package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent extends StObject {
  
  /** Additional cases to be evaluated. */
  var additionalCases: js.UndefOr[GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases] = js.undefined
  
  /** Returned message. */
  var message: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessage] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContent] (val x: Self) extends AnyVal {
    
    inline def setAdditionalCases(value: GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases): Self = StObject.set(x, "additionalCases", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCasesUndefined: Self = StObject.set(x, "additionalCases", js.undefined)
    
    inline def setMessage(value: GoogleCloudDialogflowCxV3beta1ResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
