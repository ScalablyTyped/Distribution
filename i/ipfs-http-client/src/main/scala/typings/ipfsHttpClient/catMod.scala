package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object catMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function2[
    /* path */ String | typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[Uint8Array]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* path */ String | typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[Uint8Array]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/cat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
