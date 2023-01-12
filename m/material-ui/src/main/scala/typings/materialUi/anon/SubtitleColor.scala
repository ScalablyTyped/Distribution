package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitleColor extends StObject {
  
  var fontWeight: js.UndefOr[Double] = js.undefined
  
  var subtitleColor: js.UndefOr[String] = js.undefined
  
  var titleColor: js.UndefOr[String] = js.undefined
}
object SubtitleColor {
  
  inline def apply(): SubtitleColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtitleColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtitleColor] (val x: Self) extends AnyVal {
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
  }
}
