package typings.luaparse.astMod

import typings.luaparse.AnonEnd
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
  def apply(`type`: typings.luaparse.luaparseStrings.TableValue, value: Expression, loc: AnonEnd = null): TableValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableValue]
  }
}

