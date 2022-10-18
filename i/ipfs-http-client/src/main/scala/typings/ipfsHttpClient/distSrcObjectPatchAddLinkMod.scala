package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectPatchAddLinkMod {
  
  @JSImport("ipfs-http-client/dist/src/object/patch/add-link", "createAddLink")
  @js.native
  val createAddLink: Factory[
    js.Function3[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ /* cid */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.PBLink */ /* dLink */ Any, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type ObjectPatchAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_patch.API<HTTPClientExtraOptions> */ Any
}
