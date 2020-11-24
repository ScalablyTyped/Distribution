package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofimc extends js.Object {
  
  def imc_manager(): Double = js.native
}
object Typeofimc {
  
  @scala.inline
  def apply(imc_manager: () => Double): Typeofimc = {
    val __obj = js.Dynamic.literal(imc_manager = js.Any.fromFunction0(imc_manager))
    __obj.asInstanceOf[Typeofimc]
  }
  
  @scala.inline
  implicit class TypeofimcOps[Self <: Typeofimc] (val x: Self) extends AnyVal {
    
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
    def setImc_manager(value: () => Double): Self = this.set("imc_manager", js.Any.fromFunction0(value))
  }
}
