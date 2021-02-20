package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Missing extends _RulesLogic {
  
  var missing: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[_] = js.native
}
object Missing {
  
  @scala.inline
  def apply(
    missing: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[_]
  ): Missing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Missing]
  }
  
  @scala.inline
  implicit class MissingMutableBuilder[Self <: Missing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissing(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[_]
    ): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingVarargs(value: js.Any*): Self = StObject.set(x, "missing", js.Array(value :_*))
  }
}
