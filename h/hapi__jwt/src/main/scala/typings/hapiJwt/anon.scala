package typings.hapiJwt

import typings.hapiJwt.hapiJwtStrings.JWT
import typings.hapiJwt.mod.hapiJwt.NoAlgorithm
import typings.hapiJwt.mod.hapiJwt.RawToken
import typings.hapiJwt.mod.hapiJwt.SupportedAlgorithm
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alg extends StObject {
    
    /**
      * The algorithm used to sign the token.
      */
    var alg: String
    
    /**
      *  The token type.
      */
    var typ: js.UndefOr[JWT] = js.undefined
  }
  object Alg {
    
    inline def apply(alg: String): Alg = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setTyp(value: JWT): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
  
  trait Algorithm extends StObject {
    
    var algorithm: SupportedAlgorithm | NoAlgorithm
    
    var key: String | Buffer
  }
  object Algorithm {
    
    inline def apply(algorithm: SupportedAlgorithm | NoAlgorithm, key: String | Buffer): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: SupportedAlgorithm | NoAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Generate extends StObject {
    
    def generate(value: String, algorithm: NoAlgorithm, key: String): String | scala.Nothing = js.native
    /**
      * Function to generate a signature using a supported algorithm.
      *
      * @param value string that represents the signer.
      * @param algorithm string containing an accepted algorithm to be used.
      * @param key string that represents the signature.
      */
    def generate(value: String, algorithm: SupportedAlgorithm, key: String): String | scala.Nothing = js.native
    
    def verify(raw: RawToken, algorithm: NoAlgorithm, key: String): Boolean | scala.Nothing = js.native
    /**
      * Function to verify a signature using a supported algorithm.
      *
      * @param raw an object that contains the token that was sent broken out by header, payload, and signature.
      * @param algorithm string containing an accepted algorithm to be used.
      * @param key string signature to be verify.
      */
    def verify(raw: RawToken, algorithm: SupportedAlgorithm, key: String): Boolean | scala.Nothing = js.native
  }
}
