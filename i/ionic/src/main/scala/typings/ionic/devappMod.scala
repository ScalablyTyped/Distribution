package typings.ionic

import typings.ionicDiscover.commMod.CommServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devappMod {
  
  @JSImport("ionic/lib/devapp", "Publisher")
  @js.native
  class Publisher protected ()
    extends typings.ionicDiscover.mod.Publisher {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  }
  
  @JSImport("ionic/lib/devapp", "computeBroadcastAddress")
  @js.native
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  
  @JSImport("ionic/lib/devapp", "createCommServer")
  @js.native
  def createCommServer(id: String, port: Double): js.Promise[CommServer] = js.native
  
  @JSImport("ionic/lib/devapp", "createPublisher")
  @js.native
  def createPublisher(name: String, port: Double, commPort: Double): js.Promise[Publisher] = js.native
}
