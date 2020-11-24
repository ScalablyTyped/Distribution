package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmaxfwd extends js.Object {
  
  def is_maxfwd_lt(limit: Double): Double = js.native
  
  def process_maxfwd(limit: Double): Double = js.native
}
object Typeofmaxfwd {
  
  @scala.inline
  def apply(is_maxfwd_lt: Double => Double, process_maxfwd: Double => Double): Typeofmaxfwd = {
    val __obj = js.Dynamic.literal(is_maxfwd_lt = js.Any.fromFunction1(is_maxfwd_lt), process_maxfwd = js.Any.fromFunction1(process_maxfwd))
    __obj.asInstanceOf[Typeofmaxfwd]
  }
  
  @scala.inline
  implicit class TypeofmaxfwdOps[Self <: Typeofmaxfwd] (val x: Self) extends AnyVal {
    
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
    def setIs_maxfwd_lt(value: Double => Double): Self = this.set("is_maxfwd_lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcess_maxfwd(value: Double => Double): Self = this.set("process_maxfwd", js.Any.fromFunction1(value))
  }
}
