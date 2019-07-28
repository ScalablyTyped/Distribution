package typings.atJupyterlabInspector.libInspectorMod.InspectorPanelNs

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var initialContent: js.UndefOr[Widget | String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(initialContent: Widget | String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

