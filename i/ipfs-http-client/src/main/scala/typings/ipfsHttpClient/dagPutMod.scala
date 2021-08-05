package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dagPutMod {
  
  inline def apply(clientOptions: ClientOptions): APIWithExtraOptions[
    js.Function2[
      /* dagNode */ js.Any, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
      ], 
      js.Promise[typings.cids.mod.^]
    ], 
    HttpOptions
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[APIWithExtraOptions[
    js.Function2[
      /* dagNode */ js.Any, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
      ], 
      js.Promise[typings.cids.mod.^]
    ], 
    HttpOptions
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dag/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
