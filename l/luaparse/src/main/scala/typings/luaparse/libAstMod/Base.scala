package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base[TType /* <: String */] extends js.Object {
  var `type`: TType
}

object Base {
  @scala.inline
  def apply[TType /* <: String */](`type`: TType): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[TType]]
  }
}

