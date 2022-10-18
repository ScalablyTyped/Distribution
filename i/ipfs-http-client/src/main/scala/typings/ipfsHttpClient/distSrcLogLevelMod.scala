package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLogLevelMod {
  
  @JSImport("ipfs-http-client/dist/src/log/level", "createLevel")
  @js.native
  val createLevel: Factory[
    js.Function3[
      /* subsystem */ String, 
      /* level */ String, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[Any]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type LogAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_log.API<HTTPClientExtraOptions> */ Any
}
