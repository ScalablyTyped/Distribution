package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'failIfMajorPerformanceCaveat'>> */
trait RequiredPickMapOptionsfai extends StObject {
  
  var failIfMajorPerformanceCaveat: Boolean
}
object RequiredPickMapOptionsfai {
  
  inline def apply(failIfMajorPerformanceCaveat: Boolean): RequiredPickMapOptionsfai = {
    val __obj = js.Dynamic.literal(failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsfai]
  }
  
  extension [Self <: RequiredPickMapOptionsfai](x: Self) {
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
  }
}
