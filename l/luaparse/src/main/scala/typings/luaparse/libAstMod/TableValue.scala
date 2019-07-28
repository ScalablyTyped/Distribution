package typings.luaparse.libAstMod

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
  def apply(`type`: typings.luaparse.luaparseStrings.TableValue, value: Expression): TableValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableValue]
  }
}

