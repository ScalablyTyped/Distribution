package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayer extends Layer_ {
  @JSName("options")
  var options_TileLayer: TileLayerOptions
}

object TileLayer {
  @scala.inline
  def apply(hide: () => Unit, map: Map, options: TileLayerOptions, show: () => Unit): TileLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TileLayer]
  }
}

