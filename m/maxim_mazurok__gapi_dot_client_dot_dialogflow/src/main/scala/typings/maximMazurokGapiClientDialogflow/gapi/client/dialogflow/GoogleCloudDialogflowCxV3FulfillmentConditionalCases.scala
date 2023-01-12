package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FulfillmentConditionalCases extends StObject {
  
  /** A list of cascading if-else conditions. */
  var cases: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase]] = js.undefined
}
object GoogleCloudDialogflowCxV3FulfillmentConditionalCases {
  
  inline def apply(): GoogleCloudDialogflowCxV3FulfillmentConditionalCases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FulfillmentConditionalCases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3FulfillmentConditionalCases] (val x: Self) extends AnyVal {
    
    inline def setCases(value: js.Array[GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    inline def setCasesVarargs(value: GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase*): Self = StObject.set(x, "cases", js.Array(value*))
  }
}
