package typings
package jqueryDotToolsLib.JQueryToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolsStatic extends js.Object {
  var overlay: jqueryDotToolsLib.JQueryToolsNs.overlayNs.OverlayStatic
}

object ToolsStatic {
  @scala.inline
  def apply(overlay: jqueryDotToolsLib.JQueryToolsNs.overlayNs.OverlayStatic): ToolsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overlay")(overlay)
    __obj.asInstanceOf[ToolsStatic]
  }
}

