package typings.jsSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionConstructor extends js.Object {
  
  def reference(func: js.Function): FunctionConstructor = js.native
}
object FunctionConstructor {
  
  @scala.inline
  def apply(reference: js.Function => FunctionConstructor): FunctionConstructor = {
    val __obj = js.Dynamic.literal(reference = js.Any.fromFunction1(reference))
    __obj.asInstanceOf[FunctionConstructor]
  }
  
  @scala.inline
  implicit class FunctionConstructorOps[Self <: FunctionConstructor] (val x: Self) extends AnyVal {
    
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
    def setReference(value: js.Function => FunctionConstructor): Self = this.set("reference", js.Any.fromFunction1(value))
  }
}
