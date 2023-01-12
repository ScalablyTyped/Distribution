package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase extends StObject {
  
  /** A list of case content. */
  var caseContent: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent]] = js.undefined
  
  /**
    * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the
    * [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var condition: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase {
  
  inline def apply(): GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase] (val x: Self) extends AnyVal {
    
    inline def setCaseContent(value: js.Array[GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent]): Self = StObject.set(x, "caseContent", value.asInstanceOf[js.Any])
    
    inline def setCaseContentUndefined: Self = StObject.set(x, "caseContent", js.undefined)
    
    inline def setCaseContentVarargs(value: GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent*): Self = StObject.set(x, "caseContent", js.Array(value*))
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
