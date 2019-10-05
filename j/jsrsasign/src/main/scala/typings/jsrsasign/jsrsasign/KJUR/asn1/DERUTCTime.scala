package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER UTCTime
  * @param params associative array of parameters (ex. {'str': '130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  *
  * NOTE: 'params' can be omitted.
  * @example
  * d1 = new KJUR.asn1.DERUTCTime();
  * d1.setString('130430125959Z');
  *
  * d2 = new KJUR.asn1.DERUTCTime({'str': '130430125959Z'});
  * d3 = new KJUR.asn1.DERUTCTime({'date': new Date(Date.UTC(2015, 0, 31, 0, 0, 0, 0))});
  * d4 = new KJUR.asn1.DERUTCTime('130430125959Z');
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERUTCTime")
@js.native
class DERUTCTime () extends DERAbstractTime {
  def this(params: String) = this()
  def this(params: DateParam) = this()
  def this(params: HexParam) = this()
  def this(params: StringParam) = this()
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * o = new KJUR.asn1.DERUTCTime();
    * o.setByDate(new Date("2016/12/31"));
    */
  def setByDate(dateObject: Date): Unit = js.native
}

