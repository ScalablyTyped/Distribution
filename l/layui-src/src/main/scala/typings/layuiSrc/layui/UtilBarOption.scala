package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilBarOption extends StObject {
  
  var bar1: js.UndefOr[Boolean | String] = js.native
  
  var bar2: js.UndefOr[Boolean | String] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var click: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.native
  
  var css: js.UndefOr[StringDictionary[String | Double]] = js.native
  
  var showHeight: js.UndefOr[Double] = js.native
}
object UtilBarOption {
  
  @scala.inline
  def apply(): UtilBarOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilBarOption]
  }
  
  @scala.inline
  implicit class UtilBarOptionMutableBuilder[Self <: UtilBarOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBar1(value: Boolean | String): Self = StObject.set(x, "bar1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBar1Undefined: Self = StObject.set(x, "bar1", js.undefined)
    
    @scala.inline
    def setBar2(value: Boolean | String): Self = StObject.set(x, "bar2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBar2Undefined: Self = StObject.set(x, "bar2", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setClick(value: /* type */ String => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setCss(value: StringDictionary[String | Double]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setShowHeight(value: Double): Self = StObject.set(x, "showHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeightUndefined: Self = StObject.set(x, "showHeight", js.undefined)
  }
}
