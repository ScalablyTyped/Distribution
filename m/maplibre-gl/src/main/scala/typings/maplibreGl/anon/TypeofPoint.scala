package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPoint extends StObject {
  
  /* static member */
  def convert[T /* <: Any */](a: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<number> ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T extends @mapbox/point-geometry.@mapbox/point-geometry.Point ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T */ js.Any
}
object TypeofPoint {
  
  inline def apply(
    convert: Any => /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<number> ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T extends @mapbox/point-geometry.@mapbox/point-geometry.Point ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T */ js.Any
  ): TypeofPoint = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[TypeofPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPoint] (val x: Self) extends AnyVal {
    
    inline def setConvert(
      value: Any => /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<number> ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T extends @mapbox/point-geometry.@mapbox/point-geometry.Point ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T */ js.Any
    ): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
  }
}
