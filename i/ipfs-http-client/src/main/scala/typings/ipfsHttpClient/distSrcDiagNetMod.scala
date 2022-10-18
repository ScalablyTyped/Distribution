package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDiagNetMod {
  
  @JSImport("ipfs-http-client/dist/src/diag/net", "createNet")
  @js.native
  val createNet: Factory[
    js.Function1[
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[Any]
    ]
  ] = js.native
  
  type DiagAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_diag.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
