package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ScrollZoomHandler")
@js.native
class ScrollZoomHandler protected () extends js.Object {
  def this(map: Map) = this()
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def setWheelZoomRate(wheelZoomRate: Double): Unit = js.native
  def setZoomRate(zoomRate: Double): Unit = js.native
}

