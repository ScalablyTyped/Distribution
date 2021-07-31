package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unwantMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* cid */ typings.cids.mod.^ | js.Array[typings.cids.mod.^], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* cid */ typings.cids.mod.^ | js.Array[typings.cids.mod.^], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
    ], 
    js.Promise[Unit]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/bitswap/unwant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
