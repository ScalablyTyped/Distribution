package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderControl_ extends StObject {
  
  def getURL(): String
  
  /**
    * Bind a listener to an event emitted by the geocoder control. Supported additional events are
    */
  def on(event: String, callback: js.Function): Any
  
  def onAdd(map: Map_): Any
  
  /**
    * Set the map id used for geocoding.
    */
  def setID(id: String): Any
  
  /**
    * Set the TileJSON used for geocoding.
    */
  def setTileJSON(tilejson: Any): Any
  
  /**
    * Set the url used for geocoding.
    */
  def setURL(url: String): Any
}
object GeocoderControl_ {
  
  inline def apply(
    getURL: () => String,
    on: (String, js.Function) => Any,
    onAdd: Map_ => Any,
    setID: String => Any,
    setTileJSON: Any => Any,
    setURL: String => Any
  ): GeocoderControl_ = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction0(getURL), on = js.Any.fromFunction2(on), onAdd = js.Any.fromFunction1(onAdd), setID = js.Any.fromFunction1(setID), setTileJSON = js.Any.fromFunction1(setTileJSON), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[GeocoderControl_]
  }
  
  extension [Self <: GeocoderControl_](x: Self) {
    
    inline def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    inline def setOn(value: (String, js.Function) => Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnAdd(value: Map_ => Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setSetID(value: String => Any): Self = StObject.set(x, "setID", js.Any.fromFunction1(value))
    
    inline def setSetTileJSON(value: Any => Any): Self = StObject.set(x, "setTileJSON", js.Any.fromFunction1(value))
    
    inline def setSetURL(value: String => Any): Self = StObject.set(x, "setURL", js.Any.fromFunction1(value))
  }
}
