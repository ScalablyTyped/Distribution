package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributionOptions extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
}
object AttributionOptions {
  
  inline def apply(): AttributionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributionOptions] (val x: Self) extends AnyVal {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributionUndefined: Self = StObject.set(x, "customAttribution", js.undefined)
    
    inline def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value*))
  }
}
