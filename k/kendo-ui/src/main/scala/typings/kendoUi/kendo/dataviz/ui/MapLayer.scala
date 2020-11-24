package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.dataviz.map.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayer extends js.Object {
  
  var attribution: js.UndefOr[String] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var extent: js.UndefOr[js.Any | Extent] = js.native
  
  var imagerySet: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var locationField: js.UndefOr[String] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var shape: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[MapLayerStyle] = js.native
  
  var subdomains: js.UndefOr[js.Any] = js.native
  
  var symbol: js.UndefOr[String | js.Function] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var titleField: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[MapLayerTooltip] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var urlTemplate: js.UndefOr[String] = js.native
  
  var valueField: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object MapLayer {
  
  @scala.inline
  def apply(): MapLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayer]
  }
  
  @scala.inline
  implicit class MapLayerOps[Self <: MapLayer] (val x: Self) extends AnyVal {
    
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExtent(value: js.Any | Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setImagerySet(value: String): Self = this.set("imagerySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagerySet: Self = this.set("imagerySet", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLocationField(value: String): Self = this.set("locationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationField: Self = this.set("locationField", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setStyle(value: MapLayerStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubdomains(value: js.Any): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    
    @scala.inline
    def setSymbol(value: String | js.Function): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTitleField(value: String): Self = this.set("titleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleField: Self = this.set("titleField", js.undefined)
    
    @scala.inline
    def setTooltip(value: MapLayerTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlTemplate: Self = this.set("urlTemplate", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
