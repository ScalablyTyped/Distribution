package typings.luaparse.astMod

import typings.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKey
  extends Base[typings.luaparse.luaparseStrings.TableKey]
     with _Node {
  var key: Expression
  var value: Expression
}

object TableKey {
  @scala.inline
  def apply(
    key: Expression,
    `type`: typings.luaparse.luaparseStrings.TableKey,
    value: Expression,
    loc: End = null
  ): TableKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKey]
  }
}

