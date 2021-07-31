package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.LocalStatement]
     with _Statement {
  
  var init: js.Array[Expression]
  
  var variables: js.Array[Identifier]
}
object LocalStatement {
  
  @scala.inline
  def apply(init: js.Array[Expression], variables: js.Array[Identifier]): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LocalStatement")
    __obj.asInstanceOf[LocalStatement]
  }
  
  @scala.inline
  implicit class LocalStatementMutableBuilder[Self <: LocalStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Identifier*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
