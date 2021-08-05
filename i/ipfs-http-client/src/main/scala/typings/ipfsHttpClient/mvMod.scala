package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvMod {
  
  inline def apply(clientOptions: ClientOptions): js.Function1[
    /* args */ (js.Tuple3[
      /* a1 */ String, 
      /* a2 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mv.MvOptions */ js.Any) & HttpOptions
      ]
    ]) | (js.Tuple4[
      /* a1 */ String, 
      /* a2 */ String, 
      /* a3 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mv.MvOptions */ js.Any) & HttpOptions
      ]
    ]), 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* args */ (js.Tuple3[
      /* a1 */ String, 
      /* a2 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mv.MvOptions */ js.Any) & HttpOptions
      ]
    ]) | (js.Tuple4[
      /* a1 */ String, 
      /* a2 */ String, 
      /* a3 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mv.MvOptions */ js.Any) & HttpOptions
      ]
    ]), 
    js.Promise[Unit]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/files/mv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
