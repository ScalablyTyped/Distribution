package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import typings.luaparse.luaparseStrings.DOT
import typings.luaparse.luaparseStrings.`:`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.MemberExpression] {
  var base: Expression
  var identifier: Identifier
  var indexer: DOT | `:`
}

object MemberExpression {
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: DOT | `:`,
    `type`: typings.luaparse.luaparseStrings.MemberExpression,
    loc: Anon_End = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base, identifier = identifier, indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[MemberExpression]
  }
}

