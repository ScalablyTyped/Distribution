package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.Identifier] {
  var name: java.lang.String
}

object Identifier {
  @scala.inline
  def apply(name: java.lang.String, `type`: luaparseLib.luaparseLibStrings.Identifier): Identifier = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Identifier]
  }
}

