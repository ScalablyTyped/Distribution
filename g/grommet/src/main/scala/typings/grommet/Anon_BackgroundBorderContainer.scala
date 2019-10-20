package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderContainer extends js.Object {
  var background: BackgroundType
  var border: Anon_RadiusString
  var container: Anon_ZIndex
  var overlay: Anon_BackgroundBackgroundType
  var responsiveBreakpoint: String
  var zIndex: String
}

object Anon_BackgroundBorderContainer {
  @scala.inline
  def apply(
    background: BackgroundType,
    border: Anon_RadiusString,
    container: Anon_ZIndex,
    overlay: Anon_BackgroundBackgroundType,
    responsiveBreakpoint: String,
    zIndex: String
  ): Anon_BackgroundBorderContainer = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border, container = container, overlay = overlay, responsiveBreakpoint = responsiveBreakpoint, zIndex = zIndex)
  
    __obj.asInstanceOf[Anon_BackgroundBorderContainer]
  }
}

