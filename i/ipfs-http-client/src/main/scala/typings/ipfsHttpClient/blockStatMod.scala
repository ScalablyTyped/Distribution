package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockStatMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* cid */ typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.StatOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.Stat */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* cid */ typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.StatOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.Stat */ js.Any
    ]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/block/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
