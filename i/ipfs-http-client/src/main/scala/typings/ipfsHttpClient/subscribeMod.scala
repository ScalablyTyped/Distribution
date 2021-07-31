package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function3[
    /* topic */ js.Any, 
    /* handler */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* topic */ js.Any, 
    /* handler */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/pubsub/subscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
