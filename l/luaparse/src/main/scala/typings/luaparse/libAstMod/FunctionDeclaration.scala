package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends Expression
     with Base[typings.luaparse.luaparseStrings.FunctionDeclaration]
     with _Statement {
  var body: js.Array[Statement]
  var identifier: Identifier | MemberExpression | Null
  var isLocal: Boolean
  var parameters: js.Array[Identifier | VarargLiteral]
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration,
    identifier: Identifier | MemberExpression = null,
    loc: Anon_End = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body, isLocal = isLocal, parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

