package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartValueAxisItemMajorTicks extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartValueAxisItemMajorTicks {
  
  @scala.inline
  def apply(): ChartValueAxisItemMajorTicks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartValueAxisItemMajorTicks]
  }
  
  @scala.inline
  implicit class ChartValueAxisItemMajorTicksMutableBuilder[Self <: ChartValueAxisItemMajorTicks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
