package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.wheel
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "MapWheelEvent")
@js.native
class MapWheelEvent () extends MapboxEvent[WheelEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapWheelEvent: wheel = js.native
}
