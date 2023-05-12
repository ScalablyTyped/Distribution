package typings.jose

import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyGenerateKeyPairMod {
  
  @JSImport("jose/dist/types/key/generate_key_pair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKeyPair[T /* <: KeyLike */](alg: String): js.Promise[GenerateKeyPairResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GenerateKeyPairResult[T]]]
  inline def generateKeyPair[T /* <: KeyLike */](alg: String, options: GenerateKeyPairOptions): js.Promise[GenerateKeyPairResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GenerateKeyPairResult[T]]]
  
  trait GenerateKeyPairOptions extends StObject {
    
    /**
      * The EC "crv" (Curve) or OKP "crv" (Subtype of Key Pair) value to generate. The curve must be
      * both supported on the runtime as well as applicable for the given JWA algorithm identifier.
      */
    var crv: js.UndefOr[String] = js.undefined
    
    /**
      * (Only effective in Web Crypto API runtimes) The value to use as
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey SubtleCrypto.generateKey()}
      * `extractable` argument. Default is false.
      */
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A hint for RSA algorithms to generate an RSA key of a given `modulusLength` (Key size in bits).
      * JOSE requires 2048 bits or larger. Default is 2048.
      */
    var modulusLength: js.UndefOr[Double] = js.undefined
  }
  object GenerateKeyPairOptions {
    
    inline def apply(): GenerateKeyPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateKeyPairOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateKeyPairOptions] (val x: Self) extends AnyVal {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
      
      inline def setModulusLengthUndefined: Self = StObject.set(x, "modulusLength", js.undefined)
    }
  }
  
  trait GenerateKeyPairResult[T /* <: KeyLike */] extends StObject {
    
    /** The generated Private Key. */
    var privateKey: T
    
    /** Public Key corresponding to the generated Private Key. */
    var publicKey: T
  }
  object GenerateKeyPairResult {
    
    inline def apply[T /* <: KeyLike */](privateKey: T, publicKey: T): GenerateKeyPairResult[T] = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateKeyPairResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateKeyPairResult[?], T /* <: KeyLike */] (val x: Self & GenerateKeyPairResult[T]) extends AnyVal {
      
      inline def setPrivateKey(value: T): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: T): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
