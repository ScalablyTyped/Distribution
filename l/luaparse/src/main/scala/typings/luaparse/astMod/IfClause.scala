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
  
  @scala.inline
  def apply(body: js.Array[Statement], condition: Expression): IfClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfClause")
    __obj.asInstanceOf[IfClause]
  }
  
  @scala.inline
  implicit class IfClauseMutableBuilder[Self <: IfClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
