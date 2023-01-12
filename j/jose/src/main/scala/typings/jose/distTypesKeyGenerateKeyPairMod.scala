package typings.jose

import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyGenerateKeyPairMod {
  
  @JSImport("jose/dist/types/key/generate_key_pair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKeyPair(alg: String): js.Promise[GenerateKeyPairResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GenerateKeyPairResult]]
  inline def generateKeyPair(alg: String, options: GenerateKeyPairOptions): js.Promise[GenerateKeyPairResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GenerateKeyPairResult]]
  
  trait GenerateKeyPairOptions extends StObject {
    
    /**
      * The EC "crv" (Curve) or OKP "crv" (Subtype of Key Pair) value to generate. The curve must be
      * both supported on the runtime as well as applicable for the given JWA algorithm identifier.
      */
    var crv: js.UndefOr[String] = js.undefined
    
    /**
      * (Web Cryptography API specific) The value to use as
      * [SubtleCrypto.generateKey()](https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey)
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
  
  trait GenerateKeyPairResult extends StObject {
    
    /** The generated Private Key. */
    var privateKey: KeyLike
    
    /** Public Key corresponding to the generated Private Key. */
    var publicKey: KeyLike
  }
  object GenerateKeyPairResult {
    
    inline def apply(privateKey: KeyLike, publicKey: KeyLike): GenerateKeyPairResult = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateKeyPairResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateKeyPairResult] (val x: Self) extends AnyVal {
      
      inline def setPrivateKey(value: KeyLike): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: KeyLike): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
