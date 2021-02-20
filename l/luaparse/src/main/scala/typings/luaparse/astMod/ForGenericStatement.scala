package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForGenericStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.ForGenericStatement] {
  
  var body: js.Array[Statement] = js.native
  
  var iterators: js.Array[Expression] = js.native
  
  var variables: js.Array[Identifier] = js.native
}
object ForGenericStatement {
  
  @scala.inline
  def apply(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier]
  ): ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForGenericStatement]
  }
  
  @scala.inline
  implicit class ForGenericStatementMutableBuilder[Self <: ForGenericStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setIterators(value: js.Array[Expression]): Self = StObject.set(x, "iterators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteratorsVarargs(value: Expression*): Self = StObject.set(x, "iterators", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Identifier*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
