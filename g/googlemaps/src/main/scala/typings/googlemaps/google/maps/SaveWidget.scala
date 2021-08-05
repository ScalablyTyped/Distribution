package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait SaveWidget extends StObject {
  
  def getAttribution(): Attribution
  
  def getPlace(): Place
  
  def setAttribution(attribution: Attribution): Unit
  
  def setOptions(opts: SaveWidgetOptions): Unit
  
  def setPlace(place: Place): Unit
}
object SaveWidget {
  
  inline def apply(
    getAttribution: () => Attribution,
    getPlace: () => Place,
    setAttribution: Attribution => Unit,
    setOptions: SaveWidgetOptions => Unit,
    setPlace: Place => Unit
  ): SaveWidget = {
    val __obj = js.Dynamic.literal(getAttribution = js.Any.fromFunction0(getAttribution), getPlace = js.Any.fromFunction0(getPlace), setAttribution = js.Any.fromFunction1(setAttribution), setOptions = js.Any.fromFunction1(setOptions), setPlace = js.Any.fromFunction1(setPlace))
    __obj.asInstanceOf[SaveWidget]
  }
  
  extension [Self <: SaveWidget](x: Self) {
    
    inline def setGetAttribution(value: () => Attribution): Self = StObject.set(x, "getAttribution", js.Any.fromFunction0(value))
    
    inline def setGetPlace(value: () => Place): Self = StObject.set(x, "getPlace", js.Any.fromFunction0(value))
    
    inline def setSetAttribution(value: Attribution => Unit): Self = StObject.set(x, "setAttribution", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: SaveWidgetOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    inline def setSetPlace(value: Place => Unit): Self = StObject.set(x, "setPlace", js.Any.fromFunction1(value))
  }
}
