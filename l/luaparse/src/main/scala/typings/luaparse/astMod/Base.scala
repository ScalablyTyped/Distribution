package typings.luaparse.astMod

import typings.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base[TType /* <: String */] extends js.Object {
  var loc: js.UndefOr[AnonEnd] = js.undefined
  var `type`: TType
}

object Base {
  @scala.inline
  def apply[TType /* <: String */](`type`: TType, loc: AnonEnd = null): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[TType]]
  }
}

