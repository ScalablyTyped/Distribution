package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisLabelsSymbolOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) The symbol type. Points to a definition function in the
    * `Highcharts.Renderer.symbols` collection.
    */
  var `type`: js.UndefOr[SymbolKeyValue] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object YAxisLabelsSymbolOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    padding: Int | Double = null,
    `type`: SymbolKeyValue = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): YAxisLabelsSymbolOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisLabelsSymbolOptions]
  }
}

