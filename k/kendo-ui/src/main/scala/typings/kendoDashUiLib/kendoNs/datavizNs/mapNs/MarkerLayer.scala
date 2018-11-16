package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.MarkerLayer")
@js.native
class MarkerLayer protected () extends Layer {
  def this(map: kendoDashUiLib.kendoNs.datavizNs.uiNs.Map) = this()
  def this(map: kendoDashUiLib.kendoNs.datavizNs.uiNs.Map, options: MarkerLayerOptions) = this()
  var items: js.Any = js.native
  @JSName("options")
  var options_MarkerLayer: MarkerLayerOptions = js.native
  def add(marker: Marker): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def remove(marker: Marker): scala.Unit = js.native
  def setDataSource(dataSource: js.Any): scala.Unit = js.native
}

