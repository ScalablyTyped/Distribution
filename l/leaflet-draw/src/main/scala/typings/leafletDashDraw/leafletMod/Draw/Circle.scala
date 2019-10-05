package typings.leafletDashDraw.leafletMod.Draw

import typings.leafletDashDraw.leafletMod.DrawMap
import typings.leafletDashDraw.leafletMod.DrawOptions.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Circle")
@js.native
class Circle protected () extends SimpleShape {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: CircleOptions) = this()
}

