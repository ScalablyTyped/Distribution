package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.DERSequence
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.DSA
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.ECDSA
import typings.jsrsasign.jsrsasignNs.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class SubjectPublicKeyInfo () extends ASN1Object {
  def this(params: DSA) = this()
  def this(params: ECDSA) = this()
  def this(params: RSAKey) = this()
  def getASN1Object(): DERSequence = js.native
  def setPubKey(key: DSA): Unit = js.native
  def setPubKey(key: ECDSA): Unit = js.native
  /**
    * @param key `RSAKey`, `KJUR.crypto.ECDSA` or `KJUR.crypto.DSA` object
    * @example
    * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo();
    * pubKey = KEYUTIL.getKey(PKCS8PUBKEYPEM);
    * spki.setPubKey(pubKey);
    */
  def setPubKey(key: RSAKey): Unit = js.native
}

