package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAction extends js.Object {
  var active: java.lang.String
  var disabled: java.lang.String
  var disabledBackground: java.lang.String
  var hover: java.lang.String
  var hoverOpacity: scala.Double
  var selected: java.lang.String
}

object TypeAction {
  @scala.inline
  def apply(
    active: java.lang.String,
    disabled: java.lang.String,
    disabledBackground: java.lang.String,
    hover: java.lang.String,
    hoverOpacity: scala.Double,
    selected: java.lang.String
  ): TypeAction = {
    val __obj = js.Dynamic.literal(active = active, disabled = disabled, disabledBackground = disabledBackground, hover = hover, hoverOpacity = hoverOpacity, selected = selected)
  
    __obj.asInstanceOf[TypeAction]
  }
}

