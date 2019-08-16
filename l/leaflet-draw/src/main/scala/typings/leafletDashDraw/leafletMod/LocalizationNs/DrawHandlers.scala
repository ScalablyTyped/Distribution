package typings.leafletDashDraw.leafletMod.LocalizationNs

import typings.leafletDashDraw.Anon_Error
import typings.leafletDashDraw.Anon_Radius
import typings.leafletDashDraw.Anon_Tooltip
import typings.leafletDashDraw.Anon_TooltipAnonCont
import typings.leafletDashDraw.Anon_TooltipAnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHandlers extends js.Object {
  var circle: Anon_Radius
  var circlemarker: Anon_Tooltip
  var marker: Anon_Tooltip
  var polygon: Anon_TooltipAnonCont
  var polyline: Anon_Error
  var rectangle: Anon_Tooltip
  var simpleshape: Anon_TooltipAnonEnd
}

object DrawHandlers {
  @scala.inline
  def apply(
    circle: Anon_Radius,
    circlemarker: Anon_Tooltip,
    marker: Anon_Tooltip,
    polygon: Anon_TooltipAnonCont,
    polyline: Anon_Error,
    rectangle: Anon_Tooltip,
    simpleshape: Anon_TooltipAnonEnd
  ): DrawHandlers = {
    val __obj = js.Dynamic.literal(circle = circle, circlemarker = circlemarker, marker = marker, polygon = polygon, polyline = polyline, rectangle = rectangle, simpleshape = simpleshape)
  
    __obj.asInstanceOf[DrawHandlers]
  }
}

