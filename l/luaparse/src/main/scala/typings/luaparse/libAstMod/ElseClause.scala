package typings.luaparse.libAstMod

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
  
  inline def apply(body: js.Array[Statement]): ElseClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElseClause")
    __obj.asInstanceOf[ElseClause]
  }
  
  extension [Self <: ElseClause](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
  }
}
