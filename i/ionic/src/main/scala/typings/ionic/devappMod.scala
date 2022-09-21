package typings.ionic

import typings.ionicDiscover.commMod.CommServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devappMod {
  
  @JSImport("ionic/lib/devapp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/devapp", "Publisher")
  @js.native
  open class Publisher protected ()
    extends typings.ionicDiscover.mod.Publisher {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  }
  
  inline def computeBroadcastAddress(address: String, netmask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBroadcastAddress")(address.asInstanceOf[js.Any], netmask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createCommServer(id: String, port: Double): js.Promise[CommServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCommServer")(id.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CommServer]]
  
  inline def createPublisher(name: String, port: Double, commPort: Double): js.Promise[Publisher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPublisher")(name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], commPort.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Publisher]]
}
