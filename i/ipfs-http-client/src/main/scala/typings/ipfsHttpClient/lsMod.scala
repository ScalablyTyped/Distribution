package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lsMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ls.UnixFSEntry */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ls.UnixFSEntry */ js.Any
    ]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/files/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
