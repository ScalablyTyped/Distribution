package typings.kendoUi.global.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.map.LayerOptions
import typings.kendoUi.kendo.dataviz.map.ShapeLayerOptions
import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.ShapeLayer")
@js.native
class ShapeLayer protected ()
  extends typings.kendoUi.kendo.dataviz.map.ShapeLayer {
  def this(map: Map) = this()
  def this(map: Map, options: ShapeLayerOptions) = this()
  /* CompleteClass */
  override var map: Map = js.native
  /* CompleteClass */
  override var options: LayerOptions = js.native
  /* CompleteClass */
  @JSName("options")
  override var options_ShapeLayer: ShapeLayerOptions = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def setDataSource(): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

