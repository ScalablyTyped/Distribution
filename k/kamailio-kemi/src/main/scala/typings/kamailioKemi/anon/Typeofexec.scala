package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofexec extends js.Object {
  
  def exec_avp(cmd: String): Double = js.native
  
  def exec_dset(cmd: String): Double = js.native
  
  def exec_msg(cmd: String): Double = js.native
}
object Typeofexec {
  
  @scala.inline
  def apply(exec_avp: String => Double, exec_dset: String => Double, exec_msg: String => Double): Typeofexec = {
    val __obj = js.Dynamic.literal(exec_avp = js.Any.fromFunction1(exec_avp), exec_dset = js.Any.fromFunction1(exec_dset), exec_msg = js.Any.fromFunction1(exec_msg))
    __obj.asInstanceOf[Typeofexec]
  }
  
  @scala.inline
  implicit class TypeofexecOps[Self <: Typeofexec] (val x: Self) extends AnyVal {
    
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
    def setExec_avp(value: String => Double): Self = this.set("exec_avp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec_dset(value: String => Double): Self = this.set("exec_dset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec_msg(value: String => Double): Self = this.set("exec_msg", js.Any.fromFunction1(value))
  }
}
