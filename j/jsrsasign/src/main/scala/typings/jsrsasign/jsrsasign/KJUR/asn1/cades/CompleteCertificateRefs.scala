package typings.jsrsasign.jsrsasign.KJUR.asn1.cades

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.Attribute
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
@js.native
trait CompleteCertificateRefs extends Attribute {
  /**
    * set value by array
    * @param a array of `KJUR.asn1.cades.OtherCertID` argument
    */
  def setByArray(a: js.Array[OtherCertID]): Unit = js.native
}

object CompleteCertificateRefs {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByArray: js.Array[OtherCertID] => Unit
  ): CompleteCertificateRefs = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByArray = js.Any.fromFunction1(setByArray))
    __obj.asInstanceOf[CompleteCertificateRefs]
  }
  @scala.inline
  implicit class CompleteCertificateRefsOps[Self <: CompleteCertificateRefs] (val x: Self) extends AnyVal {
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
    def setSetByArray(value: js.Array[OtherCertID] => Unit): Self = this.set("setByArray", js.Any.fromFunction1(value))
  }
  
}

