package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAddAllMod {
  
  @JSImport("ipfs-http-client/dist/src/add-all", "createAddAll")
  @js.native
  val createAddAll: Factory[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ /* source */ Any, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddAllOptions */ Any) & AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddResult */ Any
      ]
    ]
  ] = js.native
  
  type AddResult = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddResult */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type IPFSCoreAddProgressFn = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddProgressFn */ Any
  
  type IPFSUtilsHttpUploadProgressFn = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ProgressFn */ Any
  
  type RootAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.API<HTTPClientExtraOptions> */ Any
}
