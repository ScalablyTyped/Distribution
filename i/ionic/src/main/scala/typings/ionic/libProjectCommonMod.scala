package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectCommonMod {
  
  @JSImport("ionic/lib/project/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findOpenIonicPorts(address: String, ports: Ports): js.Promise[Ports] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOpenIonicPorts")(address.asInstanceOf[js.Any], ports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Ports]]
  
  trait Ports extends StObject {
    
    var livereloadPort: Double
    
    var notificationPort: Double
    
    var port: Double
  }
  object Ports {
    
    inline def apply(livereloadPort: Double, notificationPort: Double, port: Double): Ports = {
      val __obj = js.Dynamic.literal(livereloadPort = livereloadPort.asInstanceOf[js.Any], notificationPort = notificationPort.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ports]
    }
    
    extension [Self <: Ports](x: Self) {
      
      inline def setLivereloadPort(value: Double): Self = StObject.set(x, "livereloadPort", value.asInstanceOf[js.Any])
      
      inline def setNotificationPort(value: Double): Self = StObject.set(x, "notificationPort", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
