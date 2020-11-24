package typings.ionic

import typings.ionicDiscover.commMod.CommServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/devapp", JSImport.Namespace)
@js.native
object devappMod extends js.Object {
  
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  
  def createCommServer(id: String, port: Double): js.Promise[CommServer] = js.native
  
  def createPublisher(name: String, port: Double, commPort: Double): js.Promise[Publisher] = js.native
  
  @js.native
  class Publisher ()
    extends typings.ionicDiscover.mod.Publisher
}
