package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaySize extends StObject {
  
  var daySize: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var slideDuration: js.UndefOr[String] = js.undefined
}
object DaySize {
  
  inline def apply(): DaySize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaySize]
  }
  
  extension [Self <: DaySize](x: Self) {
    
    inline def setDaySize(value: String): Self = StObject.set(x, "daySize", value.asInstanceOf[js.Any])
    
    inline def setDaySizeUndefined: Self = StObject.set(x, "daySize", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setSlideDuration(value: String): Self = StObject.set(x, "slideDuration", value.asInstanceOf[js.Any])
    
    inline def setSlideDurationUndefined: Self = StObject.set(x, "slideDuration", js.undefined)
  }
}
