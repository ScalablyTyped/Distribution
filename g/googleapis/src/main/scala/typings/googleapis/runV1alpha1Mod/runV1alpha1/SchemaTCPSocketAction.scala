package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TCPSocketAction describes an action based on opening a socket
  */
trait SchemaTCPSocketAction extends StObject {
  
  /**
    * Optional: Host name to connect to, defaults to the pod IP. +optional
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Number or name of the port to access on the container. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: js.UndefOr[SchemaIntOrString] = js.undefined
}
object SchemaTCPSocketAction {
  
  inline def apply(): SchemaTCPSocketAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTCPSocketAction]
  }
  
  extension [Self <: SchemaTCPSocketAction](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: SchemaIntOrString): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
