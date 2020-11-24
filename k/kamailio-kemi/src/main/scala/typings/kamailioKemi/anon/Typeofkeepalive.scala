package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofkeepalive extends js.Object {
  
  def is_alive(dest: String): Double = js.native
}
object Typeofkeepalive {
  
  @scala.inline
  def apply(is_alive: String => Double): Typeofkeepalive = {
    val __obj = js.Dynamic.literal(is_alive = js.Any.fromFunction1(is_alive))
    __obj.asInstanceOf[Typeofkeepalive]
  }
  
  @scala.inline
  implicit class TypeofkeepaliveOps[Self <: Typeofkeepalive] (val x: Self) extends AnyVal {
    
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
    def setIs_alive(value: String => Double): Self = this.set("is_alive", js.Any.fromFunction1(value))
  }
}
