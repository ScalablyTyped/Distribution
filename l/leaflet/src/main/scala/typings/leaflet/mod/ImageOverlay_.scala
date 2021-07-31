package typings.leaflet.mod

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "ImageOverlay")
@js.native
class ImageOverlay_ protected () extends Layer {
  def this(imageUrl: String, bounds: LatLngBoundsExpression) = this()
  def this(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  
  def bringToBack(): this.type = js.native
  
  def bringToFront(): this.type = js.native
  
  /** Get the bounds that this ImageOverlay covers */
  def getBounds(): LatLngBounds_ = js.native
  
  /** Get the img element that represents the ImageOverlay on the map */
  def getElement(): js.UndefOr[HTMLImageElement] = js.native
  
  var options: ImageOverlayOptions = js.native
  
  /** Update the bounds that this ImageOverlay covers */
  def setBounds(bounds: LatLngBounds_): this.type = js.native
  
  def setOpacity(opacity: Double): this.type = js.native
  
  def setUrl(url: String): this.type = js.native
  
  /** Changes the zIndex of the image overlay */
  def setZIndex(value: Double): this.type = js.native
}
