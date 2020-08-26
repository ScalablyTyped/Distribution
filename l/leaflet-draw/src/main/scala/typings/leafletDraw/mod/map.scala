package typings.leafletDraw.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "map")
@js.native
object map extends js.Object {
  def apply(element: String | HTMLElement, options: js.UndefOr[MapOptions]): DrawMap = js.native
}

