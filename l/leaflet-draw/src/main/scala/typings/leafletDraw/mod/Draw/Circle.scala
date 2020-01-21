package typings.leafletDraw.mod.Draw

import typings.leafletDraw.mod.DrawMap
import typings.leafletDraw.mod.DrawOptions.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Circle")
@js.native
class Circle protected () extends SimpleShape {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: CircleOptions) = this()
}

