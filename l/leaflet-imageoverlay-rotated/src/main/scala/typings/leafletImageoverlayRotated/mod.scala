package typings.leafletImageoverlayRotated

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngExpression
import typings.leafletImageoverlayRotated.mod.ImageOverlay_.Rotated
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object imageOverlay {
    
    @JSImport("leaflet", "imageOverlay")
    @js.native
    val ^ : js.Any = js.native
    
    inline def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = (^.asInstanceOf[js.Dynamic].applyDynamic("rotated")(imgSrc.asInstanceOf[js.Any], topleft.asInstanceOf[js.Any], topright.asInstanceOf[js.Any], bottomleft.asInstanceOf[js.Any])).asInstanceOf[Rotated]
    inline def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = (^.asInstanceOf[js.Dynamic].applyDynamic("rotated")(imgSrc.asInstanceOf[js.Any], topleft.asInstanceOf[js.Any], topright.asInstanceOf[js.Any], bottomleft.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rotated]
    inline def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = (^.asInstanceOf[js.Dynamic].applyDynamic("rotated")(imgSrc.asInstanceOf[js.Any], topleft.asInstanceOf[js.Any], topright.asInstanceOf[js.Any], bottomleft.asInstanceOf[js.Any])).asInstanceOf[Rotated]
    inline def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = (^.asInstanceOf[js.Dynamic].applyDynamic("rotated")(imgSrc.asInstanceOf[js.Any], topleft.asInstanceOf[js.Any], topright.asInstanceOf[js.Any], bottomleft.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rotated]
    inline def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = (^.asInstanceOf[js.Dynamic].applyDynamic("rotated")(imgSrc.asInstanceOf[js.Any], topleft.asInstanceOf[js.Any], topright.asInstanceOf[js.Any], bottomleft.asInstanceOf[js.Any])).asInstanceOf[Rotated]
    inline def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = (^.asInstanceOf[js.Dynamic].applyDynamic("rotated")(imgSrc.asInstanceOf[js.Any], topleft.asInstanceOf[js.Any], topright.asInstanceOf[js.Any], bottomleft.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rotated]
  }
  
  object ImageOverlay_ {
    
    @js.native
    trait Rotated
      extends typings.leaflet.mod.ImageOverlay_ {
      
      def reposition(topleft: LatLngExpression, topright: LatLngExpression, bottomleft: LatLngExpression): Unit = js.native
    }
  }
}
