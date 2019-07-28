package typings.kendoDashUi.kendoNs.datavizNs.mapNs

import typings.kendoDashUi.kendoNs.datavizNs.uiNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.ShapeLayer")
@js.native
class ShapeLayer protected () extends Layer {
  def this(map: Map) = this()
  def this(map: Map, options: ShapeLayerOptions) = this()
  @JSName("options")
  var options_ShapeLayer: ShapeLayerOptions = js.native
  def setDataSource(): Unit = js.native
}

