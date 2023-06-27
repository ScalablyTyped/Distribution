package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitleStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
}
object SubtitleStyleOptions {
  
  inline def apply(): SubtitleStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtitleStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtitleStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
