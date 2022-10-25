package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBlockStatMod {
  
  @JSImport("ipfs-http-client/dist/src/block/stat", "createStat")
  @js.native
  val createStat: Factory[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID<unknown, number, number, imported_cid.Version> */ /* cid */ Any, 
      /* options */ js.UndefOr[
        AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.StatResult */ Any
      ]
    ]
  ] = js.native
  
  type BlockAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
