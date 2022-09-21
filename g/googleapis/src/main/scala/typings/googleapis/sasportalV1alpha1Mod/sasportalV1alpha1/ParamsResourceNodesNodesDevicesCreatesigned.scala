package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesNodesDevicesCreatesigned
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the parent resource.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalCreateSignedDeviceRequest] = js.undefined
}
object ParamsResourceNodesNodesDevicesCreatesigned {
  
  inline def apply(): ParamsResourceNodesNodesDevicesCreatesigned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesNodesDevicesCreatesigned]
  }
  
  extension [Self <: ParamsResourceNodesNodesDevicesCreatesigned](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSasPortalCreateSignedDeviceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
