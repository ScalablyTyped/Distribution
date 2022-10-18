package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtPutMod {
  
  @JSImport("ipfs-http-client/dist/src/dht/put", "createPut")
  @js.native
  val createPut: Factory[
    js.Function3[
      /* key */ String | js.typedarray.Uint8Array, 
      /* value */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ Any
      ]
    ]
  ] = js.native
  
  type DHTAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
