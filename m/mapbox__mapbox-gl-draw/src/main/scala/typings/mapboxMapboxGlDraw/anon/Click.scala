package typings.mapboxMapboxGlDraw.anon

import typings.geojson.mod.BBox
import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxMapboxGlDraw.mod.DrawCustomModeThis
import typings.mapboxMapboxGlDraw.mod.MapMouseEvent
import typings.mapboxMapboxGlDraw.mod.MapTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  def click(event: MapMouseEvent, bbox: BBox, ctx: DrawCustomModeThis): js.Array[Feature[Geometry, GeoJsonProperties]]
  
  // ?? ctx
  def touch(event: MapTouchEvent, bbox: BBox, ctx: DrawCustomModeThis): js.Array[Feature[Geometry, GeoJsonProperties]]
}
object Click {
  
  inline def apply(
    click: (MapMouseEvent, BBox, DrawCustomModeThis) => js.Array[Feature[Geometry, GeoJsonProperties]],
    touch: (MapTouchEvent, BBox, DrawCustomModeThis) => js.Array[Feature[Geometry, GeoJsonProperties]]
  ): Click = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction3(click), touch = js.Any.fromFunction3(touch))
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    inline def setClick(value: (MapMouseEvent, BBox, DrawCustomModeThis) => js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
    
    inline def setTouch(value: (MapTouchEvent, BBox, DrawCustomModeThis) => js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "touch", js.Any.fromFunction3(value))
  }
}
