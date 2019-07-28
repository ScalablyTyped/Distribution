package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.MemberExpression] {
  var base: Expression
  var identifier: Identifier
  var indexer: String
}

object MemberExpression {
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: String,
    `type`: typings.luaparse.luaparseStrings.MemberExpression
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base, identifier = identifier, indexer = indexer)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemberExpression]
  }
}

