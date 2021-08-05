package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Addrs
import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findPeerMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function2[
    /* peerId */ typings.cids.mod.^ | typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Addrs]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* peerId */ typings.cids.mod.^ | typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Addrs]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dht/find-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
