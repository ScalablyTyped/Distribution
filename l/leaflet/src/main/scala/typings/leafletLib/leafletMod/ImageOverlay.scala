package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "ImageOverlay")
@js.native
class ImageOverlay protected () extends Layer {
  def this(imageUrl: java.lang.String, bounds: LatLngBoundsExpression) = this()
  def this(imageUrl: java.lang.String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  var options: ImageOverlayOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  /** Get the bounds that this ImageOverlay covers */
  def getBounds(): LatLngBounds = js.native
  /** Get the img element that represents the ImageOverlay on the map */
  def getElement(): js.UndefOr[stdLib.HTMLImageElement] = js.native
  /** Update the bounds that this ImageOverlay covers */
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def setOpacity(opacity: scala.Double): this.type = js.native
  def setUrl(url: java.lang.String): this.type = js.native
  /** Changes the zIndex of the image overlay */
  def setZIndex(value: scala.Double): this.type = js.native
}

