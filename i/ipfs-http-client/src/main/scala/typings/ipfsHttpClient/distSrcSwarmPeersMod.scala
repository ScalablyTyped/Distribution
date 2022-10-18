package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSwarmPeersMod {
  
  @JSImport("ipfs-http-client/dist/src/swarm/peers", "createPeers")
  @js.native
  val createPeers: Factory[
    js.Function1[
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_swarm.PeersOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_swarm.PeersResult */ Any
        ]
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type SwarmAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_swarm.API<HTTPClientExtraOptions> */ Any
}
