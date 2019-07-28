package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceClientRequestModifiers extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}

object ResourceClientRequestModifiers {
  @scala.inline
  def apply(fields: js.Array[String] = null): ResourceClientRequestModifiers = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ResourceClientRequestModifiers]
  }
}

