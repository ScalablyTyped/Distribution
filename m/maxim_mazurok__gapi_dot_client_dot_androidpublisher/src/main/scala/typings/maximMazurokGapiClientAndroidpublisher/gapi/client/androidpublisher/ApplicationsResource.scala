package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationsResource extends StObject {
  
  var deviceTierConfigs: DeviceTierConfigsResource
}
object ApplicationsResource {
  
  inline def apply(deviceTierConfigs: DeviceTierConfigsResource): ApplicationsResource = {
    val __obj = js.Dynamic.literal(deviceTierConfigs = deviceTierConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationsResource]
  }
  
  extension [Self <: ApplicationsResource](x: Self) {
    
    inline def setDeviceTierConfigs(value: DeviceTierConfigsResource): Self = StObject.set(x, "deviceTierConfigs", value.asInstanceOf[js.Any])
  }
}
