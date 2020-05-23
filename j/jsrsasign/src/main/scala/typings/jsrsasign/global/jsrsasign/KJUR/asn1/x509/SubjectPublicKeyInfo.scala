package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
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
class SubjectPublicKeyInfo ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectPublicKeyInfo {
  def this(params: DSA) = this()
  def this(params: ECDSA) = this()
  def this(params: RSAKey) = this()
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  override var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  override var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  override var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  override var hV: String = js.native
  /** flag whether internal data was changed */
  /* CompleteClass */
  override var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
}

