package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Line")
@js.native
class Line_ protected ()
  extends LayerGroup_[js.Any] {
  def this(route: IRoute) = this()
  def this(route: IRoute, options: LineOptions) = this()
  
  def getBounds(): LatLngBounds_ = js.native
}
