package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstatsd extends js.Object {
  
  def statsd_decr(key: String): Double = js.native
  
  def statsd_gauge(key: String, `val`: String): Double = js.native
  
  def statsd_incr(key: String): Double = js.native
  
  def statsd_set(key: String, `val`: String): Double = js.native
  
  def statsd_start(key: String): Double = js.native
  
  def statsd_stop(key: String): Double = js.native
}
object Typeofstatsd {
  
  @scala.inline
  def apply(
    statsd_decr: String => Double,
    statsd_gauge: (String, String) => Double,
    statsd_incr: String => Double,
    statsd_set: (String, String) => Double,
    statsd_start: String => Double,
    statsd_stop: String => Double
  ): Typeofstatsd = {
    val __obj = js.Dynamic.literal(statsd_decr = js.Any.fromFunction1(statsd_decr), statsd_gauge = js.Any.fromFunction2(statsd_gauge), statsd_incr = js.Any.fromFunction1(statsd_incr), statsd_set = js.Any.fromFunction2(statsd_set), statsd_start = js.Any.fromFunction1(statsd_start), statsd_stop = js.Any.fromFunction1(statsd_stop))
    __obj.asInstanceOf[Typeofstatsd]
  }
  
  @scala.inline
  implicit class TypeofstatsdOps[Self <: Typeofstatsd] (val x: Self) extends AnyVal {
    
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
    def setStatsd_decr(value: String => Double): Self = this.set("statsd_decr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatsd_gauge(value: (String, String) => Double): Self = this.set("statsd_gauge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStatsd_incr(value: String => Double): Self = this.set("statsd_incr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatsd_set(value: (String, String) => Double): Self = this.set("statsd_set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStatsd_start(value: String => Double): Self = this.set("statsd_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatsd_stop(value: String => Double): Self = this.set("statsd_stop", js.Any.fromFunction1(value))
  }
}
