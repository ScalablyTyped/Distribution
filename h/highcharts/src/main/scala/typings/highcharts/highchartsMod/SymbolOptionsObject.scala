package typings.highcharts.highchartsMod

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
    anchorX: Int | Double = null,
    anchorY: Int | Double = null,
    end: Int | Double = null,
    open: js.UndefOr[Boolean] = js.undefined,
    r: Int | Double = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (anchorX != null) __obj.updateDynamic("anchorX")(anchorX.asInstanceOf[js.Any])
    if (anchorY != null) __obj.updateDynamic("anchorY")(anchorY.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolOptionsObject]
  }
}

