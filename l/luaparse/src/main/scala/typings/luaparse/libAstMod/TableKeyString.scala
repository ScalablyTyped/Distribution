package typings.luaparse.libAstMod

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
  def apply(key: Identifier, `type`: typings.luaparse.luaparseStrings.TableKeyString, value: Expression): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableKeyString]
  }
}

