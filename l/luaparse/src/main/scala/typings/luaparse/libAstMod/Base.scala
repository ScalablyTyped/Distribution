package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base[TType /* <: String */] extends js.Object {
  var loc: js.UndefOr[Anon_End] = js.undefined
  var `type`: TType
}

object Base {
  @scala.inline
  def apply[TType /* <: String */](`type`: TType, loc: Anon_End = null): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Base[TType]]
  }
}

