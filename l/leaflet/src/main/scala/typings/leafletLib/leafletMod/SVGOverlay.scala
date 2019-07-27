package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "SVGOverlay")
@js.native
class SVGOverlay protected () extends Layer {
  /** SVGOverlay doesn't extend ImageOverlay because SVGOverlay.getElement returns SVGElement */
  def this(svgImage: java.lang.String, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: stdLib.SVGElement, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: java.lang.String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  def this(svgImage: stdLib.SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  var options: ImageOverlayOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  /** Get the bounds that this SVGOverlay covers */
  def getBounds(): LatLngBounds = js.native
  /** Get the img element that represents the SVGOverlay on the map */
  def getElement(): js.UndefOr[stdLib.SVGElement] = js.native
  /** Update the bounds that this SVGOverlay covers */
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def setOpacity(opacity: scala.Double): this.type = js.native
  def setUrl(url: java.lang.String): this.type = js.native
  /** Changes the zIndex of the image overlay */
  def setZIndex(value: scala.Double): this.type = js.native
}

