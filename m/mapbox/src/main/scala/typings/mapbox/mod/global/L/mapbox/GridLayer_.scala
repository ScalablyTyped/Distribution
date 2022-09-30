package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLayer_ extends StObject {
  
  def active(): Boolean = js.native
  
  def addTo(map: Map_): Any = js.native
  
  /**
    * Load data for a given latitude, longitude point on the map, and call the callback function with that data, if any.
    */
  def getData(
    latlng: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LatLng */ Any,
    callback: js.Function
  ): Any = js.native
  
  /**
    * Returns this layer's TileJSON object which determines its tile source, zoom bounds and other metadata.
    */
  def getTileJSON(): Any = js.native
  
  /**
    * Bind an event handler to a given event on this L.mapbox.gridLayer instance.
    * GridLayers expose a number of useful events that give you access to UTFGrid data as the user interacts with the map.
    */
  def on(event: String, handler: js.Function): Any = js.native
  def on(event: String, handler: js.Function, context: Any): Any = js.native
  
  def onAdd(map: Map_): Any = js.native
  
  def onRemove(): Any = js.native
}
