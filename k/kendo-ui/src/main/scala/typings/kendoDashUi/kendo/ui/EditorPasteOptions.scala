package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPasteOptions extends js.Object {
  var split: js.UndefOr[Boolean] = js.undefined
}

object EditorPasteOptions {
  @scala.inline
  def apply(split: js.UndefOr[Boolean] = js.undefined): EditorPasteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorPasteOptions]
  }
}

