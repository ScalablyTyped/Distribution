package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesDevicesUpdatesigned
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the device to update.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalUpdateSignedDeviceRequest] = js.undefined
}
object ParamsResourceNodesDevicesUpdatesigned {
  
  inline def apply(): ParamsResourceNodesDevicesUpdatesigned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesDevicesUpdatesigned]
  }
  
  extension [Self <: ParamsResourceNodesDevicesUpdatesigned](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSasPortalUpdateSignedDeviceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
