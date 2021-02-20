package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesLayerOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.native
  
  var heatmap: js.UndefOr[FusionTablesHeatmap] = js.native
  
  var map: js.UndefOr[Map[Element]] = js.native
  
  var query: js.UndefOr[FusionTablesQuery] = js.native
  
  var styles: js.UndefOr[js.Array[FusionTablesStyle]] = js.native
  
  var suppressInfoWindows: js.UndefOr[Boolean] = js.native
}
object FusionTablesLayerOptions {
  
  @scala.inline
  def apply(): FusionTablesLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesLayerOptions]
  }
  
  @scala.inline
  implicit class FusionTablesLayerOptionsMutableBuilder[Self <: FusionTablesLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setHeatmap(value: FusionTablesHeatmap): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setQuery(value: FusionTablesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Array[FusionTablesStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: FusionTablesStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
  }
}
