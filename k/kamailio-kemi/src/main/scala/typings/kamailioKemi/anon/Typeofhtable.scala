package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhtable extends js.Object {
  
  def sht_has_name(sname: String, sop: String, sval: String): Double = js.native
  
  def sht_has_str_value(sname: String, sop: String, sval: String): Double = js.native
  
  def sht_iterator_end(iname: String): Double = js.native
  
  def sht_iterator_next(iname: String): Double = js.native
  
  def sht_iterator_start(iname: String, hname: String): Double = js.native
  
  def sht_lock(htname: String, skey: String): Double = js.native
  
  def sht_reset(hname: String): Double = js.native
  
  def sht_rm(hname: String, iname: String): Double = js.native
  
  def sht_rm_name(sname: String, sop: String, sval: String): Double = js.native
  
  def sht_rm_name_re(htname: String, rexp: String): Double = js.native
  
  def sht_rm_value(sname: String, sop: String, sval: String): Double = js.native
  
  def sht_rm_value_re(htname: String, rexp: String): Double = js.native
  
  def sht_setex(htname: String, itname: String, itval: Double): Double = js.native
  
  def sht_seti(htname: String, itname: String, itval: Double): Double = js.native
  
  def sht_sets(htname: String, itname: String, itval: String): Double = js.native
  
  def sht_setxi(htname: String, itname: String, itval: Double, exval: Double): Double = js.native
  
  def sht_setxs(htname: String, itname: String, itval: String, exval: Double): Double = js.native
  
  def sht_unlock(htname: String, skey: String): Double = js.native
}
object Typeofhtable {
  
  @scala.inline
  def apply(
    sht_has_name: (String, String, String) => Double,
    sht_has_str_value: (String, String, String) => Double,
    sht_iterator_end: String => Double,
    sht_iterator_next: String => Double,
    sht_iterator_start: (String, String) => Double,
    sht_lock: (String, String) => Double,
    sht_reset: String => Double,
    sht_rm: (String, String) => Double,
    sht_rm_name: (String, String, String) => Double,
    sht_rm_name_re: (String, String) => Double,
    sht_rm_value: (String, String, String) => Double,
    sht_rm_value_re: (String, String) => Double,
    sht_setex: (String, String, Double) => Double,
    sht_seti: (String, String, Double) => Double,
    sht_sets: (String, String, String) => Double,
    sht_setxi: (String, String, Double, Double) => Double,
    sht_setxs: (String, String, String, Double) => Double,
    sht_unlock: (String, String) => Double
  ): Typeofhtable = {
    val __obj = js.Dynamic.literal(sht_has_name = js.Any.fromFunction3(sht_has_name), sht_has_str_value = js.Any.fromFunction3(sht_has_str_value), sht_iterator_end = js.Any.fromFunction1(sht_iterator_end), sht_iterator_next = js.Any.fromFunction1(sht_iterator_next), sht_iterator_start = js.Any.fromFunction2(sht_iterator_start), sht_lock = js.Any.fromFunction2(sht_lock), sht_reset = js.Any.fromFunction1(sht_reset), sht_rm = js.Any.fromFunction2(sht_rm), sht_rm_name = js.Any.fromFunction3(sht_rm_name), sht_rm_name_re = js.Any.fromFunction2(sht_rm_name_re), sht_rm_value = js.Any.fromFunction3(sht_rm_value), sht_rm_value_re = js.Any.fromFunction2(sht_rm_value_re), sht_setex = js.Any.fromFunction3(sht_setex), sht_seti = js.Any.fromFunction3(sht_seti), sht_sets = js.Any.fromFunction3(sht_sets), sht_setxi = js.Any.fromFunction4(sht_setxi), sht_setxs = js.Any.fromFunction4(sht_setxs), sht_unlock = js.Any.fromFunction2(sht_unlock))
    __obj.asInstanceOf[Typeofhtable]
  }
  
  @scala.inline
  implicit class TypeofhtableOps[Self <: Typeofhtable] (val x: Self) extends AnyVal {
    
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
    def setSht_has_name(value: (String, String, String) => Double): Self = this.set("sht_has_name", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_has_str_value(value: (String, String, String) => Double): Self = this.set("sht_has_str_value", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_iterator_end(value: String => Double): Self = this.set("sht_iterator_end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSht_iterator_next(value: String => Double): Self = this.set("sht_iterator_next", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSht_iterator_start(value: (String, String) => Double): Self = this.set("sht_iterator_start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSht_lock(value: (String, String) => Double): Self = this.set("sht_lock", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSht_reset(value: String => Double): Self = this.set("sht_reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSht_rm(value: (String, String) => Double): Self = this.set("sht_rm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSht_rm_name(value: (String, String, String) => Double): Self = this.set("sht_rm_name", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_rm_name_re(value: (String, String) => Double): Self = this.set("sht_rm_name_re", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSht_rm_value(value: (String, String, String) => Double): Self = this.set("sht_rm_value", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_rm_value_re(value: (String, String) => Double): Self = this.set("sht_rm_value_re", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSht_setex(value: (String, String, Double) => Double): Self = this.set("sht_setex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_seti(value: (String, String, Double) => Double): Self = this.set("sht_seti", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_sets(value: (String, String, String) => Double): Self = this.set("sht_sets", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSht_setxi(value: (String, String, Double, Double) => Double): Self = this.set("sht_setxi", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSht_setxs(value: (String, String, String, Double) => Double): Self = this.set("sht_setxs", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSht_unlock(value: (String, String) => Double): Self = this.set("sht_unlock", js.Any.fromFunction2(value))
  }
}
