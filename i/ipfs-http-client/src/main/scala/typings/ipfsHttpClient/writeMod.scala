package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function3[
    /* path */ String, 
    /* input */ String | Blob | Uint8Array | AsyncIterable[Uint8Array], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_write.WriteOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* path */ String, 
    /* input */ String | Blob | Uint8Array | AsyncIterable[Uint8Array], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_write.WriteOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Unit]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/files/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
