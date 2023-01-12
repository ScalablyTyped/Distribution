package typings.jsRijndael

import typings.jsRijndael.jsRijndaelBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mcryptMod {
  
  @JSImport("js-rijndael/mcrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(
    ctext: js.Array[Double],
    IV: js.Array[Double],
    key: js.Array[Double],
    cipher: CipherAlgorithm,
    mode: Mode
  ): `true` | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ctext.asInstanceOf[js.Any], IV.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[`true` | js.Array[Double]]
  
  inline def encrypt(
    message: js.Array[Double],
    IV: js.Array[Double],
    key: js.Array[Double],
    cipher: CipherAlgorithm,
    mode: Mode
  ): `true` | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(message.asInstanceOf[js.Any], IV.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[`true` | js.Array[Double]]
  
  inline def getBlockSize(cipher: CipherAlgorithm): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSize")(cipher.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getIVSize(cipher: CipherAlgorithm): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIVSize")(cipher.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getKeySize(cipher: CipherAlgorithm): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeySize")(cipher.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def listAlgorithms(): js.Array[CipherAlgorithm] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAlgorithms")().asInstanceOf[js.Array[CipherAlgorithm]]
  
  inline def listModes(): js.Array[Mode] = ^.asInstanceOf[js.Dynamic].applyDynamic("listModes")().asInstanceOf[js.Array[Mode]]
  
  /* Inlined std.Record<js-rijndael.js-rijndael/mcrypt.CipherAlgorithm, js-rijndael.js-rijndael/mcrypt.CipherBody> */
  trait Cipher extends StObject {
    
    var `rijndael-128`: CipherBody
    
    var `rijndael-192`: CipherBody
    
    var `rijndael-256`: CipherBody
  }
  object Cipher {
    
    inline def apply(`rijndael-128`: CipherBody, `rijndael-192`: CipherBody, `rijndael-256`: CipherBody): Cipher = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("rijndael-128")(`rijndael-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("rijndael-192")(`rijndael-192`.asInstanceOf[js.Any])
      __obj.updateDynamic("rijndael-256")(`rijndael-256`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cipher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
      
      inline def `setRijndael-128`(value: CipherBody): Self = StObject.set(x, "rijndael-128", value.asInstanceOf[js.Any])
      
      inline def `setRijndael-192`(value: CipherBody): Self = StObject.set(x, "rijndael-192", value.asInstanceOf[js.Any])
      
      inline def `setRijndael-256`(value: CipherBody): Self = StObject.set(x, "rijndael-256", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsRijndael.jsRijndaelStrings.`rijndael-128`
    - typings.jsRijndael.jsRijndaelStrings.`rijndael-192`
    - typings.jsRijndael.jsRijndaelStrings.`rijndael-256`
  */
  trait CipherAlgorithm extends StObject
  object CipherAlgorithm {
    
    inline def `rijndael-128`: typings.jsRijndael.jsRijndaelStrings.`rijndael-128` = "rijndael-128".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.`rijndael-128`]
    
    inline def `rijndael-192`: typings.jsRijndael.jsRijndaelStrings.`rijndael-192` = "rijndael-192".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.`rijndael-192`]
    
    inline def `rijndael-256`: typings.jsRijndael.jsRijndaelStrings.`rijndael-256` = "rijndael-256".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.`rijndael-256`]
  }
  
  trait CipherBody extends StObject {
    
    var blockSize: Double
    
    var keySize: Double
  }
  object CipherBody {
    
    inline def apply(blockSize: Double, keySize: Double): CipherBody = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CipherBody] (val x: Self) extends AnyVal {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsRijndael.jsRijndaelStrings.cbc
    - typings.jsRijndael.jsRijndaelStrings.cfb
    - typings.jsRijndael.jsRijndaelStrings.ctr
    - typings.jsRijndael.jsRijndaelStrings.ecb
    - typings.jsRijndael.jsRijndaelStrings.ncfb
    - typings.jsRijndael.jsRijndaelStrings.nofb
  */
  trait Mode extends StObject
  object Mode {
    
    inline def cbc: typings.jsRijndael.jsRijndaelStrings.cbc = "cbc".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.cbc]
    
    inline def cfb: typings.jsRijndael.jsRijndaelStrings.cfb = "cfb".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.cfb]
    
    inline def ctr: typings.jsRijndael.jsRijndaelStrings.ctr = "ctr".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.ctr]
    
    inline def ecb: typings.jsRijndael.jsRijndaelStrings.ecb = "ecb".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.ecb]
    
    inline def ncfb: typings.jsRijndael.jsRijndaelStrings.ncfb = "ncfb".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.ncfb]
    
    inline def nofb: typings.jsRijndael.jsRijndaelStrings.nofb = "nofb".asInstanceOf[typings.jsRijndael.jsRijndaelStrings.nofb]
  }
}
