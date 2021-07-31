package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Any
  extends StObject
     with _RulesLogic {
  
  @JSName("!")
  var Exclamationmark: js.Any
}
object Any {
  
  @scala.inline
  def apply(Exclamationmark: js.Any): Any = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  
  @scala.inline
  implicit class AnyMutableBuilder[Self <: Any] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclamationmark(value: js.Any): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
  }
}
