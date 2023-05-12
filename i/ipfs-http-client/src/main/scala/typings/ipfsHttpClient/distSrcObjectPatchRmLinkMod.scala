package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.ipldDagPb.distSrcInterfaceMod.PBLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectPatchRmLinkMod {
  
  @JSImport("ipfs-http-client/dist/src/object/patch/rm-link", "createRmLink")
  @js.native
  val createRmLink: Factory[
    js.Function3[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID<unknown, number, number, imported_cid.Version> */ /* cid */ Any, 
      /* link */ String | PBLink, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID<unknown, number, number, imported_cid.Version> */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type ObjectPatchAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_patch.API<HTTPClientExtraOptions> */ Any
}
