package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGaugeScaleRange extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
}
object LinearGaugeScaleRange {
  
  @scala.inline
  def apply(): LinearGaugeScaleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeScaleRange]
  }
  
  @scala.inline
  implicit class LinearGaugeScaleRangeMutableBuilder[Self <: LinearGaugeScaleRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
