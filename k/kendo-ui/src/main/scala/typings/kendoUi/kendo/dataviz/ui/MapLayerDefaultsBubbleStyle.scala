package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsBubbleStyle extends StObject {
  
  var fill: js.UndefOr[MapLayerDefaultsBubbleStyleFill] = js.undefined
  
  var stroke: js.UndefOr[MapLayerDefaultsBubbleStyleStroke] = js.undefined
}
object MapLayerDefaultsBubbleStyle {
  
  @scala.inline
  def apply(): MapLayerDefaultsBubbleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsBubbleStyle]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsBubbleStyleMutableBuilder[Self <: MapLayerDefaultsBubbleStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: MapLayerDefaultsBubbleStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: MapLayerDefaultsBubbleStyleStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
