package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import typings.luaparse.luaparseStrings.Colon
import typings.luaparse.luaparseStrings.Dot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.MemberExpression] {
  var base: Expression
  var identifier: Identifier
  var indexer: Dot | Colon
}

object MemberExpression {
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typings.luaparse.luaparseStrings.MemberExpression,
    loc: Anon_End = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression]
  }
}

