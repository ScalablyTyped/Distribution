package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
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

