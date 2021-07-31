package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGaugeScaleLabels extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[RadialGaugeScaleLabelsBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[Double | RadialGaugeScaleLabelsMargin] = js.undefined
  
  var padding: js.UndefOr[Double | RadialGaugeScaleLabelsPadding] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object RadialGaugeScaleLabels {
  
  @scala.inline
  def apply(): RadialGaugeScaleLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugeScaleLabels]
  }
  
  @scala.inline
  implicit class RadialGaugeScaleLabelsMutableBuilder[Self <: RadialGaugeScaleLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: RadialGaugeScaleLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | RadialGaugeScaleLabelsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | RadialGaugeScaleLabelsPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
