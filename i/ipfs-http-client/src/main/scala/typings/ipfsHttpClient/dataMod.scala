package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[/* cid */ js.Any, /* options */ js.UndefOr[js.Object], js.Promise[Uint8Array]] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* cid */ js.Any, /* options */ js.UndefOr[js.Object], js.Promise[Uint8Array]]]
  
  @JSImport("ipfs-http-client/dist/src/object/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
