package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'clickTolerance'>> */
trait RequiredPickMapOptionscli extends StObject {
  
  var clickTolerance: Double
}
object RequiredPickMapOptionscli {
  
  inline def apply(clickTolerance: Double): RequiredPickMapOptionscli = {
    val __obj = js.Dynamic.literal(clickTolerance = clickTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscli]
  }
  
  extension [Self <: RequiredPickMapOptionscli](x: Self) {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
  }
}
