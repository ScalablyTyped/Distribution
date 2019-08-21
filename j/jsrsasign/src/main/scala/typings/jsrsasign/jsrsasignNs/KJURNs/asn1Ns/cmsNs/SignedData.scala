package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
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
@JSGlobal("jsrsasign.KJUR.asn1.cms.SignedData")
@js.native
class SignedData () extends ASN1Object {
  var signerInfoList: js.Array[SignerInfo] = js.native
  def addCertificatesByPEM(certPEM: String): Unit = js.native
  def getContentInfo(): ContentInfo = js.native
  def getContentInfoEncodedHex(): String = js.native
  def getPEM(): String = js.native
}

