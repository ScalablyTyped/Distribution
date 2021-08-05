package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Call
import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  inline def apply(clientOptions: ClientOptions): Call = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[Call]
  
  @JSImport("ipfs-http-client/dist/src/refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
