package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.ipldDagPb.distSrcInterfaceMod.PBNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectGetMod {
  
  @JSImport("ipfs-http-client/dist/src/object/get", "createGet")
  @js.native
  val createGet: Factory[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID<unknown, number, number, imported_cid.Version> */ /* cid */ Any, 
      /* options */ js.UndefOr[
        AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[PBNode]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type ObjectAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.API<HTTPClientExtraOptions> */ Any
}
