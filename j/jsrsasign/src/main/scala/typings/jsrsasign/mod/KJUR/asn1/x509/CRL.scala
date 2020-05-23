package typings.jsrsasign.mod.KJUR.asn1.x509

import typings.jsrsasign.anon.Rsaprvkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * X.509 CRL class to sign and generate hex encoded CRL
  * @param params associative array of parameters (ex. {'tbsobj': obj, 'rsaprvkey': key})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - tbsobj - specify `KJUR.asn1.x509.TBSCertList` object to be signed
  * - rsaprvkey - specify `RSAKey` object CA private key
  *
  * NOTE: 'params' can be omitted.
  * __EXAMPLE__
  * @example
  * var prvKey = new RSAKey(); // CA's private key
  * prvKey.readPrivateKeyFromASN1HexString("3080...");
  * var crl = new KJUR.asn1x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
  * crl.sign(); // issue CRL by CA's private key
  * var hCRL = crl.getEncodedHex();
  *
  * // CertificateList  ::=  SEQUENCE  {
  * //     tbsCertList          TBSCertList,
  * //     signatureAlgorithm   AlgorithmIdentifier,
  * //     signatureValue       BIT STRING  }
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.CRL")
@js.native
class CRL ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRL {
  def this(params: Rsaprvkey) = this()
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
    * get PEM formatted CRL string after signed
    * @return PEM formatted string of certificate
    * @example
    * var cert = new KJUR.asn1.x509.CRL({'tbsobj': tbs, 'rsaprvkey': prvKey});
    * cert.sign();
    * var sPEM =  cert.getPEMString();
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
    * sign TBSCertList and set signature value internally
    * @example
    * var cert = new KJUR.asn1.x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
    * cert.sign();
    */
  /* CompleteClass */
  override def sign(): Unit = js.native
}

