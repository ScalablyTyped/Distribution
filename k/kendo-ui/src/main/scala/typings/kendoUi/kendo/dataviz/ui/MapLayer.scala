package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.dataviz.map.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayer extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var extent: js.UndefOr[js.Any | Extent] = js.undefined
  
  var imagerySet: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var locationField: js.UndefOr[String] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[MapLayerStyle] = js.undefined
  
  var subdomains: js.UndefOr[js.Any] = js.undefined
  
  var symbol: js.UndefOr[String | js.Function] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var titleField: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[MapLayerTooltip] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var urlTemplate: js.UndefOr[String] = js.undefined
  
  var valueField: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MapLayer {
  
  @scala.inline
  def apply(): MapLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayer]
  }
  
  @scala.inline
  implicit class MapLayerMutableBuilder[Self <: MapLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setExtent(value: js.Any | Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagerySetUndefined: Self = StObject.set(x, "imagerySet", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocationField(value: String): Self = StObject.set(x, "locationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationFieldUndefined: Self = StObject.set(x, "locationField", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setStyle(value: MapLayerStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubdomains(value: js.Any): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    @scala.inline
    def setSymbol(value: String | js.Function): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setTitleField(value: String): Self = StObject.set(x, "titleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFieldUndefined: Self = StObject.set(x, "titleField", js.undefined)
    
    @scala.inline
    def setTooltip(value: MapLayerTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
