package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpike extends js.Object {
  
  def pike_check_req(): Double = js.native
}
object Typeofpike {
  
  @scala.inline
  def apply(pike_check_req: () => Double): Typeofpike = {
    val __obj = js.Dynamic.literal(pike_check_req = js.Any.fromFunction0(pike_check_req))
    __obj.asInstanceOf[Typeofpike]
  }
  
  @scala.inline
  implicit class TypeofpikeOps[Self <: Typeofpike] (val x: Self) extends AnyVal {
    
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
    def setPike_check_req(value: () => Double): Self = this.set("pike_check_req", js.Any.fromFunction0(value))
  }
}
