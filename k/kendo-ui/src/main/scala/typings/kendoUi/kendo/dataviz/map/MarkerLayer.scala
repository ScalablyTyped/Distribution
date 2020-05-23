package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLayer extends Layer_ {
  var items: js.Any
  @JSName("options")
  var options_MarkerLayer: MarkerLayerOptions
  def add(marker: Marker): Unit
  def clear(): Unit
  def remove(marker: Marker): Unit
  def setDataSource(dataSource: js.Any): Unit
}

object MarkerLayer {
  @scala.inline
  def apply(
    add: Marker => Unit,
    clear: () => Unit,
    hide: () => Unit,
    items: js.Any,
    map: Map,
    options: MarkerLayerOptions,
    remove: Marker => Unit,
    setDataSource: js.Any => Unit,
    show: () => Unit
  ): MarkerLayer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), hide = js.Any.fromFunction0(hide), items = items.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setDataSource = js.Any.fromFunction1(setDataSource), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[MarkerLayer]
  }
}

