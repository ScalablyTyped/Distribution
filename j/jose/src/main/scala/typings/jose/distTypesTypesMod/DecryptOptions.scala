package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptOptions
  extends StObject
     with CritOption {
  
  /**
    * A list of accepted JWE "enc" (Encryption Algorithm) Header Parameter values. By default all
    * "enc" (Encryption Algorithm) values applicable for the used key/secret are allowed.
    */
  var contentEncryptionAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * In a browser runtime you have to provide an implementation for Inflate Raw when you expect JWEs
    * with compressed plaintext.
    */
  var inflateRaw: js.UndefOr[InflateFunction] = js.undefined
  
  /** A list of accepted JWE "alg" (Algorithm) Header Parameter values. */
  var keyManagementAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (PBES2 Key Management Algorithms only) Maximum allowed "p2c" (PBES2 Count) Header Parameter
    * value. The PBKDF2 iteration count defines the algorithm's computational expense. By default
    * this value is set to 10000.
    */
  var maxPBES2Count: js.UndefOr[Double] = js.undefined
}
object DecryptOptions {
  
  inline def apply(): DecryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptOptions] (val x: Self) extends AnyVal {
    
    inline def setContentEncryptionAlgorithms(value: js.Array[String]): Self = StObject.set(x, "contentEncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setContentEncryptionAlgorithmsUndefined: Self = StObject.set(x, "contentEncryptionAlgorithms", js.undefined)
    
    inline def setContentEncryptionAlgorithmsVarargs(value: String*): Self = StObject.set(x, "contentEncryptionAlgorithms", js.Array(value*))
    
    inline def setInflateRaw(value: /* input */ js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "inflateRaw", js.Any.fromFunction1(value))
    
    inline def setInflateRawUndefined: Self = StObject.set(x, "inflateRaw", js.undefined)
    
    inline def setKeyManagementAlgorithms(value: js.Array[String]): Self = StObject.set(x, "keyManagementAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setKeyManagementAlgorithmsUndefined: Self = StObject.set(x, "keyManagementAlgorithms", js.undefined)
    
    inline def setKeyManagementAlgorithmsVarargs(value: String*): Self = StObject.set(x, "keyManagementAlgorithms", js.Array(value*))
    
    inline def setMaxPBES2Count(value: Double): Self = StObject.set(x, "maxPBES2Count", value.asInstanceOf[js.Any])
    
    inline def setMaxPBES2CountUndefined: Self = StObject.set(x, "maxPBES2Count", js.undefined)
  }
}
