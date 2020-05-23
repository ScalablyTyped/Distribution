package typings.jsrsasign.jsrsasign.KJUR.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * static object for elliptic curve names and parameters
  * @description
  * This class provides parameters for named elliptic curves.
  * Currently it supoprts following curve names and aliases however
  * the name marked (*) are available for `KJUR.crypto.ECDSA` and
  * `KJUR.crypto.Signature` classes.
  *
  * - secp128r1
  * - secp160r1
  * - secp160k1
  * - secp192r1
  * - secp192k1
  * - secp224r1
  * - secp256r1, NIST P-256, P-256, prime256v1 (*)
  * - secp256k1 (*)
  * - secp384r1, NIST P-384, P-384 (*)
  * - secp521r1, NIST P-521, P-521
  *
  * You can register new curves by using the 'regist' method.
  */
@JSGlobal("jsrsasign.KJUR.crypto.ECParameterDB")
@js.native
object ECParameterDB extends js.Object

