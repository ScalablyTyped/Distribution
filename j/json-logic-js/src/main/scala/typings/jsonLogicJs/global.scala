package typings.jsonLogicJs

import typings.jsonLogicJs.mod.AdditionalOperation
import typings.jsonLogicJs.mod.RulesLogic
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsonFactory {
    
    @JSGlobal("jsonFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addOperation(name: String, code: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_operation")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def apply(logic: RulesLogic[AdditionalOperation]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def apply(logic: RulesLogic[AdditionalOperation], data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getOperator(logic: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_operator")(logic.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getValues(logic: Record[String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_values")(logic.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isLogic(logic: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_logic")(logic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def rmOperation(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rm_operation")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def ruleLike(rule: Any, pattern: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rule_like")(rule.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def truthy(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def usesData(logic: Record[String, Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uses_data")(logic.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  }
}
