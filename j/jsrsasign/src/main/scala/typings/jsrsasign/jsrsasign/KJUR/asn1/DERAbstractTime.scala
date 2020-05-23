package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasignStrings.gen
import typings.jsrsasign.jsrsasignStrings.utc
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base class for ASN.1 DER Generalized/UTCTime class
  * @param params associative array of parameters (ex. {'str': '130430235959Z'})
  */
@js.native
trait DERAbstractTime extends ASN1Object {
  @JSName("formatDate")
  /* private */ def formatDate_gen(dateObject: Date, `type`: gen, withMillis: Boolean): String = js.native
  /**
    * format date string by Data object
    * @param type 'utc' or 'gen'
    * @param withMillis flag for with millisections or not
    * @description
    * 'withMillis' flag is supported from asn1 1.0.6.
    */
  @JSName("formatDate")
  /* private */ def formatDate_utc(dateObject: Date, `type`: utc, withMillis: Boolean): String = js.native
  /**
    * get string value of this string object
    * @return string value of this time object
    */
  def getString(): String = js.native
  /**
    * set value by a Date object
    * @param year year of date (ex. 2013)
    * @param month month of date between 1 and 12 (ex. 12)
    * @param day day of month
    * @param hour hours of date
    * @param min minutes of date
    * @param sec seconds of date
    */
  def setByDateValue(year: Double, month: Double, day: Double, hour: Double, min: Double, sec: Double): Unit = js.native
  /**
    * set value by a string
    * @param newS value by a string to set such like "130430235959Z"
    */
  def setString(newS: String): Unit = js.native
  /* private */ def zeroPadding(s: String, len: Double): String = js.native
}

