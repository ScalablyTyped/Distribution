package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisDefaultsLabels extends StObject {
  
  var font: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[Double | ChartAxisDefaultsLabelsMargin] = js.native
  
  var mirror: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[Double | ChartAxisDefaultsLabelsPadding] = js.native
  
  var rotation: js.UndefOr[String | Double | ChartAxisDefaultsLabelsRotation] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartAxisDefaultsLabels {
  
  @scala.inline
  def apply(): ChartAxisDefaultsLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisDefaultsLabels]
  }
  
  @scala.inline
  implicit class ChartAxisDefaultsLabelsMutableBuilder[Self <: ChartAxisDefaultsLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartAxisDefaultsLabelsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | ChartAxisDefaultsLabelsPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRotation(value: String | Double | ChartAxisDefaultsLabelsRotation): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
