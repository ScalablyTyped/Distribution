package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.poly
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
  implicit class MarkerShapePolyOps[Self <: MarkerShapePoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoords(value: MarkerShapePolyCoords): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: poly): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
