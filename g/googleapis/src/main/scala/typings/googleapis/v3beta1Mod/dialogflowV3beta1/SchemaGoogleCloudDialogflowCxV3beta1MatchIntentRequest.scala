package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest extends StObject {
  
  /**
    * Required. The input specification.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1QueryInput] = js.undefined
  
  /**
    * The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1QueryParameters] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest](x: Self) {
    
    inline def setQueryInput(value: SchemaGoogleCloudDialogflowCxV3beta1QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: SchemaGoogleCloudDialogflowCxV3beta1QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
