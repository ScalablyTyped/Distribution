package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationsAnalysesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the analysis.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1Analysis] = js.undefined
}
object ParamsResourceProjectsLocationsConversationsAnalysesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationsAnalysesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationsAnalysesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationsAnalysesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudContactcenterinsightsV1Analysis): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
