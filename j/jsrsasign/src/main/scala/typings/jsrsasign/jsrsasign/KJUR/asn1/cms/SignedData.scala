package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait SignedData extends ASN1Object {
  
  def addCertificatesByPEM(certPEM: String): Unit = js.native
  
  def getContentInfo(): ContentInfo = js.native
  
  def getContentInfoEncodedHex(): String = js.native
  
  def getPEM(): String = js.native
  
  var signerInfoList: js.Array[SignerInfo] = js.native
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
  
  @scala.inline
  implicit class SignedDataOps[Self <: SignedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCertificatesByPEM(value: String => Unit): Self = this.set("addCertificatesByPEM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContentInfo(value: () => ContentInfo): Self = this.set("getContentInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentInfoEncodedHex(value: () => String): Self = this.set("getContentInfoEncodedHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPEM(value: () => String): Self = this.set("getPEM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignerInfoListVarargs(value: SignerInfo*): Self = this.set("signerInfoList", js.Array(value :_*))
    
    @scala.inline
    def setSignerInfoList(value: js.Array[SignerInfo]): Self = this.set("signerInfoList", value.asInstanceOf[js.Any])
  }
}
