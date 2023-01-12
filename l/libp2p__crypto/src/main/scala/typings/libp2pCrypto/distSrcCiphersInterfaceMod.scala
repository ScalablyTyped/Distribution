package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCiphersInterfaceMod {
  
  @js.native
  trait AESCipher extends StObject {
    
    def decrypt(data: js.typedarray.Uint8Array, password: String): js.Promise[js.typedarray.Uint8Array] = js.native
    def decrypt(data: js.typedarray.Uint8Array, password: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def encrypt(data: js.typedarray.Uint8Array, password: String): js.Promise[js.typedarray.Uint8Array] = js.native
    def encrypt(data: js.typedarray.Uint8Array, password: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  trait CreateOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var algorithmTagLength: js.UndefOr[Double] = js.undefined
    
    var digest: js.UndefOr[String] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var keyLength: js.UndefOr[Double] = js.undefined
    
    var nonceLength: js.UndefOr[Double] = js.undefined
    
    var saltLength: js.UndefOr[Double] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmTagLength(value: Double): Self = StObject.set(x, "algorithmTagLength", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmTagLengthUndefined: Self = StObject.set(x, "algorithmTagLength", js.undefined)
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
      
      inline def setNonceLength(value: Double): Self = StObject.set(x, "nonceLength", value.asInstanceOf[js.Any])
      
      inline def setNonceLengthUndefined: Self = StObject.set(x, "nonceLength", js.undefined)
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    }
  }
}
