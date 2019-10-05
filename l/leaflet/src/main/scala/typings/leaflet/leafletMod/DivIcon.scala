package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DivIcon")
@js.native
class DivIcon () extends Icon[DivIconOptions] {
  def this(options: DivIconOptions) = this()
}

@JSImport("leaflet", "divIcon")
@js.native
object divIcon extends js.Object {
  def apply(): DivIcon = js.native
  def apply(options: DivIconOptions): DivIcon = js.native
}

