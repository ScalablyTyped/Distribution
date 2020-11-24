package typings.jestSnapshot.anon

import typings.prettier.mod.Doc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdebug extends js.Object {
  
  def printDocToDebug(doc: Doc_): String = js.native
}
object Typeofdebug {
  
  @scala.inline
  def apply(printDocToDebug: Doc_ => String): Typeofdebug = {
    val __obj = js.Dynamic.literal(printDocToDebug = js.Any.fromFunction1(printDocToDebug))
    __obj.asInstanceOf[Typeofdebug]
  }
  
  @scala.inline
  implicit class TypeofdebugOps[Self <: Typeofdebug] (val x: Self) extends AnyVal {
    
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
    def setPrintDocToDebug(value: Doc_ => String): Self = this.set("printDocToDebug", js.Any.fromFunction1(value))
  }
}
