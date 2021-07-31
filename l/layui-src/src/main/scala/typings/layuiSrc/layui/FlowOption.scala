package typings.layuiSrc.layui

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowOption extends StObject {
  
  var done: js.UndefOr[
    js.Function2[
      /* page */ Double, 
      /* next */ js.Function2[/* html */ String, /* isMore */ Boolean, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var end: js.UndefOr[String] = js.undefined
  
  var isAuto: js.UndefOr[Boolean] = js.undefined
  
  var isLazyimg: js.UndefOr[Boolean] = js.undefined
  
  var mb: js.UndefOr[Double] = js.undefined
  
  var scrollElem: js.UndefOr[String | HTMLElement] = js.undefined
}
object FlowOption {
  
  @scala.inline
  def apply(): FlowOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowOption]
  }
  
  @scala.inline
  implicit class FlowOptionMutableBuilder[Self <: FlowOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(
      value: (/* page */ Double, /* next */ js.Function2[/* html */ String, /* isMore */ Boolean, Unit]) => Unit
    ): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setIsAuto(value: Boolean): Self = StObject.set(x, "isAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoUndefined: Self = StObject.set(x, "isAuto", js.undefined)
    
    @scala.inline
    def setIsLazyimg(value: Boolean): Self = StObject.set(x, "isLazyimg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLazyimgUndefined: Self = StObject.set(x, "isLazyimg", js.undefined)
    
    @scala.inline
    def setMb(value: Double): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    @scala.inline
    def setScrollElem(value: String | HTMLElement): Self = StObject.set(x, "scrollElem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollElemUndefined: Self = StObject.set(x, "scrollElem", js.undefined)
  }
}
