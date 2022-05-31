package typings.jsonLogicJs

import typings.jsonLogicJs.mod.RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsonFactory {
    
    @JSGlobal("jsonFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def apply(logic: RulesLogic): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def apply(logic: RulesLogic, data: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
