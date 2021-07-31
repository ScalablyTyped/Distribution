package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dagGetMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): APIWithExtraOptions[
    js.Function2[
      /* ipfsPath */ typings.cids.mod.^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
      ]
    ], 
    HttpOptions
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[APIWithExtraOptions[
    js.Function2[
      /* ipfsPath */ typings.cids.mod.^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
      ]
    ], 
    HttpOptions
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dag/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
