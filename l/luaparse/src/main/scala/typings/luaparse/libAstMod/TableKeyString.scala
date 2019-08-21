package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKeyString
  extends Base[typings.luaparse.luaparseStrings.TableKeyString]
     with _Node {
  var key: Identifier
  var value: Expression
}

object TableKeyString {
  @scala.inline
  def apply(
    key: Identifier,
    `type`: typings.luaparse.luaparseStrings.TableKeyString,
    value: Expression,
    loc: Anon_End = null
  ): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TableKeyString]
  }
}

