package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cadesNs

import typings.jsrsasign.Anon_Length
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for RFC 5126 CAdES CompleteCertificateRefs attribute
  * @param params associative array of parameters
  * @description
  * ```
  * id-aa-ets-certificateRefs OBJECT IDENTIFIER =
  *    1.2.840.113549.1.9.16.2.21
  * CompleteCertificateRefs ::=  SEQUENCE OF OtherCertID
  * ```
  * @example
  * o = new KJUR.asn1.cades.CompleteCertificateRefs([certPEM1,certPEM2]);
  */
@JSGlobal("jsrsasign.KJUR.asn1.cades.CompleteCertificateRefs")
@js.native
class CompleteCertificateRefs () extends Attribute {
  def this(params: Anon_Length) = this()
  /**
    * set value by array
    * @param a array of `KJUR.asn1.cades.OtherCertID` argument
    */
  def setByArray(a: js.Array[OtherCertID]): Unit = js.native
}

