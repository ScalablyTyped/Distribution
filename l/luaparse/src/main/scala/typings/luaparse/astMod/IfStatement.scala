package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.IfStatement] {
  
  var clauses: js.Array[IfClause | ElseifClause | ElseClause] = js.native
}
object IfStatement {
  
  @scala.inline
  def apply(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typings.luaparse.luaparseStrings.IfStatement
  ): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
