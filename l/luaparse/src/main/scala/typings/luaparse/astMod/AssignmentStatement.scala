package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.AssignmentStatement]
     with _Statement {
  
  var init: js.Array[Expression]
  
  var variables: js.Array[IndexExpression | MemberExpression | Identifier]
}
object AssignmentStatement {
  
  inline def apply(init: js.Array[Expression], variables: js.Array[IndexExpression | MemberExpression | Identifier]): AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentStatement")
    __obj.asInstanceOf[AssignmentStatement]
  }
  
  extension [Self <: AssignmentStatement](x: Self) {
    
    inline def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    inline def setVariables(value: js.Array[IndexExpression | MemberExpression | Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: (IndexExpression | MemberExpression | Identifier)*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
