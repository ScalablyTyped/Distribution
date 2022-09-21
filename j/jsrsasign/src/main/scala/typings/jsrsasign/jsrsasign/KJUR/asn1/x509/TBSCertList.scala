package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 TBSCertList structure class for CRL
  * @param params associative array of parameters (ex. {})
  * @example
  *  var o = new KJUR.asn1.x509.TBSCertList();
  *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
  *  o.setIssuerByParam({'str': '/C=US/O=a'});
  *  o.setNotThisUpdateByParam({'str': '130504235959Z'});
  *  o.setNotNextUpdateByParam({'str': '140504235959Z'});
  *  o.addRevokedCert({'int': 4}, {'str':'130514235959Z'}));
  *  o.addRevokedCert({'hex': '0f34dd'}, {'str':'130514235959Z'}));
  *
  * // TBSCertList  ::=  SEQUENCE  {
  * //        version                 Version OPTIONAL,
  * //                                     -- if present, MUST be v2
  * //        signature               AlgorithmIdentifier,
  * //        issuer                  Name,
  * //        thisUpdate              Time,
  * //        nextUpdate              Time OPTIONAL,
  * //        revokedCertificates     SEQUENCE OF SEQUENCE  {
  * //             userCertificate         CertificateSerialNumber,
  * //             revocationDate          Time,
  * //             crlEntryExtensions      Extensions OPTIONAL
  * //                                      -- if present, version MUST be v2
  * //                                  }  OPTIONAL,
  * //        crlExtensions           [0]  EXPLICIT Extensions OPTIONAL
  */
trait TBSCertList
  extends StObject
     with ASN1Object {
  
  /**
    * add revoked certificate by parameter
    * @param snParam DERInteger parameter for certificate serial number
    * @param timeParam Time parameter for revocation date
    * @example
    * tbsc.addRevokedCert({'int': 3}, {'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def addRevokedCert(snParam: IntegerParam, timeParam: StringParam): Unit
  
  /**
    * set issuer name field by parameter
    * @param x500NameParam X500Name parameter
    * @example
    * tbsc.setIssuerParam({'str': '/C=US/CN=b'});
    * @see KJUR.asn1.x509.X500Name
    */
  def setIssuerByParam(x500NameParam: StringParam): Unit
  
  /**
    * set nextUpdate field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setNextUpdateByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setNextUpdateByParam(timeParam: StringParam): Unit
  
  /**
    * set signature algorithm field by parameter
    * @param algIdParam AlgorithmIdentifier parameter
    * @example
    * tbsc.setSignatureAlgByParam({'name': 'SHA1withRSA'});
    */
  def setSignatureAlgByParam(algIdParam: NameParam): Unit
  
  /**
    * set thisUpdate field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setThisUpdateByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setThisUpdateByParam(timeParam: StringParam): Unit
}
object TBSCertList {
  
  inline def apply(
    addRevokedCert: (IntegerParam, StringParam) => Unit,
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setIssuerByParam: StringParam => Unit,
    setNextUpdateByParam: StringParam => Unit,
    setSignatureAlgByParam: NameParam => Unit,
    setThisUpdateByParam: StringParam => Unit
  ): TBSCertList = {
    val __obj = js.Dynamic.literal(addRevokedCert = js.Any.fromFunction2(addRevokedCert), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setIssuerByParam = js.Any.fromFunction1(setIssuerByParam), setNextUpdateByParam = js.Any.fromFunction1(setNextUpdateByParam), setSignatureAlgByParam = js.Any.fromFunction1(setSignatureAlgByParam), setThisUpdateByParam = js.Any.fromFunction1(setThisUpdateByParam), params = null)
    __obj.asInstanceOf[TBSCertList]
  }
  
  extension [Self <: TBSCertList](x: Self) {
    
    inline def setAddRevokedCert(value: (IntegerParam, StringParam) => Unit): Self = StObject.set(x, "addRevokedCert", js.Any.fromFunction2(value))
    
    inline def setSetIssuerByParam(value: StringParam => Unit): Self = StObject.set(x, "setIssuerByParam", js.Any.fromFunction1(value))
    
    inline def setSetNextUpdateByParam(value: StringParam => Unit): Self = StObject.set(x, "setNextUpdateByParam", js.Any.fromFunction1(value))
    
    inline def setSetSignatureAlgByParam(value: NameParam => Unit): Self = StObject.set(x, "setSignatureAlgByParam", js.Any.fromFunction1(value))
    
    inline def setSetThisUpdateByParam(value: StringParam => Unit): Self = StObject.set(x, "setThisUpdateByParam", js.Any.fromFunction1(value))
  }
}
