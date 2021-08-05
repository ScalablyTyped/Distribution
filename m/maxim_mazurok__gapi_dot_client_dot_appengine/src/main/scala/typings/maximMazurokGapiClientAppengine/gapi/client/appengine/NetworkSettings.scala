package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkSettings extends StObject {
  
  /** The ingress settings for version or service. */
  var ingressTrafficAllowed: js.UndefOr[String] = js.undefined
}
object NetworkSettings {
  
  inline def apply(): NetworkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkSettings]
  }
  
  extension [Self <: NetworkSettings](x: Self) {
    
    inline def setIngressTrafficAllowed(value: String): Self = StObject.set(x, "ingressTrafficAllowed", value.asInstanceOf[js.Any])
    
    inline def setIngressTrafficAllowedUndefined: Self = StObject.set(x, "ingressTrafficAllowed", js.undefined)
  }
}
