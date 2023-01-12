package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyColor extends StObject {
  
  var bodyColor: js.UndefOr[String] = js.undefined
  
  var bodyFontSize: js.UndefOr[Double] = js.undefined
  
  var titleFontSize: js.UndefOr[Double] = js.undefined
}
object BodyColor {
  
  inline def apply(): BodyColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyColor] (val x: Self) extends AnyVal {
    
    inline def setBodyColor(value: String): Self = StObject.set(x, "bodyColor", value.asInstanceOf[js.Any])
    
    inline def setBodyColorUndefined: Self = StObject.set(x, "bodyColor", js.undefined)
    
    inline def setBodyFontSize(value: Double): Self = StObject.set(x, "bodyFontSize", value.asInstanceOf[js.Any])
    
    inline def setBodyFontSizeUndefined: Self = StObject.set(x, "bodyFontSize", js.undefined)
    
    inline def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
  }
}
