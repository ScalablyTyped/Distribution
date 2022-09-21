package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForwardSshTunnelConnectivity extends StObject {
  
  /**
    * Required. Hostname for the SSH tunnel.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. SSH password.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Port for the SSH tunnel, default value is 22.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Input only. SSH private key.
    */
  var privateKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Username for the SSH tunnel.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaForwardSshTunnelConnectivity {
  
  inline def apply(): SchemaForwardSshTunnelConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardSshTunnelConnectivity]
  }
  
  extension [Self <: SchemaForwardSshTunnelConnectivity](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNull: Self = StObject.set(x, "privateKey", null)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
