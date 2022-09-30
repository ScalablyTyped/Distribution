package typings.leaflet.global.L

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.VideoOverlayOptions
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.VideoOverlay")
@js.native
open class VideoOverlay_ protected ()
  extends typings.leaflet.mod.VideoOverlay_ {
  /** VideoOverlay doesn't extend ImageOverlay because VideoOverlay.getElement returns HTMLImageElement */
  def this(video: String, bounds: LatLngBoundsExpression) = this()
  def this(video: js.Array[String], bounds: LatLngBoundsExpression) = this()
  def this(video: HTMLVideoElement, bounds: LatLngBoundsExpression) = this()
  def this(video: String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  def this(video: js.Array[String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
  def this(video: HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions) = this()
}
