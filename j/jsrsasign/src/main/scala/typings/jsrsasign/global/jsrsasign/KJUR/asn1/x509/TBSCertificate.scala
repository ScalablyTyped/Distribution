package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 TBSCertificate structure class
  * @param params associative array of parameters (ex. {})
  * @example
  *  var o = new KJUR.asn1.x509.TBSCertificate();
  *  o.setSerialNumberByParam({'int': 4});
  *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
  *  o.setIssuerByParam({'str': '/C=US/O=a'});
  *  o.setNotBeforeByParam({'str': '130504235959Z'});
  *  o.setNotAfterByParam({'str': '140504235959Z'});
  *  o.setSubjectByParam({'str': '/C=US/CN=b'});
  *  o.setSubjectPublicKey(rsaPubKey);
  *  o.appendExtension(new KJUR.asn1.x509.BasicConstraints({'cA':true}));
  *  o.appendExtension(new KJUR.asn1.x509.KeyUsage({'bin':'11'}));
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.TBSCertificate")
@js.native
class TBSCertificate ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate {
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

