package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolveMod {
  
  @JSImport("ipfs-http-client/dist/src/resolve", "createResolve")
  @js.native
  val createResolve: Factory[
    js.Function2[
      /* path */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.ResolveOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[String]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RootAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.API<HTTPClientExtraOptions> */ Any
}
