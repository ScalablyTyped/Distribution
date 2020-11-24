package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofx extends js.Object {
  
  // Equivalent of drop from native kamailio.cfg scripting language, stop the execution of the SIP routing script
  // and drop routing further the SIP request branch or response.
  def drop(): Unit = js.native
  
  // Equivalent of exit from native kamailio.cfg scripting language, stop the execution of the SIP routing script.
  def exit(): Unit = js.native
  
  // Execute a function (specified by fname) exported by a Kamailio module. Additional parameters must be string
  // and they are passed to the Kamailio module function.
  def modf(name: String, params: String*): Double = js.native
}
object Typeofx {
  
  @scala.inline
  def apply(drop: () => Unit, exit: () => Unit, modf: (String, /* repeated */ String) => Double): Typeofx = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction0(drop), exit = js.Any.fromFunction0(exit), modf = js.Any.fromFunction2(modf))
    __obj.asInstanceOf[Typeofx]
  }
  
  @scala.inline
  implicit class TypeofxOps[Self <: Typeofx] (val x: Self) extends AnyVal {
    
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
    def setDrop(value: () => Unit): Self = this.set("drop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModf(value: (String, /* repeated */ String) => Double): Self = this.set("modf", js.Any.fromFunction2(value))
  }
}
