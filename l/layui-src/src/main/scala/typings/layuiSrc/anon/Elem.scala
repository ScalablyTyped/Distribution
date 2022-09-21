package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elem extends StObject {
  
  /**
    * 指定开启懒加载的img元素选择器，如 elem: '.demo img' 或 elem: 'img.load' 默认:img
    */
  var elem: js.UndefOr[String] = js.undefined
  
  /**
    * 滚动条所在元素选择器，默认document
    */
  var scrollElem: js.UndefOr[String] = js.undefined
}
object Elem {
  
  inline def apply(): Elem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elem]
  }
  
  extension [Self <: Elem](x: Self) {
    
    inline def setElem(value: String): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setScrollElem(value: String): Self = StObject.set(x, "scrollElem", value.asInstanceOf[js.Any])
    
    inline def setScrollElemUndefined: Self = StObject.set(x, "scrollElem", js.undefined)
  }
}
