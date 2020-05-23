package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManagerItem
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    colIndex: js.UndefOr[Double] = js.undefined,
    colSpan: js.UndefOr[Double] = js.undefined,
    height: String = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rowSpan: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IgLayoutManagerItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(colIndex)) __obj.updateDynamic("colIndex")(colIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLayoutManagerItem]
  }
}

