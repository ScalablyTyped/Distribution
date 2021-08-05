package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Type
import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinLsMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function1[/* options */ js.UndefOr[js.Object], AsyncGenerator[Type, Unit, js.Any]] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[js.Object], AsyncGenerator[Type, Unit, js.Any]]]
  
  @JSImport("ipfs-http-client/dist/src/pin/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
