package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* data */ js.Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* data */ js.Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[js.Any]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/block/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
