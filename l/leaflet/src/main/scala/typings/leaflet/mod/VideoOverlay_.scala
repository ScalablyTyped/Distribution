package typings.leaflet.mod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "VideoOverlay")
@js.native
class VideoOverlay_ protected () extends Layer {
  /** VideoOverlay doesn't extend ImageOverlay because VideoOverlay.getElement returns HTMLImageElement */
  def this(video: String, bounds: LatLngBoundsExpression) = this()
  def this(video: js.Array[String], bounds: LatLngBoundsExpression) = this()
  def this(video: HTMLVideoElement, bounds: LatLngBoundsExpression) = this()
  def this(video: String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  def this(video: js.Array[String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  def this(video: HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  
  def bringToBack(): this.type = js.native
  
  def bringToFront(): this.type = js.native
  
  /** Get the bounds that this VideoOverlay covers */
  def getBounds(): LatLngBounds_ = js.native
  
  /** Get the video element that represents the VideoOverlay on the map */
  def getElement(): js.UndefOr[HTMLVideoElement] = js.native
  
  var options: VideoOverlayOptions = js.native
  
  /** Update the bounds that this VideoOverlay covers */
  def setBounds(bounds: LatLngBounds_): this.type = js.native
  
  def setOpacity(opacity: Double): this.type = js.native
  
  def setUrl(url: String): this.type = js.native
}
