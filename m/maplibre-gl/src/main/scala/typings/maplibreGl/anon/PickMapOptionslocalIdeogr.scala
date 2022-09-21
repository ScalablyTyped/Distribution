package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'localIdeographFontFamily'> */
trait PickMapOptionslocalIdeogr extends StObject {
  
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
}
object PickMapOptionslocalIdeogr {
  
  inline def apply(): PickMapOptionslocalIdeogr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionslocalIdeogr]
  }
  
  extension [Self <: PickMapOptionslocalIdeogr](x: Self) {
    
    inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    inline def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
  }
}
