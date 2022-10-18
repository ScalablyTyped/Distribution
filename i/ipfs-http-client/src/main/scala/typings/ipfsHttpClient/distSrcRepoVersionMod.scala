package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRepoVersionMod {
  
  @JSImport("ipfs-http-client/dist/src/repo/version", "createVersion")
  @js.native
  val createVersion: Factory[
    js.Function1[
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[Double]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RepoAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_repo.API<HTTPClientExtraOptions> */ Any
}
