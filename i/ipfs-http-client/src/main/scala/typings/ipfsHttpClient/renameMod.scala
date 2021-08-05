package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function3[
    /* oldName */ js.Any, 
    /* newName */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* oldName */ js.Any, 
    /* newName */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/key/rename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
