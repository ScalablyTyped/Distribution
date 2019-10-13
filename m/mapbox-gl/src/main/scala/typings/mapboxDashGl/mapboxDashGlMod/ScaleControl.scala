package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.Anon_MaxWidth
import typings.mapboxDashGl.mapboxDashGlStrings.imperial
import typings.mapboxDashGl.mapboxDashGlStrings.metric
import typings.mapboxDashGl.mapboxDashGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Evented {
  def this(options: Anon_MaxWidth) = this()
  @JSName("setUnit")
  def setUnit_imperial(unit: imperial): Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: metric): Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: nautical): Unit = js.native
}

