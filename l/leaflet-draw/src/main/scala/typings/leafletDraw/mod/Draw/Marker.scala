package typings.leafletDraw.mod.Draw

import typings.leafletDraw.mod.DrawMap
import typings.leafletDraw.mod.DrawOptions.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Marker")
@js.native
class Marker protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: MarkerOptions) = this()
}

