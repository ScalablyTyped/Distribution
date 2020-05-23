package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER GeneralizedTime
  * @param params associative array of parameters (ex. {'str': '20130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'20130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  * - millis - specify flag to show milliseconds (from 1.0.6)
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'withMillis' property is supported from asn1 1.0.6.
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERGeneralizedTime")
@js.native
class DERGeneralizedTime protected ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERGeneralizedTime {
  def this(params: String) = this()
  def this(params: DateParam) = this()
  def this(params: HexParam) = this()
  def this(params: StringParam) = this()
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  override var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  override var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  override var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  override var hV: String = js.native
  /** flag whether internal data was changed */
  /* CompleteClass */
  override var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
}

