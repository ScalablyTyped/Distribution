package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod {
  
  @scala.inline
  def apply(options: ClientOptions): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.Source */ /* input */ js.Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.AddOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.Source */ /* input */ js.Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.AddOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
    ]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
