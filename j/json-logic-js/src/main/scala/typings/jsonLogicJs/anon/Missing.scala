package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Missing
  extends StObject
     with _RulesLogic {
  
  var missing: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[js.Any]
}
object Missing {
  
  inline def apply(
    missing: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[js.Any]
  ): Missing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Missing]
  }
  
  extension [Self <: Missing](x: Self) {
    
    inline def setMissing(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[js.Any]
    ): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingVarargs(value: js.Any*): Self = StObject.set(x, "missing", js.Array(value :_*))
  }
}
