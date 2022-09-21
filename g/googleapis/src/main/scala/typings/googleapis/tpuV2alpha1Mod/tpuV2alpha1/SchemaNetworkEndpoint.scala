package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpoint extends StObject {
  
  /**
    * The access config for the TPU worker.
    */
  var accessConfig: js.UndefOr[SchemaAccessConfig] = js.undefined
  
  /**
    * The internal IP address of this network endpoint.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The port of this network endpoint.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNetworkEndpoint {
  
  inline def apply(): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
  
  extension [Self <: SchemaNetworkEndpoint](x: Self) {
    
    inline def setAccessConfig(value: SchemaAccessConfig): Self = StObject.set(x, "accessConfig", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigUndefined: Self = StObject.set(x, "accessConfig", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
