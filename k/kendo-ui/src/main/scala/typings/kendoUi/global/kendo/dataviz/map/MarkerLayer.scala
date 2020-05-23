package typings.kendoUi.global.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.map.LayerOptions
import typings.kendoUi.kendo.dataviz.map.MarkerLayerOptions
import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.MarkerLayer")
@js.native
class MarkerLayer protected ()
  extends typings.kendoUi.kendo.dataviz.map.MarkerLayer {
  def this(map: Map) = this()
  def this(map: Map, options: MarkerLayerOptions) = this()
  /* CompleteClass */
  override var items: js.Any = js.native
  /* CompleteClass */
  override var map: Map = js.native
  /* CompleteClass */
  override var options: LayerOptions = js.native
  /* CompleteClass */
  @JSName("options")
  override var options_MarkerLayer: MarkerLayerOptions = js.native
  /* CompleteClass */
  override def add(marker: typings.kendoUi.kendo.dataviz.map.Marker): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def remove(marker: typings.kendoUi.kendo.dataviz.map.Marker): Unit = js.native
  /* CompleteClass */
  override def setDataSource(dataSource: js.Any): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

