package typings.kendoUi.global.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.map.LayerOptions
import typings.kendoUi.kendo.dataviz.map.TileLayerOptions
import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.TileLayer")
@js.native
class TileLayer protected ()
  extends typings.kendoUi.kendo.dataviz.map.TileLayer {
  def this(map: Map) = this()
  def this(map: Map, options: TileLayerOptions) = this()
  /* CompleteClass */
  override var map: Map = js.native
  /* CompleteClass */
  override var options: LayerOptions = js.native
  /* CompleteClass */
  @JSName("options")
  override var options_TileLayer: TileLayerOptions = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

