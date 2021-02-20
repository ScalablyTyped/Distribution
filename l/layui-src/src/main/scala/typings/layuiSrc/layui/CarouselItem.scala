package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselItem extends StObject {
  
  var index: js.UndefOr[Double] = js.native
  
  var item: js.UndefOr[js.Any] = js.native
  
  var prevIndex: js.UndefOr[Double] = js.native
}
object CarouselItem {
  
  @scala.inline
  def apply(): CarouselItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselItem]
  }
  
  @scala.inline
  implicit class CarouselItemMutableBuilder[Self <: CarouselItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setPrevIndex(value: Double): Self = StObject.set(x, "prevIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevIndexUndefined: Self = StObject.set(x, "prevIndex", js.undefined)
  }
}
