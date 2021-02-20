package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("ionic/lib/project/common", "findOpenIonicPorts")
  @js.native
  def findOpenIonicPorts(address: String, ports: Ports): js.Promise[Ports] = js.native
  
  @js.native
  trait Ports extends StObject {
    
    var livereloadPort: Double = js.native
    
    var notificationPort: Double = js.native
    
    var port: Double = js.native
  }
  object Ports {
    
    @scala.inline
    def apply(livereloadPort: Double, notificationPort: Double, port: Double): Ports = {
      val __obj = js.Dynamic.literal(livereloadPort = livereloadPort.asInstanceOf[js.Any], notificationPort = notificationPort.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ports]
    }
    
    @scala.inline
    implicit class PortsMutableBuilder[Self <: Ports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLivereloadPort(value: Double): Self = StObject.set(x, "livereloadPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationPort(value: Double): Self = StObject.set(x, "notificationPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
