package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.AddrsId
import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addrsMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function1[/* options */ js.UndefOr[js.Object], js.Promise[js.Array[AddrsId]]] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[js.Object], js.Promise[js.Array[AddrsId]]]]
  
  @JSImport("ipfs-http-client/dist/src/swarm/addrs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
