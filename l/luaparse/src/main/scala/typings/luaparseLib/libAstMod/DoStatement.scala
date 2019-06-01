package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.DoStatement] {
  var body: js.Array[Statement]
}

object DoStatement {
  @scala.inline
  def apply(body: js.Array[Statement], `type`: luaparseLib.luaparseLibStrings.DoStatement): DoStatement = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DoStatement]
  }
}

