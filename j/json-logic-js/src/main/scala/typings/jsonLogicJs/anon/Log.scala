package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log
  extends StObject
     with _RulesLogic {
  
  var log: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
}
object Log {
  
  @scala.inline
  def apply(
    log: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
  ): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
    ): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
