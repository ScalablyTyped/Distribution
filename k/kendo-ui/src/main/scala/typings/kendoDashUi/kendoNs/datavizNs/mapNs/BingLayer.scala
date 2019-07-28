package typings.kendoDashUi.kendoNs.datavizNs.mapNs

import typings.kendoDashUi.kendoNs.datavizNs.uiNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.BingLayer")
@js.native
class BingLayer protected () extends TileLayer {
  def this(map: Map) = this()
  def this(map: Map, options: BingLayerOptions) = this()
  @JSName("options")
  var options_BingLayer: BingLayerOptions = js.native
  def imagerySet(): Unit = js.native
}

