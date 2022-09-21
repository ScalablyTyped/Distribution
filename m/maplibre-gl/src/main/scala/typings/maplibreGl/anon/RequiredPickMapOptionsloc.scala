package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'locale'>> */
trait RequiredPickMapOptionsloc extends StObject {
  
  var locale: Any
}
object RequiredPickMapOptionsloc {
  
  inline def apply(locale: Any): RequiredPickMapOptionsloc = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsloc]
  }
  
  extension [Self <: RequiredPickMapOptionsloc](x: Self) {
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
