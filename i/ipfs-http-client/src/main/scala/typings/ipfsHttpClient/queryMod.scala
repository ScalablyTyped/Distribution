package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Id
import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* peerId */ String | typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[Id]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* peerId */ String | typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[Id]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dht/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
