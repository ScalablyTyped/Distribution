package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpv extends js.Object {
  // Return the value of pseudo-variable `pvname`.
  // The returned value can be string or integer
  def get(pvname: java.lang.String): java.lang.String | scala.Double | scala.Null
  // Same as get(), but returns empty string on null
  def gete(pvname: java.lang.String): java.lang.String | scala.Double
  // Same as get(), but returns `vn` on null
  def getvn(pvname: java.lang.String, vn: scala.Double): java.lang.String | scala.Double
  // Return the value of pseudo-variable pvname if it is different than $null or
  // the parameter vs if the variable is having the $null value.
  def getvs(pvname: java.lang.String, vn: scala.Double): java.lang.String | scala.Double
  // Return the value of pseudo-variable pvname if it is different than $null or the string <<null>> if the
  // variable is having the $null value. This should be used instead of KSR.pv.get(...) in the scripting
  // languages that throw and error when attempting to print a NULL (or NIL) value.
  def getw(pvname: java.lang.String): java.lang.String | scala.Double
  // Return true if pseudo-variable pvname is $null.
  def is_null(pvname: java.lang.String): scala.Boolean
  // Set the value of pseudo-variable pvname to integer value provided by parameter val.
  def seti(pvname: java.lang.String, `val`: scala.Double): scala.Unit
  // Set the value of pseudo-variable pvname to string value provided by parameter val.
  def sets(pvname: java.lang.String, `val`: java.lang.String): scala.Unit
  // Set the value of pseudo-variable pvname to $null.
  def unset(pvname: java.lang.String): scala.Unit
}

object Typeofpv {
  @scala.inline
  def apply(
    get: java.lang.String => java.lang.String | scala.Double | scala.Null,
    gete: java.lang.String => java.lang.String | scala.Double,
    getvn: (java.lang.String, scala.Double) => java.lang.String | scala.Double,
    getvs: (java.lang.String, scala.Double) => java.lang.String | scala.Double,
    getw: java.lang.String => java.lang.String | scala.Double,
    is_null: java.lang.String => scala.Boolean,
    seti: (java.lang.String, scala.Double) => scala.Unit,
    sets: (java.lang.String, java.lang.String) => scala.Unit,
    unset: java.lang.String => scala.Unit
  ): Typeofpv = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), gete = js.Any.fromFunction1(gete), getvn = js.Any.fromFunction2(getvn), getvs = js.Any.fromFunction2(getvs), getw = js.Any.fromFunction1(getw), is_null = js.Any.fromFunction1(is_null), seti = js.Any.fromFunction2(seti), sets = js.Any.fromFunction2(sets), unset = js.Any.fromFunction1(unset))
  
    __obj.asInstanceOf[Typeofpv]
  }
}

