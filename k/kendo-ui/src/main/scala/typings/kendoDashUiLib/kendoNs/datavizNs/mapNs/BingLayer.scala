package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.BingLayer")
@js.native
class BingLayer protected () extends TileLayer {
  def this(map: kendoDashUiLib.kendoNs.datavizNs.uiNs.Map) = this()
  def this(map: kendoDashUiLib.kendoNs.datavizNs.uiNs.Map, options: BingLayerOptions) = this()
  @JSName("options")
  var options_BingLayer: BingLayerOptions = js.native
  def imagerySet(): scala.Unit = js.native
}

