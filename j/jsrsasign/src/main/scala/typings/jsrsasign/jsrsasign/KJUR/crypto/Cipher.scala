package typings.jsrsasign.jsrsasign.KJUR.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cipher class to encrypt and decrypt data
  * @param params parameters for constructor
  * @description
  * Here is supported canonicalized cipher algorithm names and its standard names:
  * - RSA - RSA/ECB/PKCS1Padding (default for RSAKey)
  * - RSAOAEP - RSA/ECB/OAEPWithSHA-1AndMGF1Padding
  * - RSAOAEP224 - RSA/ECB/OAEPWithSHA-224AndMGF1Padding(*)
  * - RSAOAEP256 - RSA/ECB/OAEPWithSHA-256AndMGF1Padding
  * - RSAOAEP384 - RSA/ECB/OAEPWithSHA-384AndMGF1Padding(*)
  * - RSAOAEP512 - RSA/ECB/OAEPWithSHA-512AndMGF1Padding(*)
  * NOTE: (*) is not supported in Java JCE.
  * Currently this class supports only RSA encryption and decryption.
  * However it is planning to implement also symmetric ciphers near in the future.
  * @example
  */
@JSGlobal("jsrsasign.KJUR.crypto.Cipher")
@js.native
object Cipher extends js.Object
