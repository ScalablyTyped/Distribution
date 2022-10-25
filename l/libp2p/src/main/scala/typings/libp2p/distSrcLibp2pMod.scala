package typings.libp2p

import typings.libp2p.distSrcComponentsMod.Components
import typings.libp2p.distSrcFetchMod.FetchService
import typings.libp2p.distSrcIdentifyMod.IdentifyService
import typings.libp2p.distSrcPingMod.PingService
import typings.libp2p.mod.Libp2p
import typings.libp2p.mod.Libp2pInit
import typings.libp2p.mod.Libp2pOptions
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.mod.AbortOptions
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibp2pMod {
  
  @JSImport("libp2p/dist/src/libp2p", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/dist/src/libp2p", "Libp2pNode")
  @js.native
  open class Libp2pNode protected () extends Libp2p {
    def this(init: Libp2pInit) = this()
    
    var components: Components = js.native
    
    /* private */ var configureComponent: Any = js.native
    
    var fetchService: FetchService = js.native
    
    var identifyService: js.UndefOr[IdentifyService] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * Called whenever peer discovery services emit `peer` events.
      * Known peers may be emitted.
      */
    def onDiscoveryPeer(evt: CustomEvent[PeerInfo]): Unit = js.native
    
    def ping(peer: String): js.Promise[Double] = js.native
    def ping(peer: String, options: AbortOptions): js.Promise[Double] = js.native
    
    var pingService: PingService = js.native
    
    /* private */ val services: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  
  inline def createLibp2pNode(options: Libp2pOptions): js.Promise[Libp2pNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLibp2pNode")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Libp2pNode]]
}
