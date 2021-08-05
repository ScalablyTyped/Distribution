package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function2[
    /* cid */ String | Uint8Array | typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* cid */ String | Uint8Array | typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[js.Any]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/block/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
