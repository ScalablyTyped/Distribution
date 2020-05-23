package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesLabelsSymbolOptions extends js.Object {
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

object ChartParallelAxesLabelsSymbolOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    `type`: SymbolKeyValue = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ChartParallelAxesLabelsSymbolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesLabelsSymbolOptions]
  }
}

