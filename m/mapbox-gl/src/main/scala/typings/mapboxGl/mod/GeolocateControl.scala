package typings.mapboxGl.mod

import typings.mapboxGl.AnonFitBoundsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "GeolocateControl")
@js.native
class GeolocateControl () extends Evented {
  def this(options: AnonFitBoundsOptions) = this()
  def trigger(): Boolean = js.native
}

