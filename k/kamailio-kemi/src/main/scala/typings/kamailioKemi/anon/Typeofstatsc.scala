package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstatsc extends js.Object {
  
  def statsc_reset(): Double = js.native
}
object Typeofstatsc {
  
  @scala.inline
  def apply(statsc_reset: () => Double): Typeofstatsc = {
    val __obj = js.Dynamic.literal(statsc_reset = js.Any.fromFunction0(statsc_reset))
    __obj.asInstanceOf[Typeofstatsc]
  }
  
  @scala.inline
  implicit class TypeofstatscOps[Self <: Typeofstatsc] (val x: Self) extends AnyVal {
    
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
    def setStatsc_reset(value: () => Double): Self = this.set("statsc_reset", js.Any.fromFunction0(value))
  }
}
