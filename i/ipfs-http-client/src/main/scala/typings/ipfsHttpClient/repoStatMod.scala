package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.NumObjects
import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repoStatMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function1[/* options */ js.UndefOr[js.Object], js.Promise[NumObjects]] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[js.Object], js.Promise[NumObjects]]]
  
  @JSImport("ipfs-http-client/dist/src/repo/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
