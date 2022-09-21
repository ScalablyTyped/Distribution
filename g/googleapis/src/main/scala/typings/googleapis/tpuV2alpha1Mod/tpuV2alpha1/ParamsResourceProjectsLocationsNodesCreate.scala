package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNodesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The unqualified resource name.
    */
  var nodeId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaNode] = js.undefined
  
  /**
    * Idempotent request UUID.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsNodesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsNodesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNodesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNodesCreate](x: Self) {
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaNode): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
