package typings.leafletDraw.mod

import typings.leaflet.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarModeHandler extends js.Object {
  var enabled: Boolean
  var handler: Handler
  var title: String
}

object ToolbarModeHandler {
  @scala.inline
  def apply(enabled: Boolean, handler: Handler, title: String): ToolbarModeHandler = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarModeHandler]
  }
}

