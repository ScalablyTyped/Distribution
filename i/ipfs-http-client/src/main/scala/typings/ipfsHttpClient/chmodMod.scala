package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chmodMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function3[
    /* path */ String, 
    /* mode */ String | Double, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_chmod.ChmodOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* path */ String, 
    /* mode */ String | Double, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_chmod.ChmodOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Unit]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/files/chmod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
