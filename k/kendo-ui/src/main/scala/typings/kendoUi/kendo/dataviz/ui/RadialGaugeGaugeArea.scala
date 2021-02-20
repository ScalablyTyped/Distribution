package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGaugeGaugeArea extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[RadialGaugeGaugeAreaBorder] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Double | RadialGaugeGaugeAreaMargin] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object RadialGaugeGaugeArea {
  
  @scala.inline
  def apply(): RadialGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugeGaugeArea]
  }
  
  @scala.inline
  implicit class RadialGaugeGaugeAreaMutableBuilder[Self <: RadialGaugeGaugeArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: RadialGaugeGaugeAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | RadialGaugeGaugeAreaMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
