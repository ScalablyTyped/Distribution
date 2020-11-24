package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait If extends _RulesLogic {
  
  var `if`: Array[js.Any] = js.native
}
object If {
  
  @scala.inline
  def apply(`if`: Array[js.Any]): If = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.asInstanceOf[If]
  }
  
  @scala.inline
  implicit class IfOps[Self <: If] (val x: Self) extends AnyVal {
    
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
    def setIf(value: Array[js.Any]): Self = this.set("if", value.asInstanceOf[js.Any])
  }
}
