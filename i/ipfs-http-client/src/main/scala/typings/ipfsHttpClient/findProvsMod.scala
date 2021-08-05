package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findProvsMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function2[
    /* cid */ typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.FindProvsOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.PeerInfo */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* cid */ typings.cids.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.FindProvsOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.PeerInfo */ js.Any
    ]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dht/find-provs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
