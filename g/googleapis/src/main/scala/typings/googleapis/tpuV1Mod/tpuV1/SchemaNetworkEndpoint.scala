package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A network endpoint over which a TPU worker can be reached.
  */
trait SchemaNetworkEndpoint extends StObject {
  
  /**
    * The IP address of this network endpoint.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The port of this network endpoint.
    */
  var port: js.UndefOr[Double] = js.undefined
}
object SchemaNetworkEndpoint {
  
  inline def apply(): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
  
  extension [Self <: SchemaNetworkEndpoint](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
