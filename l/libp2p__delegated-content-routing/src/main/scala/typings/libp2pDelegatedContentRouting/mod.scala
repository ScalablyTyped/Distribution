package typings.libp2pDelegatedContentRouting

import typings.ipfsHttpClient.mod.CID
import typings.ipfsHttpClient.mod.HTTPClientExtraOptions
import typings.ipfsHttpClient.mod.IPFSHTTPClient
import typings.libp2pInterfaceContentRouting.mod.ContentRouting
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/delegated-content-routing", "DelegatedContentRouting")
  @js.native
  open class DelegatedContentRouting protected ()
    extends StObject
       with ContentRouting
       with Startable {
    /**
      * Create a new DelegatedContentRouting instance
      */
    def this(client: IPFSHTTPClient) = this()
    
    /* private */ var abortController: Any = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Search the dht for providers of the given CID.
      *
      * - call `findProviders` on the delegated node.
      */
    def findProviders(key: CID[Any, Double, Double, Version]): AsyncGenerator[PeerInfo, Unit, Unit] = js.native
    def findProviders(
      key: CID[Any, Double, Double, Version],
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncGenerator[PeerInfo, Unit, Unit] = js.native
    
    def get(
      key: js.typedarray.Uint8Array,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ val httpQueue: Any = js.native
    
    /* private */ val httpQueueRefs: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * Announce to the network that the delegated node can provide the given key.
      *
      * Currently this uses the following hack
      * - delegate is one of bootstrap nodes, so we are always connected to it
      * - call block stat on the delegated node, so it fetches the content
      * - call dht provide with the passed cid
      *
      * N.B. this must be called for every block in the dag you want provided otherwise
      * the delegate will only be able to supply the root block of the dag when asked
      * for the data by an interested peer.
      */
    def provide(key: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    def provide(
      key: CID[Any, Double, Double, Version],
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): js.Promise[Unit] = js.native
    
    def put(
      key: js.typedarray.Uint8Array,
      value: js.typedarray.Uint8Array,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): js.Promise[Unit] = js.native
    
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
}
