package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Control {
  def this(options: mapboxDashGlLib.Anon_MaxWidth) = this()
  @JSName("setUnit")
  def setUnit_imperial(unit: mapboxDashGlLib.mapboxDashGlLibStrings.imperial): scala.Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: mapboxDashGlLib.mapboxDashGlLibStrings.metric): scala.Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: mapboxDashGlLib.mapboxDashGlLibStrings.nautical): scala.Unit = js.native
}

