package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Marker")
@js.native
class Marker () extends Evented {
  def this(element: stdLib.HTMLElement) = this()
  def this(options: MarkerOptions) = this()
  def this(element: stdLib.HTMLElement, options: MarkerOptions) = this()
  def addTo(map: Map): this.type = js.native
  def getElement(): stdLib.HTMLElement = js.native
  def getLngLat(): LngLat = js.native
  def getOffset(): PointLike = js.native
  def getPopup(): Popup = js.native
  def isDraggable(): scala.Boolean = js.native
  def remove(): this.type = js.native
  def setDraggable(shouldBeDraggable: scala.Boolean): this.type = js.native
  def setLngLat(lngLat: LngLatLike): this.type = js.native
  def setOffset(offset: PointLike): this.type = js.native
  def setPopup(): this.type = js.native
  def setPopup(popup: Popup): this.type = js.native
  def togglePopup(): this.type = js.native
}

