package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRefreshRuntimeTokenInternalRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal {
  
  inline def apply(): ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRefreshRuntimeTokenInternalRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
