package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerStyle extends StObject {
  
  var fill: js.UndefOr[MapLayerStyleFill] = js.native
  
  var stroke: js.UndefOr[MapLayerStyleStroke] = js.native
}
object MapLayerStyle {
  
  @scala.inline
  def apply(): MapLayerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerStyle]
  }
  
  @scala.inline
  implicit class MapLayerStyleMutableBuilder[Self <: MapLayerStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: MapLayerStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: MapLayerStyleStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
