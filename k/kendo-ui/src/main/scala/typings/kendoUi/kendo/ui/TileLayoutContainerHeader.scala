package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayoutContainerHeader extends js.Object {
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TileLayoutContainerHeader {
  @scala.inline
  def apply(template: String | js.Function = null, text: String = null): TileLayoutContainerHeader = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayoutContainerHeader]
  }
}

