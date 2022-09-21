package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRuntimesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRuntime] = js.undefined
  
  /**
    * Idempotent request UUID.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. User-defined unique ID of this Runtime.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRuntimesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsRuntimesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRuntimesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRuntimesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaRuntime): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
  }
}
