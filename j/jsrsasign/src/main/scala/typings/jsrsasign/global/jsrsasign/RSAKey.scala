package typings.jsrsasign.global.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tom Wu's RSA Key class and extension */
@JSGlobal("jsrsasign.RSAKey")
@js.native
open class RSAKey ()
  extends typings.jsrsasign.mod.RSAKey
object RSAKey {
  
  @JSGlobal("jsrsasign.RSAKey")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * static method to get array of hex field values from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field hex value
    * @example
    * RSAKey.getHexValueArrayOfChildrenFromHex("3082...") → ["00", "3b42...", ...]
    */
  /* static member */
  inline def getHexValueArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHexValueArrayOfChildrenFromHex")(sPEMPrivateKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * static method to get array of field positions from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field positions
    * @example
    * RSAKey.getPosArrayOfChildrenFromHex("3082...") → [8, 32, ...]
    */
  /* static member */
  inline def getPosArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosArrayOfChildrenFromHex")(sPEMPrivateKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
