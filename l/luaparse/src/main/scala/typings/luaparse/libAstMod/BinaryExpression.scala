package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import typings.luaparse.luaparseStrings.Ampersand
import typings.luaparse.luaparseStrings.Asterisk
import typings.luaparse.luaparseStrings.DotDot
import typings.luaparse.luaparseStrings.EqualssignEqualssign
import typings.luaparse.luaparseStrings.Greaterthansign
import typings.luaparse.luaparseStrings.GreaterthansignEqualssign
import typings.luaparse.luaparseStrings.GreaterthansignGreaterthansign
import typings.luaparse.luaparseStrings.Lessthansign
import typings.luaparse.luaparseStrings.LessthansignEqualssign
import typings.luaparse.luaparseStrings.LessthansignLessthansign
import typings.luaparse.luaparseStrings.Percentsign
import typings.luaparse.luaparseStrings.Plussign
import typings.luaparse.luaparseStrings.Slash
import typings.luaparse.luaparseStrings.SlashSlash
import typings.luaparse.luaparseStrings.Tilde
import typings.luaparse.luaparseStrings.TildeEqualssign
import typings.luaparse.luaparseStrings.Verticalline
import typings.luaparse.luaparseStrings.^
import typings.luaparse.luaparseStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.BinaryExpression] {
  var left: Expression
  var operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  var right: Expression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
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

