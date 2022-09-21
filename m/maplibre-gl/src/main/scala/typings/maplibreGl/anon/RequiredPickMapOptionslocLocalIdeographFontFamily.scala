package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'localIdeographFontFamily'>> */
trait RequiredPickMapOptionslocLocalIdeographFontFamily extends StObject {
  
  var localIdeographFontFamily: String
}
object RequiredPickMapOptionslocLocalIdeographFontFamily {
  
  inline def apply(localIdeographFontFamily: String): RequiredPickMapOptionslocLocalIdeographFontFamily = {
    val __obj = js.Dynamic.literal(localIdeographFontFamily = localIdeographFontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionslocLocalIdeographFontFamily]
  }
  
  extension [Self <: RequiredPickMapOptionslocLocalIdeographFontFamily](x: Self) {
    
    inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
  }
}
