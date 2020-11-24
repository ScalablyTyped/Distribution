package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder_ extends js.Object {
  
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
  implicit class Geocoder_Ops[Self <: Geocoder_] (val x: Self) extends AnyVal {
    
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
    def setGetURL(value: () => String): Self = this.set("getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: (String, js.Function) => js.Any): Self = this.set("query", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryURL(value: String => String): Self = this.set("queryURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverseQuery(value: (js.Any, js.Function) => js.Any): Self = this.set("reverseQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetID(value: String => js.Any): Self = this.set("setID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTileJSON(value: js.Any => js.Any): Self = this.set("setTileJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetURL(value: String => js.Any): Self = this.set("setURL", js.Any.fromFunction1(value))
  }
}
