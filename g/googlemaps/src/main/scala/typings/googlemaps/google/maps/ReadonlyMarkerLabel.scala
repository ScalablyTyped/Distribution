package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link MarkerLabel} */
trait ReadonlyMarkerLabel extends StObject {
  
  /** @see {@link MarkerLabel#color} */
  var color: js.UndefOr[String] = js.undefined
  
  /** @see {@link MarkerLabel#fontFamily} */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /** @see {@link MarkerLabel#fontSize} */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /** @see {@link MarkerLabel#fontWeight} */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /** @see {@link MarkerLabel#text} */
  var text: String
}
object ReadonlyMarkerLabel {
  
  inline def apply(text: String): ReadonlyMarkerLabel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMarkerLabel]
  }
  
  extension [Self <: ReadonlyMarkerLabel](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
