package typings.leaflet.leafletMod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "ImageOverlay")
@js.native
class ImageOverlay protected () extends Layer {
  def this(imageUrl: String, bounds: LatLngBoundsExpression) = this()
  def this(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  var options: ImageOverlayOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  /** Get the bounds that this ImageOverlay covers */
  def getBounds(): LatLngBounds = js.native
  /** Get the img element that represents the ImageOverlay on the map */
  def getElement(): js.UndefOr[HTMLImageElement] = js.native
  /** Update the bounds that this ImageOverlay covers */
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def setOpacity(opacity: Double): this.type = js.native
  def setUrl(url: String): this.type = js.native
  /** Changes the zIndex of the image overlay */
  def setZIndex(value: Double): this.type = js.native
}

@JSImport("leaflet", "imageOverlay")
@js.native
object imageOverlay extends js.Object {
  def apply(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay = js.native
  def apply(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay = js.native
}

