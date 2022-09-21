package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase extends StObject {
  
  /**
    * A list of case content.
    */
  var caseContent: js.UndefOr[
    js.Array[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent]
  ] = js.undefined
  
  /**
    * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var condition: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase](x: Self) {
    
    inline def setCaseContent(value: js.Array[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent]): Self = StObject.set(x, "caseContent", value.asInstanceOf[js.Any])
    
    inline def setCaseContentUndefined: Self = StObject.set(x, "caseContent", js.undefined)
    
    inline def setCaseContentVarargs(value: SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent*): Self = StObject.set(x, "caseContent", js.Array(value*))
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
