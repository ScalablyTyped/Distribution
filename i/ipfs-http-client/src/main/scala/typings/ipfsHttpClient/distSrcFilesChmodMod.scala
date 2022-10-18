package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesChmodMod {
  
  @JSImport("ipfs-http-client/dist/src/files/chmod", "createChmod")
  @js.native
  val createChmod: Factory[
    js.Function3[
      /* path */ String, 
      /* mode */ String | Double, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.ChmodOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type FilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
