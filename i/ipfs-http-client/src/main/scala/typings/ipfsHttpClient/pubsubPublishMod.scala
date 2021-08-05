package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubPublishMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function3[
    /* topic */ js.Any, 
    /* data */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* topic */ js.Any, 
    /* data */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Unit]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/pubsub/publish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
