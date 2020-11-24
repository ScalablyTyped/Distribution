package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoflogSystemd extends js.Object {
  
  def sd_journal_print(slev: String, stxt: String): Double = js.native
  
  def sd_journal_send_xvap(xname: String): Double = js.native
}
object TypeoflogSystemd {
  
  @scala.inline
  def apply(sd_journal_print: (String, String) => Double, sd_journal_send_xvap: String => Double): TypeoflogSystemd = {
    val __obj = js.Dynamic.literal(sd_journal_print = js.Any.fromFunction2(sd_journal_print), sd_journal_send_xvap = js.Any.fromFunction1(sd_journal_send_xvap))
    __obj.asInstanceOf[TypeoflogSystemd]
  }
  
  @scala.inline
  implicit class TypeoflogSystemdOps[Self <: TypeoflogSystemd] (val x: Self) extends AnyVal {
    
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
    def setSd_journal_print(value: (String, String) => Double): Self = this.set("sd_journal_print", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSd_journal_send_xvap(value: String => Double): Self = this.set("sd_journal_send_xvap", js.Any.fromFunction1(value))
  }
}
