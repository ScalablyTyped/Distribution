package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRepoStatMod {
  
  @JSImport("ipfs-http-client/dist/src/repo/stat", "createStat")
  @js.native
  val createStat: Factory[
    js.Function1[
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_repo.StatResult */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RepoAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_repo.API<HTTPClientExtraOptions> */ Any
}
