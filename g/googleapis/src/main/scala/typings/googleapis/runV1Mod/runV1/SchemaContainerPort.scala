package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainerPort extends StObject {
  
  /**
    * (Optional) Port number the container listens on. This must be a valid port number, 0 < x < 65536.
    */
  var containerPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Optional) If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Protocol for port. Must be "TCP". Defaults to "TCP".
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
}
object SchemaContainerPort {
  
  inline def apply(): SchemaContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerPort]
  }
  
  extension [Self <: SchemaContainerPort](x: Self) {
    
    inline def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortNull: Self = StObject.set(x, "containerPort", null)
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
