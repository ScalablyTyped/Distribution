package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigProfilesApplyMod {
  
  @JSImport("ipfs-http-client/dist/src/config/profiles/apply", "createApply")
  @js.native
  val createApply: Factory[
    js.Function2[
      /* profile */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profiles.ProfilesApplyOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profiles.ProfilesApplyResult */ Any
      ]
    ]
  ] = js.native
  
  type ConfigProfilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profiles.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
