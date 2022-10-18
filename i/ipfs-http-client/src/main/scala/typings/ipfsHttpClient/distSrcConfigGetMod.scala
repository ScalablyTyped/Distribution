package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigGetMod {
  
  @JSImport("ipfs-http-client/dist/src/config/get", "createGet")
  @js.native
  val createGet: Factory[
    js.Function2[
      /* key */ String, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[String | js.Object]
    ]
  ] = js.native
  
  type ConfigAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
