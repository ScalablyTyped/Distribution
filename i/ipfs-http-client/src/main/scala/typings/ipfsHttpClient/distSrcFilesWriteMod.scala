package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.std.AsyncIterable
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesWriteMod {
  
  @JSImport("ipfs-http-client/dist/src/files/write", "createWrite")
  @js.native
  val createWrite: Factory[
    js.Function3[
      /* path */ String, 
      /* input */ String | Blob | js.typedarray.Uint8Array | js.Iterable[js.typedarray.Uint8Array] | AsyncIterable[js.typedarray.Uint8Array], 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.WriteOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type FilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
