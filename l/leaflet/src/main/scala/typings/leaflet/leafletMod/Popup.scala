package typings.leaflet.leafletMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Popup")
@js.native
class Popup () extends Layer {
  def this(options: PopupOptions) = this()
  def this(options: PopupOptions, source: Layer) = this()
  var options: PopupOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  def getContent(): js.UndefOr[Content | (js.Function1[/* source */ Layer, Content])] = js.native
  def getElement(): js.UndefOr[HTMLElement] = js.native
  def getLatLng(): js.UndefOr[LatLng] = js.native
  def isOpen(): Boolean = js.native
  def openOn(map: Map): this.type = js.native
  def setContent(htmlContent: js.Function1[/* source */ Layer, Content]): this.type = js.native
  def setContent(htmlContent: Content): this.type = js.native
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  def update(): Unit = js.native
}

