package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base class for ASN.1 DER encoder object */
@js.native
trait ASN1Object extends js.Object {
  /** hexadecimal string of ASN.1 TLV length(L) */
  var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  var hV: String = js.native
  /** flag whether internal data was changed */
  var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  def getEncodedHex(): String = js.native
  def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  def getValueHex(): String = js.native
}

object ASN1Object {
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
    isModified: String
  ): ASN1Object = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1Object]
  }
  @scala.inline
  implicit class ASN1ObjectOps[Self <: ASN1Object] (val x: Self) extends AnyVal {
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
    def setGetEncodedHex(value: () => String): Self = this.set("getEncodedHex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFreshValueHex(value: () => String): Self = this.set("getFreshValueHex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLengthHexFromValue(value: () => String): Self = this.set("getLengthHexFromValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueHex(value: () => String): Self = this.set("getValueHex", js.Any.fromFunction0(value))
    @scala.inline
    def setHL(value: String): Self = this.set("hL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHT(value: String): Self = this.set("hT", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTLV(value: String): Self = this.set("hTLV", value.asInstanceOf[js.Any])
    @scala.inline
    def setHV(value: String): Self = this.set("hV", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsModified(value: String): Self = this.set("isModified", value.asInstanceOf[js.Any])
  }
  
}

