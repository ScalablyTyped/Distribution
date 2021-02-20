package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.poly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerShapePoly extends MarkerShape {
  
  /**
    * Coords is **[x1,y1,x2,y2...xn,yn]** where each x,y pair contains the
    * coordinates of one vertex of the polygon.
    */
  var coords: MarkerShapePolyCoords = js.native
  
  var `type`: poly = js.native
}
object MarkerShapePoly {
  
  @scala.inline
  def apply(coords: MarkerShapePolyCoords, `type`: poly): MarkerShapePoly = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShapePoly]
  }
  
  @scala.inline
  implicit class MarkerShapePolyMutableBuilder[Self <: MarkerShapePoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: MarkerShapePolyCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: poly): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
