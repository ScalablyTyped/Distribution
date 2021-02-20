package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowOptionsObject extends StObject {
  
  /**
    * The shadow color.
    */
  var color: js.UndefOr[ColorString] = js.native
  
  /**
    * The horizontal offset from the element.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The vertical offset from the element.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * The shadow opacity.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * The shadow width or distance from the element.
    */
  var width: js.UndefOr[Double] = js.native
}
object ShadowOptionsObject {
  
  @scala.inline
  def apply(): ShadowOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowOptionsObject]
  }
  
  @scala.inline
  implicit class ShadowOptionsObjectMutableBuilder[Self <: ShadowOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
