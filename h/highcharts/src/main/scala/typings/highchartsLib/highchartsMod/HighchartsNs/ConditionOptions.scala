package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Under which conditions the rule applies.
  */
trait ConditionOptions extends js.Object {
  /**
    * A callback function to gain complete control on when the responsive rule applies. Return true if it applies.
    * This opens for checking against other metrics than the chart size, or example the document size or other elements.
    * The this keyword refers to the Chart object.
    * @since 5.0.0
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
    * The responsive rule applies if the chart height is less than this.
    * @since 5.0.0
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The responsive rule applies if the chart height is less than this.
    * @since 5.0.0
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The responsive rule applies if the chart height is greater than this.
    * @since 5.0.0
    * @default 0
    */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The responsive rule applies if the chart width is greater than this.
    * @since 5.0.0
    * @default 0
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
}

object ConditionOptions {
  @scala.inline
  def apply(
    callback: js.Function = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null
  ): ConditionOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionOptions]
  }
}

