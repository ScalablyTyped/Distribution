package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'customAttribution'> */
trait PickMapOptionscustomAttri extends StObject {
  
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
}
object PickMapOptionscustomAttri {
  
  inline def apply(): PickMapOptionscustomAttri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionscustomAttri]
  }
  
  extension [Self <: PickMapOptionscustomAttri](x: Self) {
    
    inline def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributionUndefined: Self = StObject.set(x, "customAttribution", js.undefined)
    
    inline def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value*))
  }
}
