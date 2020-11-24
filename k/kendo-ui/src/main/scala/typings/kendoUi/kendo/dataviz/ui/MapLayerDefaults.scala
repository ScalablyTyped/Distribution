package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaults extends js.Object {
  
  var bing: js.UndefOr[MapLayerDefaultsBing] = js.native
  
  var bubble: js.UndefOr[MapLayerDefaultsBubble] = js.native
  
  var marker: js.UndefOr[MapLayerDefaultsMarker] = js.native
  
  var shape: js.UndefOr[MapLayerDefaultsShape] = js.native
  
  var tile: js.UndefOr[MapLayerDefaultsTile] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
}
object MapLayerDefaults {
  
  @scala.inline
  def apply(): MapLayerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaults]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsOps[Self <: MapLayerDefaults] (val x: Self) extends AnyVal {
    
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
    def setBing(value: MapLayerDefaultsBing): Self = this.set("bing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBing: Self = this.set("bing", js.undefined)
    
    @scala.inline
    def setBubble(value: MapLayerDefaultsBubble): Self = this.set("bubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    
    @scala.inline
    def setMarker(value: MapLayerDefaultsMarker): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setShape(value: MapLayerDefaultsShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setTile(value: MapLayerDefaultsTile): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
  }
}
