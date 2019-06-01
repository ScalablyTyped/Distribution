package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLiteral
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.NumericLiteral] {
  var raw: java.lang.String
  var value: scala.Double
}

object NumericLiteral {
  @scala.inline
  def apply(raw: java.lang.String, `type`: luaparseLib.luaparseLibStrings.NumericLiteral, value: scala.Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumericLiteral]
  }
}

