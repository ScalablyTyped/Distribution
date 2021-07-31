package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcResolveMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveSettings */ js.Any) & HttpOptions
    ], 
    js.Promise[String]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveSettings */ js.Any) & HttpOptions
    ], 
    js.Promise[String]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
