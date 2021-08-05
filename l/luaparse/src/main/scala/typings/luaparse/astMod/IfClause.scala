package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfClause
  extends StObject
     with Base[typings.luaparse.luaparseStrings.IfClause]
     with _Node {
  
  var body: js.Array[Statement]
  
  var condition: Expression
}
object IfClause {
  
  inline def apply(body: js.Array[Statement], condition: Expression): IfClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfClause")
    __obj.asInstanceOf[IfClause]
  }
  
  extension [Self <: IfClause](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
