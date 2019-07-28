package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorResizable extends js.Object {
  var content: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var toolbar: js.UndefOr[Boolean] = js.undefined
}

object EditorResizable {
  @scala.inline
  def apply(
    content: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    toolbar: js.UndefOr[Boolean] = js.undefined
  ): EditorResizable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[EditorResizable]
  }
}

