package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarModeHandler extends js.Object {
  var enabled: scala.Boolean
  var handler: leafletLib.leafletMod.Handler
  var title: java.lang.String
}

object ToolbarModeHandler {
  @scala.inline
  def apply(enabled: scala.Boolean, handler: leafletLib.leafletMod.Handler, title: java.lang.String): ToolbarModeHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ToolbarModeHandler]
  }
}

