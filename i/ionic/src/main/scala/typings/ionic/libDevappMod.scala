package typings.ionic

import typings.atIonicDiscover.distCommMod.CommServer
import typings.ionic.libDevappMod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/devapp", JSImport.Namespace)
@js.native
object libDevappMod extends js.Object {
  @js.native
  class Publisher ()
    extends typings.atIonicDiscover.atIonicDiscoverMod.Publisher
  
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  def createCommServer(id: String, port: Double): js.Promise[CommServer] = js.native
  def createPublisher(name: String, port: Double, commPort: Double): js.Promise[Publisher] = js.native
}

