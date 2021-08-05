package typings.heremaps.H.service

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait MapType extends StObject {
  
  var base: TileLayer
  
  var basenight: js.UndefOr[TileLayer | Null] = js.undefined
  
  var labels: TileLayer
  
  var map: TileLayer
  
  var mapnight: js.UndefOr[TileLayer | Null] = js.undefined
  
  var trafficincidents: js.UndefOr[MarkerTileLayer | Null] = js.undefined
  
  var transit: js.UndefOr[TileLayer] = js.undefined
  
  var xbase: TileLayer
  
  var xbasenight: js.UndefOr[TileLayer | Null] = js.undefined
}
object MapType {
  
  inline def apply(base: TileLayer, labels: TileLayer, map: TileLayer, xbase: TileLayer): MapType = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], xbase = xbase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
  
  extension [Self <: MapType](x: Self) {
    
    inline def setBase(value: TileLayer): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBasenight(value: TileLayer): Self = StObject.set(x, "basenight", value.asInstanceOf[js.Any])
    
    inline def setBasenightNull: Self = StObject.set(x, "basenight", null)
    
    inline def setBasenightUndefined: Self = StObject.set(x, "basenight", js.undefined)
    
    inline def setLabels(value: TileLayer): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setMap(value: TileLayer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapnight(value: TileLayer): Self = StObject.set(x, "mapnight", value.asInstanceOf[js.Any])
    
    inline def setMapnightNull: Self = StObject.set(x, "mapnight", null)
    
    inline def setMapnightUndefined: Self = StObject.set(x, "mapnight", js.undefined)
    
    inline def setTrafficincidents(value: MarkerTileLayer): Self = StObject.set(x, "trafficincidents", value.asInstanceOf[js.Any])
    
    inline def setTrafficincidentsNull: Self = StObject.set(x, "trafficincidents", null)
    
    inline def setTrafficincidentsUndefined: Self = StObject.set(x, "trafficincidents", js.undefined)
    
    inline def setTransit(value: TileLayer): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
    
    inline def setTransitUndefined: Self = StObject.set(x, "transit", js.undefined)
    
    inline def setXbase(value: TileLayer): Self = StObject.set(x, "xbase", value.asInstanceOf[js.Any])
    
    inline def setXbasenight(value: TileLayer): Self = StObject.set(x, "xbasenight", value.asInstanceOf[js.Any])
    
    inline def setXbasenightNull: Self = StObject.set(x, "xbasenight", null)
    
    inline def setXbasenightUndefined: Self = StObject.set(x, "xbasenight", js.undefined)
  }
}
