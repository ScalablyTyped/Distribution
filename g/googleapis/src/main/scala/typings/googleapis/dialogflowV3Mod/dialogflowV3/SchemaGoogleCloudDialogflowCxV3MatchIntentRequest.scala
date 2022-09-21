package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3MatchIntentRequest extends StObject {
  
  /**
    * Required. The input specification.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3QueryInput] = js.undefined
  
  /**
    * The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowCxV3QueryParameters] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3MatchIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3MatchIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3MatchIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3MatchIntentRequest](x: Self) {
    
    inline def setQueryInput(value: SchemaGoogleCloudDialogflowCxV3QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: SchemaGoogleCloudDialogflowCxV3QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
