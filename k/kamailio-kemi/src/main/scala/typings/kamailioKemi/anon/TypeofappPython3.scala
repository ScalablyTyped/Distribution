package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappPython3 extends js.Object {
  
  def exec(method: String): Double = js.native
  
  def exec_p1(method: String, p1: String): Double = js.native
}
object TypeofappPython3 {
  
  @scala.inline
  def apply(exec: String => Double, exec_p1: (String, String) => Double): TypeofappPython3 = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), exec_p1 = js.Any.fromFunction2(exec_p1))
    __obj.asInstanceOf[TypeofappPython3]
  }
  
  @scala.inline
  implicit class TypeofappPython3Ops[Self <: TypeofappPython3] (val x: Self) extends AnyVal {
    
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
    def setExec(value: String => Double): Self = this.set("exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec_p1(value: (String, String) => Double): Self = this.set("exec_p1", js.Any.fromFunction2(value))
  }
}
