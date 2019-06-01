package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NilLiteral
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.NilLiteral] {
  var raw: java.lang.String
  var value: scala.Null
}

object NilLiteral {
  @scala.inline
  def apply(raw: java.lang.String, `type`: luaparseLib.luaparseLibStrings.NilLiteral, value: scala.Null): NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NilLiteral]
  }
}

