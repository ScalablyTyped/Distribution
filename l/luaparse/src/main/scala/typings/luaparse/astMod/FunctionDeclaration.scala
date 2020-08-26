package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class FunctionDeclarationOps[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLocal(value: Boolean): Self = this.set("isLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: (Identifier | VarargLiteral)*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[Identifier | VarargLiteral]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Identifier | MemberExpression): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifierNull: Self = this.set("identifier", null)
  }
  
}

