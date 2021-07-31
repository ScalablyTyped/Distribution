package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.Attribution
import typings.googlemaps.google.maps.Place
import typings.googlemaps.google.maps.SaveWidgetOptions
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@JSGlobal("google.maps.SaveWidget")
@js.native
class SaveWidget protected ()
  extends StObject
     with typings.googlemaps.google.maps.SaveWidget {
  def this(container: Node) = this()
  def this(container: Node, opts: SaveWidgetOptions) = this()
  
  /* CompleteClass */
  override def getAttribution(): Attribution = js.native
  
  /* CompleteClass */
  override def getPlace(): Place = js.native
  
  /* CompleteClass */
  override def setAttribution(attribution: Attribution): Unit = js.native
  
  /* CompleteClass */
  override def setOptions(opts: SaveWidgetOptions): Unit = js.native
  
  /* CompleteClass */
  override def setPlace(place: Place): Unit = js.native
}
