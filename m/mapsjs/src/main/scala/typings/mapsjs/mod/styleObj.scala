package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait styleObj extends StObject {
  
  var dashArray: js.UndefOr[String] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var outlineColor: js.UndefOr[String] = js.undefined
  
  var outlineOpacity: js.UndefOr[Double] = js.undefined
  
  var outlineThicknessPix: js.UndefOr[Double] = js.undefined
}
object styleObj {
  
  inline def apply(): styleObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[styleObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: styleObj] (val x: Self) extends AnyVal {
    
    inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
    
    inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineOpacity(value: Double): Self = StObject.set(x, "outlineOpacity", value.asInstanceOf[js.Any])
    
    inline def setOutlineOpacityUndefined: Self = StObject.set(x, "outlineOpacity", js.undefined)
    
    inline def setOutlineThicknessPix(value: Double): Self = StObject.set(x, "outlineThicknessPix", value.asInstanceOf[js.Any])
    
    inline def setOutlineThicknessPixUndefined: Self = StObject.set(x, "outlineThicknessPix", js.undefined)
  }
}
