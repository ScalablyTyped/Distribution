package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.NumericLiteral] {
  var raw: String
  var value: Double
}

object NumericLiteral {
  @scala.inline
  def apply(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.NumericLiteral,
    value: Double,
    loc: Anon_End = null
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NumericLiteral]
  }
}

