package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait SaveWidget extends StObject {
  
  def getAttribution(): Attribution = js.native
  
  def getPlace(): Place = js.native
  
  def setAttribution(attribution: Attribution): Unit = js.native
  
  def setOptions(opts: SaveWidgetOptions): Unit = js.native
  
  def setPlace(place: Place): Unit = js.native
}
object SaveWidget {
  
  @scala.inline
  def apply(
    getAttribution: () => Attribution,
    getPlace: () => Place,
    setAttribution: Attribution => Unit,
    setOptions: SaveWidgetOptions => Unit,
    setPlace: Place => Unit
  ): SaveWidget = {
    val __obj = js.Dynamic.literal(getAttribution = js.Any.fromFunction0(getAttribution), getPlace = js.Any.fromFunction0(getPlace), setAttribution = js.Any.fromFunction1(setAttribution), setOptions = js.Any.fromFunction1(setOptions), setPlace = js.Any.fromFunction1(setPlace))
    __obj.asInstanceOf[SaveWidget]
  }
  
  @scala.inline
  implicit class SaveWidgetMutableBuilder[Self <: SaveWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttribution(value: () => Attribution): Self = StObject.set(x, "getAttribution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlace(value: () => Place): Self = StObject.set(x, "getPlace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAttribution(value: Attribution => Unit): Self = StObject.set(x, "setAttribution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: SaveWidgetOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPlace(value: Place => Unit): Self = StObject.set(x, "setPlace", js.Any.fromFunction1(value))
  }
}
