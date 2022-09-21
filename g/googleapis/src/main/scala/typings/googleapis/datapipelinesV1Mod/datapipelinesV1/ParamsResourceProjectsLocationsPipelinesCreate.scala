package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsPipelinesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.undefined
}
object ParamsResourceProjectsLocationsPipelinesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsPipelinesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsPipelinesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsPipelinesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatapipelinesV1Pipeline): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
