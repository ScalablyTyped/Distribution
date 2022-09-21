package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ContainerPort extends StObject {
  
  /**
    * Port number the container listens on. This must be a valid TCP port number, 0 < container_port < 65536.
    */
  var containerPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2ContainerPort {
  
  inline def apply(): SchemaGoogleCloudRunV2ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ContainerPort]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ContainerPort](x: Self) {
    
    inline def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortNull: Self = StObject.set(x, "containerPort", null)
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
