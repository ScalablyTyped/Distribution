package typings.leafletDraw.mod.Draw

import typings.leafletDraw.mod.DrawMap
import typings.leafletDraw.mod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Rectangle")
@js.native
class Rectangle protected () extends SimpleShape {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: RectangleOptions) = this()
}

