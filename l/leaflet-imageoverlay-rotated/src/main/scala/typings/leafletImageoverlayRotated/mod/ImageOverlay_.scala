package typings.leafletImageoverlayRotated.mod

import typings.leaflet.mod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "ImageOverlay")
@js.native
object ImageOverlay_ extends js.Object {
  
  @js.native
  trait Rotated
    extends typings.leaflet.mod.ImageOverlay_ {
    
    def reposition(topleft: LatLngExpression, topright: LatLngExpression, bottomleft: LatLngExpression): Unit = js.native
  }
}
