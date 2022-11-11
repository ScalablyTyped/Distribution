package typings.jsRijndael

import typings.jsRijndael.jsRijndaelBooleans.`true`
import typings.jsRijndael.mcryptMod.CipherAlgorithm
import typings.jsRijndael.mcryptMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-rijndael", JSImport.Namespace)
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
}
