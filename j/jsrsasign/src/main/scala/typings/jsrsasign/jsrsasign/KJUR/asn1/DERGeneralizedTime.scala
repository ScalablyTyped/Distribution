package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait DERGeneralizedTime extends DERAbstractTime {
  
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * When you specify UTC time, use 'Date.UTC' method like this:
    * o1 = new DERUTCTime();
    * o1.setByDate(date);
    *
    * date = new Date(Date.UTC(2015, 0, 31, 23, 59, 59, 0)); #2015JAN31 23:59:59
    */
  def setByDate(dateObject: Date): Unit = js.native
  
  var withMillis: Boolean = js.native
}
