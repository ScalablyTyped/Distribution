package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
}
object TitleStyleOptions {
  
  inline def apply(): TitleStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
  }
}
