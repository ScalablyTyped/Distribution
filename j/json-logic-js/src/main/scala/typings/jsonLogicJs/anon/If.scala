package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
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
  implicit class IfMutableBuilder[Self <: If] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIf(value: Array[js.Any]): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
  }
}
