package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitStop extends StObject {
  
  var location: LatLng = js.native
  
  var name: String = js.native
}
object TransitStop {
  
  @scala.inline
  def apply(location: LatLng, name: String): TransitStop = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitStop]
  }
  
  @scala.inline
  implicit class TransitStopMutableBuilder[Self <: TransitStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
