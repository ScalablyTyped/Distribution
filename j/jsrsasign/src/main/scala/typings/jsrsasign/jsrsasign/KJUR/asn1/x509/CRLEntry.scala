package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.AnonSn
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 CRLEntry structure class for CRL
  * @param params associative array of parameters (ex. {})
  * @example
  * var e = new KJUR.asn1.x509.CRLEntry({'time': {'str': '130514235959Z'}, 'sn': {'int': 234}});
  *
  * // revokedCertificates     SEQUENCE OF SEQUENCE  {
  * //     userCertificate         CertificateSerialNumber,
  * //     revocationDate          Time,
  * //     crlEntryExtensions      Extensions OPTIONAL
  * //                             -- if present, version MUST be v2 }
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.CRLEntry")
@js.native
class CRLEntry () extends ASN1Object {
  def this(params: AnonSn) = this()
  /**
    * set DERInteger parameter for serial number of revoked certificate
    * @param intParam DERInteger parameter for certificate serial number
    * @example
    * entry.setCertSerial({'int': 3});
    */
  def setCertSerial(intParam: IntegerParam): Unit = js.native
  /**
    * set Time parameter for revocation date
    * @param timeParam Time parameter for revocation date
    * @example
    * entry.setRevocationDate({'str': '130508235959Z'});
    */
  def setRevocationDate(timeParam: StringParam): Unit = js.native
}

