package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpv extends js.Object {
  // Return the value of pseudo-variable `pvname`.
  // The returned value can be string or integer
  def get(pvname: String): String | Double | Null
  // Same as get(), but returns empty string on null
  def gete(pvname: String): String | Double
  // Same as get(), but returns `vn` on null
  def getvn(pvname: String, vn: Double): String | Double
  // Return the value of pseudo-variable pvname if it is different than $null or
  // the parameter vs if the variable is having the $null value.
  def getvs(pvname: String, vn: Double): String | Double
  // Return the value of pseudo-variable pvname if it is different than $null or the string <<null>> if the
  // variable is having the $null value. This should be used instead of KSR.pv.get(...) in the scripting
  // languages that throw and error when attempting to print a NULL (or NIL) value.
  def getw(pvname: String): String | Double
  // Return true if pseudo-variable pvname is $null.
  def is_null(pvname: String): Boolean
  // Set the value of pseudo-variable pvname to integer value provided by parameter val.
  def seti(pvname: String, `val`: Double): Unit
  // Set the value of pseudo-variable pvname to string value provided by parameter val.
  def sets(pvname: String, `val`: String): Unit
  // Set the value of pseudo-variable pvname to $null.
  def unset(pvname: String): Unit
}

object Typeofpv {
  @scala.inline
  def apply(
    get: String => String | Double | Null,
    gete: String => String | Double,
    getvn: (String, Double) => String | Double,
    getvs: (String, Double) => String | Double,
    getw: String => String | Double,
    is_null: String => Boolean,
    seti: (String, Double) => Unit,
    sets: (String, String) => Unit,
    unset: String => Unit
  ): Typeofpv = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), gete = js.Any.fromFunction1(gete), getvn = js.Any.fromFunction2(getvn), getvs = js.Any.fromFunction2(getvs), getw = js.Any.fromFunction1(getw), is_null = js.Any.fromFunction1(is_null), seti = js.Any.fromFunction2(seti), sets = js.Any.fromFunction2(sets), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[Typeofpv]
  }
}

