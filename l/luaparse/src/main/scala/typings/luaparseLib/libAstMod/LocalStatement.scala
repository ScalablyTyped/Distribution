package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.LocalStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[Identifier]
}

object LocalStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: luaparseLib.luaparseLibStrings.LocalStatement,
    variables: js.Array[Identifier]
  ): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocalStatement]
  }
}

