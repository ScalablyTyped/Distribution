package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTooltip extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[ChartTooltipBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[ChartTooltipPadding] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var sharedTemplate: js.UndefOr[String | js.Function] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartTooltip {
  
  @scala.inline
  def apply(): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltip]
  }
  
  @scala.inline
  implicit class ChartTooltipMutableBuilder[Self <: ChartTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
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
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: ChartTooltipPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTemplate(value: String | js.Function): Self = StObject.set(x, "sharedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTemplateUndefined: Self = StObject.set(x, "sharedTemplate", js.undefined)
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
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
