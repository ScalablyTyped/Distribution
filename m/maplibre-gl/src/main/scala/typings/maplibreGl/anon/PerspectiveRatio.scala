package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerspectiveRatio extends StObject {
  
  var perspectiveRatio: Double
  
  var point: ^
}
object PerspectiveRatio {
  
  inline def apply(perspectiveRatio: Double, point: ^): PerspectiveRatio = {
    val __obj = js.Dynamic.literal(perspectiveRatio = perspectiveRatio.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerspectiveRatio]
  }
  
  extension [Self <: PerspectiveRatio](x: Self) {
    
    inline def setPerspectiveRatio(value: Double): Self = StObject.set(x, "perspectiveRatio", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: ^): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
