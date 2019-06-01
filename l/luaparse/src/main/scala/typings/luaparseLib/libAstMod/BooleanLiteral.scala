package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.BooleanLiteral] {
  var raw: java.lang.String
  var value: scala.Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(raw: java.lang.String, `type`: luaparseLib.luaparseLibStrings.BooleanLiteral, value: scala.Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

