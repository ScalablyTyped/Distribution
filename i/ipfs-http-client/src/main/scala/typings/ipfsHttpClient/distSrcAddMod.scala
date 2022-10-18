package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAddMod {
  
  @JSImport("ipfs-http-client/dist/src/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAdd(options: Options): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate */ /* input */ Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddResult */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdd")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate */ /* input */ Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.AddResult */ Any
    ]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RootAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.API<HTTPClientExtraOptions> */ Any
}
