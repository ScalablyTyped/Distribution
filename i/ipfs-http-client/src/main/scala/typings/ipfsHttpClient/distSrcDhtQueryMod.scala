package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtQueryMod {
  
  @JSImport("ipfs-http-client/dist/src/dht/query", "createQuery")
  @js.native
  val createQuery: Factory[
    js.Function2[
      /* peerId */ (CID[Any, Double, Double, Version]) | PeerId, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ Any
      ]
    ]
  ] = js.native
  
  type DHTAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
