package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait SaveWidget extends js.Object {
  
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
  implicit class SaveWidgetOps[Self <: SaveWidget] (val x: Self) extends AnyVal {
    
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
    def setGetAttribution(value: () => Attribution): Self = this.set("getAttribution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlace(value: () => Place): Self = this.set("getPlace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAttribution(value: Attribution => Unit): Self = this.set("setAttribution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: SaveWidgetOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPlace(value: Place => Unit): Self = this.set("setPlace", js.Any.fromFunction1(value))
  }
}
