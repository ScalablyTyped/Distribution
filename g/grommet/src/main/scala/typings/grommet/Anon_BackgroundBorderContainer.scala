package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderContainer extends js.Object {
  var background: String
  var border: Anon_RadiusString
  var container: Anon_ZIndex
  var overlay: Anon_BackgroundString
  var responsiveBreakpoint: String
  var zIndex: String
}

object Anon_BackgroundBorderContainer {
  @scala.inline
  def apply(
    background: String,
    border: Anon_RadiusString,
    container: Anon_ZIndex,
    overlay: Anon_BackgroundString,
    responsiveBreakpoint: String,
    zIndex: String
  ): Anon_BackgroundBorderContainer = {
    val __obj = js.Dynamic.literal(background = background, border = border, container = container, overlay = overlay, responsiveBreakpoint = responsiveBreakpoint, zIndex = zIndex)
  
    __obj.asInstanceOf[Anon_BackgroundBorderContainer]
  }
}

