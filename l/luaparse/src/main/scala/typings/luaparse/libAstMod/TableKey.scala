package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
    loc: Anon_End = null
  ): TableKey = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TableKey]
  }
}

