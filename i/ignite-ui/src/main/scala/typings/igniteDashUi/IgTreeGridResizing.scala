package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridResizing
  extends /**
	 * Option for igTreeGridResizing
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Resize the column to the size of the longest currently visible cell value.
  	 *
  	 */
  var allowDoubleClickToResize: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after the resizing has been executed and results are rendered
  	 */
  var columnResized: js.UndefOr[ColumnResizedEvent] = js.undefined
  /**
  	 * Event fired before a resizing operation is executed.
  	 */
  var columnResizing: js.UndefOr[ColumnResizingEvent] = js.undefined
  /**
  	 * Event fired(only when columnFixing is enabled) when trying to resize column in fixed area so total width of unfixed area to be less than minimalVisibleAreaWidth(option defined in columnFixing)
  	 */
  var columnResizingRefused: js.UndefOr[ColumnResizingRefusedEvent] = js.undefined
  /**
  	 * A list of column settings that specifies resizing options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridResizingColumnSetting]] = js.undefined
  /**
  	 * Specifies whether the resizing should be deferred until the user finishes resizing or applied immediately.
  	 *
  	 */
  var deferredResizing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The width in pixels of the resizing handle which is position at the right side of each resizeable column header.
  	 *
  	 */
  var handleThreshold: js.UndefOr[Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object IgTreeGridResizing {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridResizing
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowDoubleClickToResize: js.UndefOr[Boolean] = js.undefined,
    columnResized: ColumnResizedEvent = null,
    columnResizing: ColumnResizingEvent = null,
    columnResizingRefused: ColumnResizingRefusedEvent = null,
    columnSettings: js.Array[IgGridResizingColumnSetting] = null,
    deferredResizing: js.UndefOr[Boolean] = js.undefined,
    handleThreshold: Int | Double = null,
    inherit: js.UndefOr[Boolean] = js.undefined
  ): IgTreeGridResizing = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowDoubleClickToResize)) __obj.updateDynamic("allowDoubleClickToResize")(allowDoubleClickToResize)
    if (columnResized != null) __obj.updateDynamic("columnResized")(columnResized)
    if (columnResizing != null) __obj.updateDynamic("columnResizing")(columnResizing)
    if (columnResizingRefused != null) __obj.updateDynamic("columnResizingRefused")(columnResizingRefused)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (!js.isUndefined(deferredResizing)) __obj.updateDynamic("deferredResizing")(deferredResizing)
    if (handleThreshold != null) __obj.updateDynamic("handleThreshold")(handleThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    __obj.asInstanceOf[IgTreeGridResizing]
  }
}

