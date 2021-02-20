package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficLayerOptions extends StObject {
  
  var autoRefresh: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[Map[Element]] = js.native
}
object TrafficLayerOptions {
  
  @scala.inline
  def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  @scala.inline
  implicit class TrafficLayerOptionsMutableBuilder[Self <: TrafficLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
