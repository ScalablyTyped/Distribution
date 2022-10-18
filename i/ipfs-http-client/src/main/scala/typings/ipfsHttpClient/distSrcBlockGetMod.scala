package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBlockGetMod {
  
  @JSImport("ipfs-http-client/dist/src/block/get", "createGet")
  @js.native
  val createGet: Factory[
    js.Function2[
      /* cid */ CID[Any, Double, Double, Version], 
      /* options */ js.UndefOr[
        AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[js.typedarray.Uint8Array]
    ]
  ] = js.native
  
  type BlockAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
