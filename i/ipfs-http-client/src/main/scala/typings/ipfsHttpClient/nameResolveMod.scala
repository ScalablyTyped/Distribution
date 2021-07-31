package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameResolveMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* path */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    AsyncGenerator[js.Any, Unit, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* path */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    AsyncGenerator[js.Any, Unit, js.Any]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/name/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
