package typings.leaflet.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "DivOverlay")
@js.native
abstract class DivOverlay () extends Layer {
  def this(options: DivOverlayOptions) = this()
  def this(options: js.UndefOr[scala.Nothing], source: Layer) = this()
  def this(options: DivOverlayOptions, source: Layer) = this()
  var options: DivOverlayOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  def getContent(): js.UndefOr[Content | (js.Function1[/* source */ Layer, Content])] = js.native
  def getElement(): js.UndefOr[HTMLElement] = js.native
  def getLatLng(): js.UndefOr[LatLng_] = js.native
  def isOpen(): Boolean = js.native
  def setContent(htmlContent: js.Function1[/* source */ Layer, Content]): this.type = js.native
  def setContent(htmlContent: Content): this.type = js.native
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  def update(): Unit = js.native
}

