package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbenchmark extends js.Object {
  
  def bm_log_timer(tname: String): Double = js.native
  
  def bm_start_timer(tname: String): Double = js.native
}
object Typeofbenchmark {
  
  @scala.inline
  def apply(bm_log_timer: String => Double, bm_start_timer: String => Double): Typeofbenchmark = {
    val __obj = js.Dynamic.literal(bm_log_timer = js.Any.fromFunction1(bm_log_timer), bm_start_timer = js.Any.fromFunction1(bm_start_timer))
    __obj.asInstanceOf[Typeofbenchmark]
  }
  
  @scala.inline
  implicit class TypeofbenchmarkOps[Self <: Typeofbenchmark] (val x: Self) extends AnyVal {
    
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
    def setBm_log_timer(value: String => Double): Self = this.set("bm_log_timer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBm_start_timer(value: String => Double): Self = this.set("bm_start_timer", js.Any.fromFunction1(value))
  }
}
