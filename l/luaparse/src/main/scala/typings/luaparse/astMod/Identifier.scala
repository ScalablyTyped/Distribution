package typings.luaparse.astMod

import typings.luaparse.anon.End
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
  def apply(name: String, `type`: typings.luaparse.luaparseStrings.Identifier, loc: End = null): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

