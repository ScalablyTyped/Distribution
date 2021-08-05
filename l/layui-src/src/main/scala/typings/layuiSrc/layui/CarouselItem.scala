package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarouselItem extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var item: js.UndefOr[js.Any] = js.undefined
  
  var prevIndex: js.UndefOr[Double] = js.undefined
}
object CarouselItem {
  
  inline def apply(): CarouselItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselItem]
  }
  
  extension [Self <: CarouselItem](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setPrevIndex(value: Double): Self = StObject.set(x, "prevIndex", value.asInstanceOf[js.Any])
    
    inline def setPrevIndexUndefined: Self = StObject.set(x, "prevIndex", js.undefined)
  }
}
