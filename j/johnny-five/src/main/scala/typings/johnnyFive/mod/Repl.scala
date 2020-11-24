package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repl extends js.Object {
  
  def inject(`object`: js.Any): Unit = js.native
}
object Repl {
  
  @scala.inline
  def apply(inject: js.Any => Unit): Repl = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction1(inject))
    __obj.asInstanceOf[Repl]
  }
  
  @scala.inline
  implicit class ReplOps[Self <: Repl] (val x: Self) extends AnyVal {
    
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
    def setInject(value: js.Any => Unit): Self = this.set("inject", js.Any.fromFunction1(value))
  }
}
