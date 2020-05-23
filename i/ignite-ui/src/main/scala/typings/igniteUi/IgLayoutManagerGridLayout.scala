package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManagerGridLayout
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the duration of the animations in the layout manager"s grid layout
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Number of columns in the grid
    *
    */
  var cols: js.UndefOr[Double] = js.undefined
  /**
    * Accepts number, string with height in px, percents,                        or asterisk (*) which will distribute all the height between all the columns equally.
    *                         It can also accept an array, specifying height for each column. If more than one column
    *                         has an asterisk value, the remaining height will be equally distributed between these columns.
    *                     array The column height can be set as an array of heights.
    *
    */
  var columnHeight: js.UndefOr[String | Double | js.Array[_]] = js.undefined
  /**
    * Accepts number or string with width in px, percents                        or asterisk (*) which will distribute all the width between all the columns equally.
    *                         It can also accept an array, specifying width for each column. If more than one column
    *                         has an asterisk value, the remaining width will be equally distributed between these columns.
    *                     array The column width can be set as an array of widths.
    *
    */
  var columnWidth: js.UndefOr[String | Double | js.Array[_]] = js.undefined
  /**
    * Specifies the margin left css property for items
    *
    */
  var marginLeft: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the margin top css property for items
    *
    */
  var marginTop: js.UndefOr[Double] = js.undefined
  /**
    * Specifies whether the previous set options should be overriden when setting options
    *
    */
  var overrideConfigOnSetOption: js.UndefOr[Boolean] = js.undefined
  /**
    * Specified whether the items should rearrange to fit in the container when it is resized.
    *                         Have effect only when fixed columnWidth option is set.
    *
    */
  var rearrangeItems: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of rows in the grid
    *
    */
  var rows: js.UndefOr[Double] = js.undefined
}

object IgLayoutManagerGridLayout {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationDuration: js.UndefOr[Double] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    columnHeight: String | Double | js.Array[_] = null,
    columnWidth: String | Double | js.Array[_] = null,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    overrideConfigOnSetOption: js.UndefOr[Boolean] = js.undefined,
    rearrangeItems: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined
  ): IgLayoutManagerGridLayout = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (columnHeight != null) __obj.updateDynamic("columnHeight")(columnHeight.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideConfigOnSetOption)) __obj.updateDynamic("overrideConfigOnSetOption")(overrideConfigOnSetOption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rearrangeItems)) __obj.updateDynamic("rearrangeItems")(rearrangeItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLayoutManagerGridLayout]
  }
}

