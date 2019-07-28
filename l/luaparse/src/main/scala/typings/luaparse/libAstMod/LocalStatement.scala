package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.LocalStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[Identifier]
}

object LocalStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier]
  ): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocalStatement]
  }
}

