package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Any extends _RulesLogic {
  
  @JSName("!")
  var Exclamationmark: js.Any = js.native
}
object Any {
  
  @scala.inline
  def apply(Exclamationmark: js.Any): Any = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
    
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
    def setExclamationmark(value: js.Any): Self = this.set("!", value.asInstanceOf[js.Any])
  }
}
