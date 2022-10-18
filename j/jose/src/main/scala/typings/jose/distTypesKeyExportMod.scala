package typings.jose

import typings.jose.distTypesTypesMod.JWK
import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyExportMod {
  
  @JSImport("jose/dist/types/key/export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportJWK(key: js.typedarray.Uint8Array): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  inline def exportJWK(key: KeyLike): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  
  inline def exportPKCS8(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPKCS8")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def exportSPKI(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportSPKI")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
