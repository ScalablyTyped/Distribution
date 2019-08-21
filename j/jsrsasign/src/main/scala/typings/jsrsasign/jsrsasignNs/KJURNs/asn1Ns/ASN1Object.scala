package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base class for ASN.1 DER encoder object */
@JSGlobal("jsrsasign.KJUR.asn1.ASN1Object")
@js.native
class ASN1Object () extends js.Object {
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

