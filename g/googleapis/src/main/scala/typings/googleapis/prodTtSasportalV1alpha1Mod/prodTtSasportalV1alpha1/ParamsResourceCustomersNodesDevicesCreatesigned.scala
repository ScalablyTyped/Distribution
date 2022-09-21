package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersNodesDevicesCreatesigned
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
object ParamsResourceCustomersNodesDevicesCreatesigned {
  
  inline def apply(): ParamsResourceCustomersNodesDevicesCreatesigned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersNodesDevicesCreatesigned]
  }
  
  extension [Self <: ParamsResourceCustomersNodesDevicesCreatesigned](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSasPortalCreateSignedDeviceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
