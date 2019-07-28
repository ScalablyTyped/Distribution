package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAction extends js.Object {
  var active: String
  var disabled: String
  var disabledBackground: String
  var hover: String
  var hoverOpacity: Double
  var selected: String
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
    val __obj = js.Dynamic.literal(active = active, disabled = disabled, disabledBackground = disabledBackground, hover = hover, hoverOpacity = hoverOpacity, selected = selected)
  
    __obj.asInstanceOf[TypeAction]
  }
}

