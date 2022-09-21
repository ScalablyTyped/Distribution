package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'fadeDuration'>> */
trait RequiredPickMapOptionsfad extends StObject {
  
  var fadeDuration: Double
}
object RequiredPickMapOptionsfad {
  
  inline def apply(fadeDuration: Double): RequiredPickMapOptionsfad = {
    val __obj = js.Dynamic.literal(fadeDuration = fadeDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsfad]
  }
  
  extension [Self <: RequiredPickMapOptionsfad](x: Self) {
    
    inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
  }
}
