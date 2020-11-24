package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERSequence
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
@js.native
trait SubjectPublicKeyInfo extends ASN1Object {
  
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
