package typings.luaparse.libAstMod

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
  var parameters: js.Array[Identifier]
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration,
    identifier: Identifier | MemberExpression = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body, isLocal = isLocal, parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

