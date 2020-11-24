package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpv extends js.Object {
  
  // Return the value of pseudo-variable `pvname`.
  // The returned value can be string or integer
  def get(pvname: String): String | Double | Null = js.native
  
  // Same as get(), but returns empty string on null
  def gete(pvname: String): String | Double = js.native
  
  // Same as get(), but returns `vn` on null
  def getvn(pvname: String, vn: Double): String | Double = js.native
  
  // Return the value of pseudo-variable pvname if it is different than $null or
  // the parameter vs if the variable is having the $null value.
  def getvs(pvname: String, vn: Double): String | Double = js.native
  
  // Return the value of pseudo-variable pvname if it is different than $null or the string <<null>> if the
  // variable is having the $null value. This should be used instead of KSR.pv.get(...) in the scripting
  // languages that throw and error when attempting to print a NULL (or NIL) value.
  def getw(pvname: String): String | Double = js.native
  
  // Return true if pseudo-variable pvname is $null.
  def is_null(pvname: String): Boolean = js.native
  
  // Set the value of pseudo-variable pvname to integer value provided by parameter val.
  def seti(pvname: String, `val`: Double): Unit = js.native
  
  // Set the value of pseudo-variable pvname to string value provided by parameter val.
  def sets(pvname: String, `val`: String): Unit = js.native
  
  // Set the value of pseudo-variable pvname to $null.
  def unset(pvname: String): Unit = js.native
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
  
  @scala.inline
  implicit class TypeofpvOps[Self <: Typeofpv] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => String | Double | Null): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGete(value: String => String | Double): Self = this.set("gete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetvn(value: (String, Double) => String | Double): Self = this.set("getvn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetvs(value: (String, Double) => String | Double): Self = this.set("getvs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetw(value: String => String | Double): Self = this.set("getw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_null(value: String => Boolean): Self = this.set("is_null", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeti(value: (String, Double) => Unit): Self = this.set("seti", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSets(value: (String, String) => Unit): Self = this.set("sets", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnset(value: String => Unit): Self = this.set("unset", js.Any.fromFunction1(value))
  }
}
