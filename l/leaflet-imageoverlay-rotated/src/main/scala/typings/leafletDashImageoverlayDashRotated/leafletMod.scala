package typings.leafletDashImageoverlayDashRotated

import typings.leaflet.leafletMod.ImageOverlayOptions
import typings.leaflet.leafletMod.LatLngExpression
import typings.leafletDashImageoverlayDashRotated.leafletMod.ImageOverlay.Rotated
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  object ImageOverlay extends js.Object {
    @js.native
    trait Rotated
      extends typings.leaflet.leafletMod.ImageOverlay {
      def reposition(topleft: LatLngExpression, topright: LatLngExpression, bottomleft: LatLngExpression): Unit = js.native
    }
    
  }
  
  @js.native
  object imageOverlay extends js.Object {
    def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
  }
  
}

