package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBitswapUnwantMod {
  
  @JSImport("ipfs-http-client/dist/src/bitswap/unwant", "createUnwant")
  @js.native
  val createUnwant: Factory[
    js.Function2[
      /* cids */ (CID[Any, Double, Double, Version]) | (js.Array[CID[Any, Double, Double, Version]]), 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type BitswapAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_bitswap.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
