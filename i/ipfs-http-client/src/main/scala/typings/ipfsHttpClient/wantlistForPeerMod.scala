package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wantlistForPeerMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* peerId */ String | Uint8Array | typings.cids.mod.^ | typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[js.Array[typings.cids.mod.^]]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* peerId */ String | Uint8Array | typings.cids.mod.^ | typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[js.Array[typings.cids.mod.^]]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/bitswap/wantlist-for-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
