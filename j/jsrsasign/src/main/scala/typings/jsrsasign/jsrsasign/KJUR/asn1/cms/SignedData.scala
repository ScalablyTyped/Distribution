package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for SignerInfo ASN.1 structure of CMS SignedData
  * @param params associative array of parameters
  * @description
  * ```
  * SignedData ::= SEQUENCE {
  *    version CMSVersion,
  *    digestAlgorithms DigestAlgorithmIdentifiers,
  *    encapContentInfo EncapsulatedContentInfo,
  *    certificates [0] IMPLICIT CertificateSet OPTIONAL,
  *    crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
  *    signerInfos SignerInfos }
  * SignerInfos ::= SET OF SignerInfo
  * CertificateSet ::= SET OF CertificateChoices
  * DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier
  * CertificateSet ::= SET OF CertificateChoices
  * RevocationInfoChoices ::= SET OF RevocationInfoChoice
  * ```
  *
  * @example
  * sd = new KJUR.asn1.cms.SignedData();
  * sd.dEncapContentInfo.setContentValueStr("test string");
  * sd.signerInfoList[0].setForContentAndHash({sdObj: sd,
  *                                            eciObj: sd.dEncapContentInfo,
  *                                            hashAlg: 'sha256'});
  * sd.signerInfoList[0].dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
  * sd.signerInfoList[0].setSignerIdentifier(certPEM);
  * sd.signerInfoList[0].sign(prvP8PEM, "SHA256withRSA");
  * hex = sd.getContentInfoEncodedHex();
  */
trait SignedData extends ASN1Object {
  var signerInfoList: js.Array[SignerInfo]
  def addCertificatesByPEM(certPEM: String): Unit
  def getContentInfo(): ContentInfo
  def getContentInfoEncodedHex(): String
  def getPEM(): String
}

object SignedData {
  @scala.inline
  def apply(
    addCertificatesByPEM: String => Unit,
    getContentInfo: () => ContentInfo,
    getContentInfoEncodedHex: () => String,
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getPEM: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    signerInfoList: js.Array[SignerInfo]
  ): SignedData = {
    val __obj = js.Dynamic.literal(addCertificatesByPEM = js.Any.fromFunction1(addCertificatesByPEM), getContentInfo = js.Any.fromFunction0(getContentInfo), getContentInfoEncodedHex = js.Any.fromFunction0(getContentInfoEncodedHex), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEM = js.Any.fromFunction0(getPEM), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], signerInfoList = signerInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedData]
  }
}

