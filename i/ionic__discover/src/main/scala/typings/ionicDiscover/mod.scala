package typings.ionicDiscover

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/discover", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  
  def newSilentPublisher(namespace: String, name: String, port: Double): typings.ionicDiscover.publisherMod.Publisher = js.native
  
  @js.native
  class CommServer protected ()
    extends typings.ionicDiscover.commMod.CommServer {
    def this(
      namespace: String,
      /**
      * Unique identifier of the publisher.
      */
    id: String,
      /**
      * Port of communication server.
      */
    port: Double
    ) = this()
  }
  
  @js.native
  class Publisher protected ()
    extends typings.ionicDiscover.publisherMod.Publisher {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  }
}
