package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder_ extends StObject {
  
  def getURL(): String = js.native
  
  /**
    * Queries the geocoder with a query string, and returns its result, if any.
    */
  def query(queryString: String, callback: js.Function): js.Any = js.native
  
  def queryURL(url: String): String = js.native
  
  /**
    * Queries the geocoder with a location, and returns its result, if any.
    */
  def reverseQuery(location: js.Any, callback: js.Function): js.Any = js.native
  
  def setID(id: String): js.Any = js.native
  
  def setTileJSON(tilejson: js.Any): js.Any = js.native
  
  def setURL(url: String): js.Any = js.native
}
object Geocoder_ {
  
  @scala.inline
  def apply(
    getURL: () => String,
    query: (String, js.Function) => js.Any,
    queryURL: String => String,
    reverseQuery: (js.Any, js.Function) => js.Any,
    setID: String => js.Any,
    setTileJSON: js.Any => js.Any,
    setURL: String => js.Any
  ): Geocoder_ = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction0(getURL), query = js.Any.fromFunction2(query), queryURL = js.Any.fromFunction1(queryURL), reverseQuery = js.Any.fromFunction2(reverseQuery), setID = js.Any.fromFunction1(setID), setTileJSON = js.Any.fromFunction1(setTileJSON), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[Geocoder_]
  }
  
  @scala.inline
  implicit class Geocoder_MutableBuilder[Self <: Geocoder_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: (String, js.Function) => js.Any): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryURL(value: String => String): Self = StObject.set(x, "queryURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverseQuery(value: (js.Any, js.Function) => js.Any): Self = StObject.set(x, "reverseQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetID(value: String => js.Any): Self = StObject.set(x, "setID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTileJSON(value: js.Any => js.Any): Self = StObject.set(x, "setTileJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetURL(value: String => js.Any): Self = StObject.set(x, "setURL", js.Any.fromFunction1(value))
  }
}
