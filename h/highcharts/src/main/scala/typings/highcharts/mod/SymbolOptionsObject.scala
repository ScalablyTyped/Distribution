package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolOptionsObject extends js.Object {
  /**
    * The anchor X position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorX: js.UndefOr[Double] = js.undefined
  /**
    * The anchor Y position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorY: js.UndefOr[Double] = js.undefined
  /**
    * The end angle of an `arc` symbol.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Whether to draw `arc` symbol open or closed.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * The radius of an `arc` symbol, or the border radius for the `callout`
    * symbol.
    */
  var r: js.UndefOr[Double] = js.undefined
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.undefined
  /**
    * The start angle of an `arc` symbol.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object SymbolOptionsObject {
  @scala.inline
  def apply(
    anchorX: js.UndefOr[Double] = js.undefined,
    anchorY: js.UndefOr[Double] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    r: js.UndefOr[Double] = js.undefined,
    rounded: js.UndefOr[Boolean] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorX)) __obj.updateDynamic("anchorX")(anchorX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorY)) __obj.updateDynamic("anchorY")(anchorY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolOptionsObject]
  }
}

