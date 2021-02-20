package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Transformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectOptions extends StObject {
  
  var clip: js.UndefOr[typings.kendoUi.kendo.drawing.Path] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var fill: js.UndefOr[typings.kendoUi.kendo.drawing.FillOptions] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[typings.kendoUi.kendo.drawing.StrokeOptions] = js.native
  
  var tooltip: js.UndefOr[typings.kendoUi.kendo.drawing.TooltipOptions] = js.native
  
  var transform: js.UndefOr[Transformation] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object RectOptions {
  
  @scala.inline
  def apply(): RectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectOptions]
  }
  
  @scala.inline
  implicit class RectOptionsMutableBuilder[Self <: RectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: typings.kendoUi.kendo.drawing.Path): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFill(value: typings.kendoUi.kendo.drawing.FillOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: typings.kendoUi.kendo.drawing.StrokeOptions): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
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
