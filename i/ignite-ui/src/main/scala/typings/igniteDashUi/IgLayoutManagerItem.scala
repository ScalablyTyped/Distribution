package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManagerItem
  extends /**
	 * Option for IgLayoutManagerItem
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Column index of the item in the grid
  	 *
  	 */
  var colIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * ColSpan of the item
  	 *
  	 */
  var colSpan: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets individual item height, either in px or percentage
  	 *                         string The default height can be set in pixels (px), %, em and other units.
  	 *
  	 */
  var height: js.UndefOr[String] = js.undefined
  /**
  	 * Row index of the item in the grid
  	 *
  	 */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * RowSpan of the item
  	 *
  	 */
  var rowSpan: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets individual item width, either in px or percentage
  	 *                         string The default width can be set in pixels (px), %, em and other units.
  	 *
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object IgLayoutManagerItem {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgLayoutManagerItem
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    colIndex: Int | Double = null,
    colSpan: Int | Double = null,
    height: String = null,
    rowIndex: Int | Double = null,
    rowSpan: Int | Double = null,
    width: Int | Double = null
  ): IgLayoutManagerItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLayoutManagerItem]
  }
}

