package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsShapeStyle extends StObject {
  
  var fill: js.UndefOr[MapLayerDefaultsShapeStyleFill] = js.native
  
  var stroke: js.UndefOr[MapLayerDefaultsShapeStyleStroke] = js.native
}
object MapLayerDefaultsShapeStyle {
  
  @scala.inline
  def apply(): MapLayerDefaultsShapeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsShapeStyle]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsShapeStyleMutableBuilder[Self <: MapLayerDefaultsShapeStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: MapLayerDefaultsShapeStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: MapLayerDefaultsShapeStyleStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
