package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilBarOption extends StObject {
  
  var bar1: js.UndefOr[Boolean | String] = js.undefined
  
  var bar2: js.UndefOr[Boolean | String] = js.undefined
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var click: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  
  var css: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  
  var showHeight: js.UndefOr[Double] = js.undefined
}
object UtilBarOption {
  
  inline def apply(): UtilBarOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilBarOption]
  }
  
  extension [Self <: UtilBarOption](x: Self) {
    
    inline def setBar1(value: Boolean | String): Self = StObject.set(x, "bar1", value.asInstanceOf[js.Any])
    
    inline def setBar1Undefined: Self = StObject.set(x, "bar1", js.undefined)
    
    inline def setBar2(value: Boolean | String): Self = StObject.set(x, "bar2", value.asInstanceOf[js.Any])
    
    inline def setBar2Undefined: Self = StObject.set(x, "bar2", js.undefined)
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setClick(value: /* type */ String => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setCss(value: StringDictionary[String | Double]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setShowHeight(value: Double): Self = StObject.set(x, "showHeight", value.asInstanceOf[js.Any])
    
    inline def setShowHeightUndefined: Self = StObject.set(x, "showHeight", js.undefined)
  }
}
