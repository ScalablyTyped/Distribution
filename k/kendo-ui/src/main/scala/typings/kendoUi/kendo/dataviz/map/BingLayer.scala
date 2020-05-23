package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingLayer extends TileLayer {
  @JSName("options")
  var options_BingLayer: BingLayerOptions
  def imagerySet(): Unit
}

object BingLayer {
  @scala.inline
  def apply(hide: () => Unit, imagerySet: () => Unit, map: Map, options: BingLayerOptions, show: () => Unit): BingLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), imagerySet = js.Any.fromFunction0(imagerySet), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BingLayer]
  }
}

