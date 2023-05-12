package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSwarmDisconnectMod {
  
  @JSImport("ipfs-http-client/dist/src/swarm/disconnect", "createDisconnect")
  @js.native
  val createDisconnect: Factory[
    js.Function2[
      /* multiaddrOrPeerId */ Multiaddr_ | PeerId, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type SwarmAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_swarm.API<HTTPClientExtraOptions> */ Any
}
