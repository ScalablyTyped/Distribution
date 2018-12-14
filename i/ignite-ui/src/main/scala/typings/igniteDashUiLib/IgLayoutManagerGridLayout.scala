package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgLayoutManagerGridLayout
  extends /**
	 * Option for IgLayoutManagerGridLayout
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the duration of the animations in the layout manager"s grid layout
  	 *
  	 */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Number of columns in the grid
  	 *
  	 */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Accepts number, string with height in px, percents,                        or asterisk (*) which will distribute all the height between all the columns equally.
  	 *                         It can also accept an array, specifying height for each column. If more than one column
  	 *                         has an asterisk value, the remaining height will be equally distributed between these columns.
  	 *                     array The column height can be set as an array of heights.
  	 *
  	 */
  var columnHeight: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
  /**
  	 * Accepts number or string with width in px, percents                        or asterisk (*) which will distribute all the width between all the columns equally.
  	 *                         It can also accept an array, specifying width for each column. If more than one column
  	 *                         has an asterisk value, the remaining width will be equally distributed between these columns.
  	 *                     array The column width can be set as an array of widths.
  	 *
  	 */
  var columnWidth: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
  /**
  	 * Specifies the margin left css property for items
  	 *
  	 */
  var marginLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies the margin top css property for items
  	 *
  	 */
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies whether the previous set options should be overriden when setting options
  	 *
  	 */
  var overrideConfigOnSetOption: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specified whether the items should rearrange to fit in the container when it is resized.
  	 *                         Have effect only when fixed columnWidth option is set.
  	 *
  	 */
  var rearrangeItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Number of rows in the grid
  	 *
  	 */
  var rows: js.UndefOr[scala.Double] = js.undefined
}

