package typings.leafletDashDraw.leafletMod.Draw

import typings.leafletDashDraw.leafletMod.DrawMap
import typings.leafletDashDraw.leafletMod.DrawOptions.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Marker")
@js.native
class Marker protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: MarkerOptions) = this()
}

