package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Tooltip")
@js.native
class Tooltip () extends Layer {
  def this(options: TooltipOptions) = this()
  def this(options: TooltipOptions, source: Layer) = this()
  var options: TooltipOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  def getContent(): js.UndefOr[Content] = js.native
  def getElement(): js.UndefOr[stdLib.HTMLElement] = js.native
  def getLatLng(): js.UndefOr[LatLng] = js.native
  def isOpen(): scala.Boolean = js.native
  def setContent(htmlContent: js.Function1[/* source */ Layer, Content]): this.type = js.native
  def setContent(htmlContent: Content): this.type = js.native
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  def setOpacity(`val`: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

