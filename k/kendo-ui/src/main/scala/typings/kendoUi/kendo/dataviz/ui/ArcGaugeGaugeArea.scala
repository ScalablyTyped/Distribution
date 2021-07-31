package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGaugeGaugeArea extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[ArcGaugeGaugeAreaBorder] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double | ArcGaugeGaugeAreaMargin] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ArcGaugeGaugeArea {
  
  @scala.inline
  def apply(): ArcGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeGaugeArea]
  }
  
  @scala.inline
  implicit class ArcGaugeGaugeAreaMutableBuilder[Self <: ArcGaugeGaugeArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ArcGaugeGaugeAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ArcGaugeGaugeAreaMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
