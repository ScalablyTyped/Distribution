package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridResizing
  extends /**
	 * Option for igGridResizing
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Resize the column to the size of the longest currently visible cell value.
  	 *
  	 */
  var allowDoubleClickToResize: js.UndefOr[scala.Boolean] = js.undefined
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
  var deferredResizing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The width in pixels of the resizing handle which is position at the right side of each resizeable column header.
  	 *
  	 */
  var handleThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

