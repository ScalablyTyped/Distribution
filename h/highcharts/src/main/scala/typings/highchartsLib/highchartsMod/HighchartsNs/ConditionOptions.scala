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

