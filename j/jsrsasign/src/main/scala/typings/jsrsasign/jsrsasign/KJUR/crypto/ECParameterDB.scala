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
object ECParameterDB extends js.Object {
  /**
    * get curve inforamtion associative array for curve name or alias
    * @param nameOrAlias curve name or alias name
    * @return associative array of curve parameters
    * @example
    * var param = KJUR.crypto.ECParameterDB.getByName('prime256v1');
    * var keylen = param['keylen'];
    * var n = param['n'];
    */
  def getByName(nameOrAlias: String): ECParameter = js.native
  /**
    * register new curve
    * @param name name of curve
    * @param keylen key length
    * @param pHex hexadecimal value of p
    * @param aHex hexadecimal value of a
    * @param bHex hexadecimal value of b
    * @param nHex hexadecimal value of n
    * @param hHex hexadecimal value of h
    * @param gxHex hexadecimal value of Gx
    * @param gyHex hexadecimal value of Gy
    * @param aliasList array of string for curve names aliases
    * @param oid Object Identifier for the curve
    * @param info information string for the curve
    */
  def regist(
    name: String,
    keylen: Double,
    pHex: String,
    aHex: String,
    bHex: String,
    nHex: String,
    hHex: String,
    gxHex: String,
    gyHex: String,
    aliasList: js.Array[String],
    oid: String,
    info: String
  ): Unit = js.native
}

