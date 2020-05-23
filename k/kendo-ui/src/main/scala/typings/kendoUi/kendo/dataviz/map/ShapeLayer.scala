package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLayer extends Layer_ {
  @JSName("options")
  var options_ShapeLayer: ShapeLayerOptions
  def setDataSource(): Unit
}

object ShapeLayer {
  @scala.inline
  def apply(
    hide: () => Unit,
    map: Map,
    options: ShapeLayerOptions,
    setDataSource: () => Unit,
    show: () => Unit
  ): ShapeLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setDataSource = js.Any.fromFunction0(setDataSource), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ShapeLayer]
  }
}

