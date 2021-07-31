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
  
  @scala.inline
  def apply(): DaySize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaySize]
  }
  
  @scala.inline
  implicit class DaySizeMutableBuilder[Self <: DaySize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaySize(value: String): Self = StObject.set(x, "daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaySizeUndefined: Self = StObject.set(x, "daySize", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setSlideDuration(value: String): Self = StObject.set(x, "slideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideDurationUndefined: Self = StObject.set(x, "slideDuration", js.undefined)
  }
}
