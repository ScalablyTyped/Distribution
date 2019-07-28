package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends Expression
     with Base[typings.luaparse.luaparseStrings.Identifier] {
  var name: String
}

object Identifier {
  @scala.inline
  def apply(name: String, `type`: typings.luaparse.luaparseStrings.Identifier): Identifier = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Identifier]
  }
}

