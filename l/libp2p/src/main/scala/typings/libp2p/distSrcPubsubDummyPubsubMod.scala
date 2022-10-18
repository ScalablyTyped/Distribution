package typings.libp2p

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.libp2pInterfacePubsub.mod.PublishResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubDummyPubsubMod {
  
  @JSImport("libp2p/dist/src/pubsub/dummy-pubsub", "DummyPubSub")
  @js.native
  open class DummyPubSub () extends PubSub[PubSubEvents] {
    
    def getSubscribers(): js.Array[PeerId] = js.native
    
    @JSName("globalSignaturePolicy")
    def globalSignaturePolicy_MDummyPubSub: /* "StrictSign" */ String = js.native
    
    def isStarted(): Boolean = js.native
    
    @JSName("multicodecs")
    def multicodecs_MDummyPubSub: js.Array[String] = js.native
    
    def publish(): js.Promise[PublishResult] = js.native
    
    def start(): Unit | js.Promise[Unit] = js.native
    
    def stop(): Unit | js.Promise[Unit] = js.native
    
    def subscribe(): Unit = js.native
    
    def unsubscribe(): Unit = js.native
  }
}
