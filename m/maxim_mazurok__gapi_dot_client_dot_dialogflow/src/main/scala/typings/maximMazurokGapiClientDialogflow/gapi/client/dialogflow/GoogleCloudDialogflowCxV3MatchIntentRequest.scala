package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3MatchIntentRequest extends StObject {
  
  /** Required. The input specification. */
  var queryInput: js.UndefOr[GoogleCloudDialogflowCxV3QueryInput] = js.undefined
  
  /** The parameters of this query. */
  var queryParams: js.UndefOr[GoogleCloudDialogflowCxV3QueryParameters] = js.undefined
}
object GoogleCloudDialogflowCxV3MatchIntentRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3MatchIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3MatchIntentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3MatchIntentRequest](x: Self) {
    
    inline def setQueryInput(value: GoogleCloudDialogflowCxV3QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: GoogleCloudDialogflowCxV3QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
