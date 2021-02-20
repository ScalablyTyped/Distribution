package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartCategoryAxisItemSelectMousewheel extends StObject {
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[String] = js.native
}
object ChartCategoryAxisItemSelectMousewheel {
  
  @scala.inline
  def apply(): ChartCategoryAxisItemSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemSelectMousewheel]
  }
  
  @scala.inline
  implicit class ChartCategoryAxisItemSelectMousewheelMutableBuilder[Self <: ChartCategoryAxisItemSelectMousewheel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
