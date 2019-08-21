package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.Anon_Sn
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.IntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
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
  def this(params: Anon_Sn) = this()
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

