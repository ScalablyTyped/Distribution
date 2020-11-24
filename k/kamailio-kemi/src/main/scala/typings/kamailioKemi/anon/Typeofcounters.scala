package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcounters extends js.Object {
  
  def add(sname: String, v: Double): Double = js.native
  
  def inc(sname: String): Double = js.native
  
  def reset(sname: String): Double = js.native
}
object Typeofcounters {
  
  @scala.inline
  def apply(add: (String, Double) => Double, inc: String => Double, reset: String => Double): Typeofcounters = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), inc = js.Any.fromFunction1(inc), reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[Typeofcounters]
  }
  
  @scala.inline
  implicit class TypeofcountersOps[Self <: Typeofcounters] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (String, Double) => Double): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInc(value: String => Double): Self = this.set("inc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: String => Double): Self = this.set("reset", js.Any.fromFunction1(value))
  }
}
