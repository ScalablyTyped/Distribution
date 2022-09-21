package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ContainerPort extends StObject {
  
  /**
    * Number of the port to expose on the container. This must be a valid port number: 0 < PORT_NUMBER < 65536.
    */
  var containerPort: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1ContainerPort {
  
  inline def apply(): SchemaGoogleCloudMlV1ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ContainerPort]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ContainerPort](x: Self) {
    
    inline def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortNull: Self = StObject.set(x, "containerPort", null)
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
  }
}
