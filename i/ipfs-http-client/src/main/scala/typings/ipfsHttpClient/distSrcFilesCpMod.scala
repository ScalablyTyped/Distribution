package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesCpMod {
  
  @JSImport("ipfs-http-client/dist/src/files/cp", "createCp")
  @js.native
  val createCp: Factory[
    js.Function3[
      /* sources */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any) | (js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
      ]), 
      /* destination */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.CpOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type FilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
