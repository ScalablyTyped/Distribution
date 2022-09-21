package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTCPSocketAction extends StObject {
  
  /**
    * (Optional) Optional: Host name to connect to, defaults to the pod IP.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTCPSocketAction {
  
  inline def apply(): SchemaTCPSocketAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTCPSocketAction]
  }
  
  extension [Self <: SchemaTCPSocketAction](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
