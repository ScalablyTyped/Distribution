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
  
  inline def importJWK[T /* <: KeyLike */](jwk: JWK): js.Promise[T | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def importJWK[T /* <: KeyLike */](jwk: JWK, alg: String): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def importJWK[T /* <: KeyLike */](jwk: JWK, alg: String, octAsKeyObject: Boolean): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def importJWK[T /* <: KeyLike */](jwk: JWK, alg: Unit, octAsKeyObject: Boolean): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  
  inline def importPKCS8[T /* <: KeyLike */](pkcs8: String, alg: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def importPKCS8[T /* <: KeyLike */](pkcs8: String, alg: String, options: PEMImportOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def importSPKI[T /* <: KeyLike */](spki: String, alg: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def importSPKI[T /* <: KeyLike */](spki: String, alg: String, options: PEMImportOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def importX509[T /* <: KeyLike */](x509: String, alg: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def importX509[T /* <: KeyLike */](x509: String, alg: String, options: PEMImportOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait PEMImportOptions extends StObject {
    
    /**
      * (Only effective in Web Crypto API runtimes) The value to use as
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey SubtleCrypto.importKey()}
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
