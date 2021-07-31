package typings.ionicDiscover

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/discover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def computeBroadcastAddress(address: String, netmask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBroadcastAddress")(address.asInstanceOf[js.Any], netmask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def newSilentPublisher(namespace: String, name: String, port: Double): typings.ionicDiscover.publisherMod.Publisher = (^.asInstanceOf[js.Dynamic].applyDynamic("newSilentPublisher")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.ionicDiscover.publisherMod.Publisher]
}
