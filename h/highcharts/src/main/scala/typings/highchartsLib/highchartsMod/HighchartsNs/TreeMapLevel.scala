package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set options on specific levels. Takes precedence over series options, but not point options.
  */
trait TreeMapLevel extends js.Object {
  /**
    * Can set borderColor on all points which lies on the same level.
    * @since 4.1.0
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * et the dash style of the border of all the point which lies on the level.
    * @since 4.1.0
    */
  var borderDashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Can set the borderWidth on all points which lies on the same level.
    * @since 4.1.0
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Can set a color on all points which lies on the same level.
    * @since 4.1.0
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * Can set the options of dataLabels on each point which lies on the level.
    * @default undefined
    * @since 4.1.0
    */
  var dataLabels: js.UndefOr[DataLabels] = js.undefined
  /**
    * Can set the layoutAlgorithm option on a specific level.
    * @since 4.1.0
    */
  var layoutAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Can set the layoutStartingDirection option on a specific level.
    * @since 4.1.0
    */
  var layoutStartingDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Decides which level takes effect from the options set in the levels object.
    * @since 4.1.0
    */
  var level: js.UndefOr[scala.Double] = js.undefined
}

object TreeMapLevel {
  @scala.inline
  def apply(
    borderColor: java.lang.String | Gradient = null,
    borderDashStyle: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String | Gradient = null,
    dataLabels: DataLabels = null,
    layoutAlgorithm: java.lang.String = null,
    layoutStartingDirection: java.lang.String = null,
    level: scala.Int | scala.Double = null
  ): TreeMapLevel = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDashStyle != null) __obj.updateDynamic("borderDashStyle")(borderDashStyle)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm)
    if (layoutStartingDirection != null) __obj.updateDynamic("layoutStartingDirection")(layoutStartingDirection)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapLevel]
  }
}

