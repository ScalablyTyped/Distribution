package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartCategoryAxisItemSelect extends StObject {
  
  var from: js.UndefOr[js.Any] = js.native
  
  var max: js.UndefOr[js.Any] = js.native
  
  var min: js.UndefOr[js.Any] = js.native
  
  var mousewheel: js.UndefOr[ChartCategoryAxisItemSelectMousewheel] = js.native
  
  var to: js.UndefOr[js.Any] = js.native
}
object ChartCategoryAxisItemSelect {
  
  @scala.inline
  def apply(): ChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemSelect]
  }
  
  @scala.inline
  implicit class ChartCategoryAxisItemSelectMutableBuilder[Self <: ChartCategoryAxisItemSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMousewheel(value: ChartCategoryAxisItemSelectMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
