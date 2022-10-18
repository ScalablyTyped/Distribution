package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesTouchMod {
  
  @JSImport("ipfs-http-client/dist/src/files/touch", "createTouch")
  @js.native
  val createTouch: Factory[
    js.Function2[
      /* path */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.TouchOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type FilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
