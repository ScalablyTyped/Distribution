package typings.mapboxGl.mod

import typings.mapboxGl.AnonMaxWidth
import typings.mapboxGl.mapboxGlStrings.imperial
import typings.mapboxGl.mapboxGlStrings.metric
import typings.mapboxGl.mapboxGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Evented {
  def this(options: AnonMaxWidth) = this()
  @JSName("setUnit")
  def setUnit_imperial(unit: imperial): Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: metric): Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: nautical): Unit = js.native
}

