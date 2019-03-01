package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPasteOptions extends js.Object {
  var split: js.UndefOr[scala.Boolean] = js.undefined
}

object EditorPasteOptions {
  @scala.inline
  def apply(split: js.UndefOr[scala.Boolean] = js.undefined): EditorPasteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[EditorPasteOptions]
  }
}

