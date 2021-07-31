package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Transformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  var clip: js.UndefOr[typings.kendoUi.kendo.drawing.Path] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pdf: js.UndefOr[typings.kendoUi.kendo.drawing.PDFOptions] = js.undefined
  
  var tooltip: js.UndefOr[typings.kendoUi.kendo.drawing.TooltipOptions] = js.undefined
  
  var transform: js.UndefOr[Transformation] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object GroupOptions {
  
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: typings.kendoUi.kendo.drawing.Path): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPdf(value: typings.kendoUi.kendo.drawing.PDFOptions): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setTooltip(value: typings.kendoUi.kendo.drawing.TooltipOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
