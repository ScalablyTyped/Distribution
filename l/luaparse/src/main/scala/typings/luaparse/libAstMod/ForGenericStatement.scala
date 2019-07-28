package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForGenericStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.ForGenericStatement] {
  var body: js.Array[Statement]
  var iterators: js.Array[Expression]
  var variables: js.Array[Identifier]
}

object ForGenericStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier]
  ): ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body, iterators = iterators, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ForGenericStatement]
  }
}

