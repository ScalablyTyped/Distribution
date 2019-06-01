package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.MemberExpression] {
  var base: Expression
  var identifier: Identifier
  var indexer: java.lang.String
}

object MemberExpression {
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: java.lang.String,
    `type`: luaparseLib.luaparseLibStrings.MemberExpression
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base, identifier = identifier, indexer = indexer)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemberExpression]
  }
}

