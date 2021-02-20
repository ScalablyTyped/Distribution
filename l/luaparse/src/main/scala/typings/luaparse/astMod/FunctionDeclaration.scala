package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDeclaration
  extends Expression
     with Base[typings.luaparse.luaparseStrings.FunctionDeclaration]
     with _Statement {
  
  var body: js.Array[Statement] = js.native
  
  var identifier: Identifier | MemberExpression | Null = js.native
  
  var isLocal: Boolean = js.native
  
  var parameters: js.Array[Identifier | VarargLiteral] = js.native
}
object FunctionDeclaration {
  
  @scala.inline
  def apply(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
  
  @scala.inline
  implicit class FunctionDeclarationMutableBuilder[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier | MemberExpression): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    @scala.inline
    def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[Identifier | VarargLiteral]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: (Identifier | VarargLiteral)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
