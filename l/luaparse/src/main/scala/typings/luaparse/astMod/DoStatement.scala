package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.DoStatement]
     with _Statement {
  
  var body: js.Array[Statement]
}
object DoStatement {
  
  @scala.inline
  def apply(body: js.Array[Statement]): DoStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoStatement")
    __obj.asInstanceOf[DoStatement]
  }
  
  @scala.inline
  implicit class DoStatementMutableBuilder[Self <: DoStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
  }
}
