package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.IfStatement]
     with _Statement {
  
  var clauses: js.Array[IfClause | ElseifClause | ElseClause]
}
object IfStatement {
  
  @scala.inline
  def apply(clauses: js.Array[IfClause | ElseifClause | ElseClause]): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[IfStatement]
  }
  
  @scala.inline
  implicit class IfStatementMutableBuilder[Self <: IfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClauses(value: js.Array[IfClause | ElseifClause | ElseClause]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClausesVarargs(value: (IfClause | ElseifClause | ElseClause)*): Self = StObject.set(x, "clauses", js.Array(value :_*))
  }
}
