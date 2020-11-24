package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SubjectPublicKeyInfo ASN.1 structure class
  * @param params parameter for subject public key
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - `RSAKey` object
  * - `KJUR.crypto.ECDSA` object
  * - `KJUR.crypto.DSA` object
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: DSA/ECDSA key object is also supported since asn1x509 1.0.6.
  *
  * @example
  * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(RSAKey_object);
  * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(KJURcryptoECDSA_object);
  * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(KJURcryptoDSA_object);
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.SubjectPublicKeyInfo")
@js.native
class SubjectPublicKeyInfo ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectPublicKeyInfo {
  def this(params: DSA) = this()
  def this(params: ECDSA) = this()
  def this(params: RSAKey) = this()
}
