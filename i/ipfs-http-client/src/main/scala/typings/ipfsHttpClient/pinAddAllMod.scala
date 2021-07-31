package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinAddAllMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* source */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    AsyncGenerator[typings.cids.mod.^, Unit, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* source */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    AsyncGenerator[typings.cids.mod.^, Unit, js.Any]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/pin/add-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
