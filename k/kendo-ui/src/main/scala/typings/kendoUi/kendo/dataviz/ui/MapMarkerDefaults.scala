package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarkerDefaults extends StObject {
  
  var shape: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[MapMarkerDefaultsTooltip] = js.native
}
object MapMarkerDefaults {
  
  @scala.inline
  def apply(): MapMarkerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaults]
  }
  
  @scala.inline
  implicit class MapMarkerDefaultsMutableBuilder[Self <: MapMarkerDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTooltip(value: MapMarkerDefaultsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
