package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("jsrsasign.KJUR.asn1.x509.TBSCertList")
@js.native
class TBSCertList ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList

