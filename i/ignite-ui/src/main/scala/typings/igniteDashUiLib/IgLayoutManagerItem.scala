package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManagerItem
  extends /**
	 * Option for IgLayoutManagerItem
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Column index of the item in the grid
  	 *
  	 */
  var colIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * ColSpan of the item
  	 *
  	 */
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets individual item height, either in px or percentage
  	 *                         string The default height can be set in pixels (px), %, em and other units.
  	 *
  	 */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Row index of the item in the grid
  	 *
  	 */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * RowSpan of the item
  	 *
  	 */
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets individual item width, either in px or percentage
  	 *                         string The default width can be set in pixels (px), %, em and other units.
  	 *
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IgLayoutManagerItem {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgLayoutManagerItem
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    colIndex: scala.Int | scala.Double = null,
    colSpan: scala.Int | scala.Double = null,
    height: java.lang.String = null,
    rowIndex: scala.Int | scala.Double = null,
    rowSpan: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): IgLayoutManagerItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLayoutManagerItem]
  }
}

