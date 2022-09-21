package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'customAttribution'>> */
trait RequiredPickMapOptionscus extends StObject {
  
  var customAttribution: String | js.Array[String]
}
object RequiredPickMapOptionscus {
  
  inline def apply(customAttribution: String | js.Array[String]): RequiredPickMapOptionscus = {
    val __obj = js.Dynamic.literal(customAttribution = customAttribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscus]
  }
  
  extension [Self <: RequiredPickMapOptionscus](x: Self) {
    
    inline def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value*))
  }
}
