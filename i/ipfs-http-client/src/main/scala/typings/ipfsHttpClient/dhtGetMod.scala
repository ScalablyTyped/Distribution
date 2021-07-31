package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dhtGetMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* key */ String | Uint8Array, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Uint8Array]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* key */ String | Uint8Array, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Uint8Array]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dht/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
