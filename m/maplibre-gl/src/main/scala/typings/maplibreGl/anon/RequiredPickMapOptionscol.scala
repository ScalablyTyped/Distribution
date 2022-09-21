package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'collectResourceTiming'>> */
trait RequiredPickMapOptionscol extends StObject {
  
  var collectResourceTiming: Boolean
}
object RequiredPickMapOptionscol {
  
  inline def apply(collectResourceTiming: Boolean): RequiredPickMapOptionscol = {
    val __obj = js.Dynamic.literal(collectResourceTiming = collectResourceTiming.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscol]
  }
  
  extension [Self <: RequiredPickMapOptionscol](x: Self) {
    
    inline def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
  }
}
