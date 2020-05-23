package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.Prvkeyobj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * X.509 Certificate class to sign and generate hex encoded certificate
  * @param params associative array of parameters (ex. {'tbscertobj': obj, 'prvkeyobj': key})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - tbscertobj - specify `KJUR.asn1.x509.TBSCertificate` object
  * - prvkeyobj - specify `RSAKey`, `KJUR.crypto.ECDSA` or `KJUR.crypto.DSA` object for CA private key to sign the certificate
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: DSA/ECDSA is also supported for CA signging key from asn1x509 1.0.6.
  * @example
  * var caKey = KEYUTIL.getKey(caKeyPEM); // CA's private key
  * var cert = new KJUR.asn1x509.Certificate({'tbscertobj': tbs, 'prvkeyobj': caKey});
  * cert.sign(); // issue certificate by CA's private key
  * var certPEM = cert.getPEMString();
  *
  * // Certificate  ::=  SEQUENCE  {
  * //     tbsCertificate       TBSCertificate,
  * //     signatureAlgorithm   AlgorithmIdentifier,
  * //     signature            BIT STRING  }
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.Certificate")
@js.native
class Certificate ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Certificate {
  def this(params: Prvkeyobj) = this()
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
    * get PEM formatted certificate string after signed
    * @return PEM formatted string of certificate
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({'tbscertobj': tbs, 'prvkeyobj': prvKey});
    * cert.sign();
    * var sPEM = cert.getPEMString();
    */
  /* CompleteClass */
  override def getPEMString(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
  /**
    * set signature value internally by hex string
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({'tbscertobj': tbs});
    * cert.setSignatureHex('01020304');
    */
  /* CompleteClass */
  override def setSignatureHex(sigHex: String): Unit = js.native
  /**
    * sign TBSCertificate and set signature value internally
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({tbscertobj: tbs, prvkeyobj: prvKey});
    * cert.sign();
    */
  /* CompleteClass */
  override def sign(): Unit = js.native
}

