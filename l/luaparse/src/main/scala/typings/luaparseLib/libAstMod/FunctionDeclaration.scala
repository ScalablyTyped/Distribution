package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.FunctionDeclaration]
     with _Statement {
  var body: js.Array[Statement]
  var identifier: Identifier | scala.Null
  var isLocal: scala.Boolean
  var parameters: js.Array[Identifier]
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    isLocal: scala.Boolean,
    parameters: js.Array[Identifier],
    `type`: luaparseLib.luaparseLibStrings.FunctionDeclaration,
    identifier: Identifier = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body, isLocal = isLocal, parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

