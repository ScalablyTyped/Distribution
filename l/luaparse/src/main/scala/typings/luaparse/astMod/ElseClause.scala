package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElseClause
  extends Base[typings.luaparse.luaparseStrings.ElseClause]
     with _Node {
  
  var body: js.Array[Statement] = js.native
}
object ElseClause {
  
  @scala.inline
  def apply(body: js.Array[Statement], `type`: typings.luaparse.luaparseStrings.ElseClause): ElseClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElseClause]
  }
  
  @scala.inline
  implicit class ElseClauseMutableBuilder[Self <: ElseClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
  }
}
