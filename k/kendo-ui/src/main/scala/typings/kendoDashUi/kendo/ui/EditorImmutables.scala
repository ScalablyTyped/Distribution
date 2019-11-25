package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImmutables extends js.Object {
  var deserialization: js.UndefOr[js.Function] = js.undefined
  var serialization: js.UndefOr[String | js.Function] = js.undefined
}

object EditorImmutables {
  @scala.inline
  def apply(deserialization: js.Function = null, serialization: String | js.Function = null): EditorImmutables = {
    val __obj = js.Dynamic.literal()
    if (deserialization != null) __obj.updateDynamic("deserialization")(deserialization.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorImmutables]
  }
}

