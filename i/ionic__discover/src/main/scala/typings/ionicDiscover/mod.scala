package typings.ionicDiscover

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/discover", "CommServer")
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
  
  @JSImport("@ionic/discover", "Publisher")
  @js.native
  class Publisher protected ()
    extends typings.ionicDiscover.publisherMod.Publisher {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  }
  
  @JSImport("@ionic/discover", "computeBroadcastAddress")
  @js.native
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  
  @JSImport("@ionic/discover", "newSilentPublisher")
  @js.native
  def newSilentPublisher(namespace: String, name: String, port: Double): typings.ionicDiscover.publisherMod.Publisher = js.native
}
