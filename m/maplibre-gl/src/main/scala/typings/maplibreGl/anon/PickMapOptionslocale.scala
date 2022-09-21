package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'locale'> */
trait PickMapOptionslocale extends StObject {
  
  var locale: js.UndefOr[Any] = js.undefined
}
object PickMapOptionslocale {
  
  inline def apply(): PickMapOptionslocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionslocale]
  }
  
  extension [Self <: PickMapOptionslocale](x: Self) {
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
