package typings.luaparse.astMod

import typings.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base[TType /* <: String */] extends js.Object {
  var loc: js.UndefOr[End] = js.undefined
  var `type`: TType
}

object Base {
  @scala.inline
  def apply[/* <: java.lang.String */ TType](`type`: TType, loc: End = null): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[TType]]
  }
}

