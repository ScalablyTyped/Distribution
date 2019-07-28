package typings.luaparse.libAstMod

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
  def apply(key: Expression, `type`: typings.luaparse.luaparseStrings.TableKey, value: Expression): TableKey = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableKey]
  }
}

