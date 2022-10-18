package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectDataMod {
  
  @JSImport("ipfs-http-client/dist/src/object/data", "createData")
  @js.native
  val createData: Factory[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ /* cid */ Any, 
      /* options */ js.UndefOr[
        AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[js.typedarray.Uint8Array]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type ObjectAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.API<HTTPClientExtraOptions> */ Any
}
