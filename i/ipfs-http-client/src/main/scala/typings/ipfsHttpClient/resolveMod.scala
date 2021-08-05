package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  inline def apply(clientOptions: ClientOptions): APIWithExtraOptions[
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
      ]
    ], 
    HttpOptions
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[APIWithExtraOptions[
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
      ]
    ], 
    HttpOptions
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dag/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
