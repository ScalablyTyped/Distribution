package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  @JSGlobal("KSR.crypto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def aesDecrypt(ins: String, keys: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aes_decrypt")(ins.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def aesEncrypt(ins: String, keys: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aes_encrypt")(ins.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
}
