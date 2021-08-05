package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /** Relative name of the service within the application. Example: default.@OutputOnly */
  var id: js.UndefOr[String] = js.undefined
  
  /** Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  
  /** Ingress settings for this service. Will apply to all versions. */
  var networkSettings: js.UndefOr[NetworkSettings] = js.undefined
  
  /** Mapping that defines fractional HTTP traffic diversion to different versions within the service. */
  var split: js.UndefOr[TrafficSplit] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkSettings(value: NetworkSettings): Self = StObject.set(x, "networkSettings", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettingsUndefined: Self = StObject.set(x, "networkSettings", js.undefined)
    
    inline def setSplit(value: TrafficSplit): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
