package typings.heremaps.H.service

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A map type is an object holding tile layers corresponding to a map type (e.g. 'normal', 'satellite' or 'terrain'). A map type contains at least a map property which defines the basic
  * map layer for a given map type. In addition it can hold other map layers with the given style, e.g. base, xbase, traffic etc.
  * {@link https://developer.here.com/documentation/maps/content/api_reference/H.service.html#.MapType}
  * @property map {H.map.layer.TileLayer} - the basic map tiles with all features and labels
  * @property mapnight {H.map.layer.TileLayer} - the basic map tiles with all features and labels (night mode)
  * @property xbase {H.map.layer.TileLayer=} - map tiles without features and labels
  * @property xbasenight {H.map.layer.TileLayer=} - map tiles without features and labels (night mode)
  * @property base {H.map.layer.TileLayer=} - map tiles without labels
  * @property basenight {H.map.layer.TileLayer=} - map tiles without labels (night mode)
  * @property trafficincidents {H.map.layer.TileLayer=} - map tiles with traffic flow highlighting
  * @property transit {H.map.layer.TileLayer=} - map tiles with public transit lines highlighted
  * @property labels {H.map.layer.TileLayer=} - transparent map tiles with labels only
  */
@js.native
trait MapType extends js.Object {
  
  var base: TileLayer = js.native
  
  var basenight: js.UndefOr[TileLayer | Null] = js.native
  
  var labels: TileLayer = js.native
  
  var map: TileLayer = js.native
  
  var mapnight: js.UndefOr[TileLayer | Null] = js.native
  
  var trafficincidents: js.UndefOr[MarkerTileLayer | Null] = js.native
  
  var transit: js.UndefOr[TileLayer] = js.native
  
  var xbase: TileLayer = js.native
  
  var xbasenight: js.UndefOr[TileLayer | Null] = js.native
}
object MapType {
  
  @scala.inline
  def apply(base: TileLayer, labels: TileLayer, map: TileLayer, xbase: TileLayer): MapType = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], xbase = xbase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
  
  @scala.inline
  implicit class MapTypeOps[Self <: MapType] (val x: Self) extends AnyVal {
    
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
    def setBase(value: TileLayer): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: TileLayer): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: TileLayer): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXbase(value: TileLayer): Self = this.set("xbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasenight(value: TileLayer): Self = this.set("basenight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasenight: Self = this.set("basenight", js.undefined)
    
    @scala.inline
    def setBasenightNull: Self = this.set("basenight", null)
    
    @scala.inline
    def setMapnight(value: TileLayer): Self = this.set("mapnight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapnight: Self = this.set("mapnight", js.undefined)
    
    @scala.inline
    def setMapnightNull: Self = this.set("mapnight", null)
    
    @scala.inline
    def setTrafficincidents(value: MarkerTileLayer): Self = this.set("trafficincidents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficincidents: Self = this.set("trafficincidents", js.undefined)
    
    @scala.inline
    def setTrafficincidentsNull: Self = this.set("trafficincidents", null)
    
    @scala.inline
    def setTransit(value: TileLayer): Self = this.set("transit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransit: Self = this.set("transit", js.undefined)
    
    @scala.inline
    def setXbasenight(value: TileLayer): Self = this.set("xbasenight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXbasenight: Self = this.set("xbasenight", js.undefined)
    
    @scala.inline
    def setXbasenightNull: Self = this.set("xbasenight", null)
  }
}
