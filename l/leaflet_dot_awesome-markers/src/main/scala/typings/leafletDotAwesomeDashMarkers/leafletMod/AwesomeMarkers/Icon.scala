package typings.leafletDotAwesomeDashMarkers.leafletMod.AwesomeMarkers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "AwesomeMarkers.Icon")
@js.native
class Icon ()
  extends typings.leaflet.leafletMod.Icon[AwesomeMarkersIconOptions] {
  def this(options: AwesomeMarkersIconOptions) = this()
}

@JSImport("leaflet", "AwesomeMarkers.icon")
@js.native
object icon extends js.Object {
  def apply(options: AwesomeMarkersIconOptions): Icon = js.native
}

