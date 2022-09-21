package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPoint extends StObject {
  
  /* static member */
  def convert[T /* <: Any */](a: T): T | Point
}
object TypeofPoint {
  
  inline def apply(convert: Any => Any | Point): TypeofPoint = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[TypeofPoint]
  }
  
  extension [Self <: TypeofPoint](x: Self) {
    
    inline def setConvert(value: Any => Any | Point): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
  }
}
