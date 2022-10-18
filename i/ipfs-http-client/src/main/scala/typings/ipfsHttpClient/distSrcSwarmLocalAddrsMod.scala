package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSwarmLocalAddrsMod {
  
  @JSImport("ipfs-http-client/dist/src/swarm/local-addrs", "createLocalAddrs")
  @js.native
  val createLocalAddrs: Factory[
    js.Function1[
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[js.Array[Multiaddr_]]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type SwarmAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_swarm.API<HTTPClientExtraOptions> */ Any
}
