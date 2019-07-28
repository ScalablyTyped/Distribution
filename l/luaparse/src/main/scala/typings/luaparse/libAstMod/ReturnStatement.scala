package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.ReturnStatement] {
  var arguments: js.Array[Expression]
}

object ReturnStatement {
  @scala.inline
  def apply(arguments: js.Array[Expression], `type`: typings.luaparse.luaparseStrings.ReturnStatement): ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReturnStatement]
  }
}

