package typings.jqueryTools.JQueryTools

import typings.jqueryTools.JQueryTools.overlay.OverlayStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolsStatic extends js.Object {
  var overlay: OverlayStatic
}

object ToolsStatic {
  @scala.inline
  def apply(overlay: OverlayStatic): ToolsStatic = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolsStatic]
  }
}

