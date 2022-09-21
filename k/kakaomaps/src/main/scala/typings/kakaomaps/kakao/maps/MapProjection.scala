package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapProjection extends StObject {
  
  def containerPointFromCoords(latlng: LatLng): Point
  
  def coordsFromContainerPoint(point: Point): LatLng
  
  def coordsFromPoint(point: Point): LatLng
  
  def pointFromCoords(latlng: LatLng): Point
}
object MapProjection {
  
  inline def apply(
    containerPointFromCoords: LatLng => Point,
    coordsFromContainerPoint: Point => LatLng,
    coordsFromPoint: Point => LatLng,
    pointFromCoords: LatLng => Point
  ): MapProjection = {
    val __obj = js.Dynamic.literal(containerPointFromCoords = js.Any.fromFunction1(containerPointFromCoords), coordsFromContainerPoint = js.Any.fromFunction1(coordsFromContainerPoint), coordsFromPoint = js.Any.fromFunction1(coordsFromPoint), pointFromCoords = js.Any.fromFunction1(pointFromCoords))
    __obj.asInstanceOf[MapProjection]
  }
  
  extension [Self <: MapProjection](x: Self) {
    
    inline def setContainerPointFromCoords(value: LatLng => Point): Self = StObject.set(x, "containerPointFromCoords", js.Any.fromFunction1(value))
    
    inline def setCoordsFromContainerPoint(value: Point => LatLng): Self = StObject.set(x, "coordsFromContainerPoint", js.Any.fromFunction1(value))
    
    inline def setCoordsFromPoint(value: Point => LatLng): Self = StObject.set(x, "coordsFromPoint", js.Any.fromFunction1(value))
    
    inline def setPointFromCoords(value: LatLng => Point): Self = StObject.set(x, "pointFromCoords", js.Any.fromFunction1(value))
  }
}
