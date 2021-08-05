package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkRoutingConfig extends StObject {
  
  /**
    * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If
    * set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
    */
  var routingMode: js.UndefOr[String] = js.undefined
}
object NetworkRoutingConfig {
  
  inline def apply(): NetworkRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkRoutingConfig]
  }
  
  extension [Self <: NetworkRoutingConfig](x: Self) {
    
    inline def setRoutingMode(value: String): Self = StObject.set(x, "routingMode", value.asInstanceOf[js.Any])
    
    inline def setRoutingModeUndefined: Self = StObject.set(x, "routingMode", js.undefined)
  }
}
