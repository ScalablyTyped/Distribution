package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHeight extends StObject {
  
  var dataHeight: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hoverColor: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var rightIconDesktopFill: js.UndefOr[String] = js.undefined
  
  var selectedTextColor: js.UndefOr[String] = js.undefined
}
object DataHeight {
  
  inline def apply(): DataHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataHeight] (val x: Self) extends AnyVal {
    
    inline def setDataHeight(value: Double): Self = StObject.set(x, "dataHeight", value.asInstanceOf[js.Any])
    
    inline def setDataHeightUndefined: Self = StObject.set(x, "dataHeight", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRightIconDesktopFill(value: String): Self = StObject.set(x, "rightIconDesktopFill", value.asInstanceOf[js.Any])
    
    inline def setRightIconDesktopFillUndefined: Self = StObject.set(x, "rightIconDesktopFill", js.undefined)
    
    inline def setSelectedTextColor(value: String): Self = StObject.set(x, "selectedTextColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextColorUndefined: Self = StObject.set(x, "selectedTextColor", js.undefined)
  }
}
