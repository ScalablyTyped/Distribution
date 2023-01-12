package typings.jose

import typings.jose.distTypesTypesMod.JWK
import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyImportMod {
  
  @JSImport("jose/dist/types/key/import", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importJWK(jwk: JWK): js.Promise[KeyLike | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: String): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: String, octAsKeyObject: Boolean): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: Unit, octAsKeyObject: Boolean): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  
  inline def importPKCS8(pkcs8: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importPKCS8(pkcs8: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def importSPKI(spki: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importSPKI(spki: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def importX509(x509: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importX509(x509: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  trait PEMImportOptions extends StObject {
    
    /**
      * (Web Cryptography API specific) The value to use as
      * [SubtleCrypto.importKey()](https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey)
      * `extractable` argument. Default is false.
      */
    var extractable: js.UndefOr[Boolean] = js.undefined
  }
  object PEMImportOptions {
    
    inline def apply(): PEMImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PEMImportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PEMImportOptions] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
    }
  }
}
