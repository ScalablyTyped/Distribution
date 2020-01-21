package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAction extends js.Object {
  var active: String = js.native
  var disabled: String = js.native
  var disabledBackground: String = js.native
  var hover: String = js.native
  var hoverOpacity: Double = js.native
  var selected: String = js.native
}

object TypeAction {
  @scala.inline
  def apply(
    active: String,
    disabled: String,
    disabledBackground: String,
    hover: String,
    hoverOpacity: Double,
    selected: String
  ): TypeAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverOpacity = hoverOpacity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeAction]
  }
}

