package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesDevicesSigndevice
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The resource path name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalSignDeviceRequest] = js.undefined
}
object ParamsResourceNodesDevicesSigndevice {
  
  inline def apply(): ParamsResourceNodesDevicesSigndevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesDevicesSigndevice]
  }
  
  extension [Self <: ParamsResourceNodesDevicesSigndevice](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSasPortalSignDeviceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
