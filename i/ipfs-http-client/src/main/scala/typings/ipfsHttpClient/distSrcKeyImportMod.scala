package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyImportMod {
  
  @JSImport("ipfs-http-client/dist/src/key/import", "createImport")
  @js.native
  val createImport: Factory[
    js.Function4[
      /* name */ String, 
      /* pem */ String, 
      /* password */ String, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_key.Key */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type KeyAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_key.API<HTTPClientExtraOptions> */ Any
}
