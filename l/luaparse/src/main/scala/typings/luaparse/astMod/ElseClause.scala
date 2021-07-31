package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElseClause
  extends StObject
     with Base[typings.luaparse.luaparseStrings.ElseClause]
     with _Node {
  
  var body: js.Array[Statement]
}
object ElseClause {
  
  @scala.inline
  def apply(body: js.Array[Statement]): ElseClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElseClause")
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
