package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesLayerOptions extends js.Object {
  
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
  implicit class FusionTablesLayerOptionsOps[Self <: FusionTablesLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setHeatmap(value: FusionTablesHeatmap): Self = this.set("heatmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeatmap: Self = this.set("heatmap", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setQuery(value: FusionTablesQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: FusionTablesStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[FusionTablesStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = this.set("suppressInfoWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressInfoWindows: Self = this.set("suppressInfoWindows", js.undefined)
  }
}
