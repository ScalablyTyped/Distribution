package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableValue
  extends Base[typings.luaparse.luaparseStrings.TableValue]
     with _Node {
  var value: Expression
}

object TableValue {
  @scala.inline
  def apply(`type`: typings.luaparse.luaparseStrings.TableValue, value: Expression, loc: Anon_End = null): TableValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TableValue]
  }
}

