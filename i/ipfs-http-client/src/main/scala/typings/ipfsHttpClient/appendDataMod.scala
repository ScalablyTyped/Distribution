package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appendDataMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function3[
    /* cid */ js.Any, 
    /* data */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[typings.cids.mod.^]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* cid */ js.Any, 
    /* data */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[typings.cids.mod.^]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/object/patch/append-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
