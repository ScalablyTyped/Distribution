package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "VideoOverlay")
@js.native
class VideoOverlay protected () extends Layer {
  /** VideoOverlay doesn't extend ImageOverlay because VideoOverlay.getElement returns HTMLImageElement */
  def this(video: java.lang.String, bounds: LatLngBoundsExpression) = this()
  def this(video: js.Array[java.lang.String], bounds: LatLngBoundsExpression) = this()
  def this(video: stdLib.HTMLVideoElement, bounds: LatLngBoundsExpression) = this()
  def this(video: java.lang.String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  def this(video: js.Array[java.lang.String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  def this(video: stdLib.HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  var options: VideoOverlayOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  /** Get the bounds that this VideoOverlay covers */
  def getBounds(): LatLngBounds = js.native
  /** Get the video element that represents the VideoOverlay on the map */
  def getElement(): js.UndefOr[stdLib.HTMLVideoElement] = js.native
  /** Update the bounds that this VideoOverlay covers */
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def setOpacity(opacity: scala.Double): this.type = js.native
  def setUrl(url: java.lang.String): this.type = js.native
}

