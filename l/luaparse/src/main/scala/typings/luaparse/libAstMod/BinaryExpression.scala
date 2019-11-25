package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import typings.luaparse.luaparseStrings.DOTDOT
import typings.luaparse.luaparseStrings.`%`
import typings.luaparse.luaparseStrings.`&`
import typings.luaparse.luaparseStrings.`+`
import typings.luaparse.luaparseStrings.`-`
import typings.luaparse.luaparseStrings.`//`
import typings.luaparse.luaparseStrings.`/`
import typings.luaparse.luaparseStrings.`<<`
import typings.luaparse.luaparseStrings.`<=`
import typings.luaparse.luaparseStrings.`<`
import typings.luaparse.luaparseStrings.`==`
import typings.luaparse.luaparseStrings.`>=`
import typings.luaparse.luaparseStrings.`>>`
import typings.luaparse.luaparseStrings.`>`
import typings.luaparse.luaparseStrings.`_backtick^_backtick`
import typings.luaparse.luaparseStrings.`~=`
import typings.luaparse.luaparseStrings.`~`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.BinaryExpression] {
  var left: Expression
  var operator: `+` | `-` | typings.luaparse.luaparseStrings.`*` | `%` | `_backtick^_backtick` | `/` | `//` | `&` | typings.luaparse.luaparseStrings.`|` | `~` | `<<` | `>>` | DOTDOT | `~=` | `==` | `<` | `<=` | `>` | `>=`
  var right: Expression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: `+` | `-` | typings.luaparse.luaparseStrings.`*` | `%` | `_backtick^_backtick` | `/` | `//` | `&` | typings.luaparse.luaparseStrings.`|` | `~` | `<<` | `>>` | DOTDOT | `~=` | `==` | `<` | `<=` | `>` | `>=`,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.BinaryExpression,
    loc: Anon_End = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

