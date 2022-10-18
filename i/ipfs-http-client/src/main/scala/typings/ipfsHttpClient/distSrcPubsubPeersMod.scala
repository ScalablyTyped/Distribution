package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubPeersMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub/peers", "createPeers")
  @js.native
  val createPeers: Factory[
    js.Function2[
      /* topic */ String, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[js.Array[PeerId]]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type PubsubAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.API<HTTPClientExtraOptions> */ Any
}
