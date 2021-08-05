package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bwMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function1[/* options */ js.UndefOr[js.Object], AsyncGenerator[js.Any, Unit, js.Any]] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[js.Object], AsyncGenerator[js.Any, Unit, js.Any]]]
  
  @JSImport("ipfs-http-client/dist/src/stats/bw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
