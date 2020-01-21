package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorDeserialization extends js.Object {
  var custom: js.UndefOr[js.Function] = js.undefined
}

object EditorDeserialization {
  @scala.inline
  def apply(custom: js.Function = null): EditorDeserialization = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorDeserialization]
  }
}

