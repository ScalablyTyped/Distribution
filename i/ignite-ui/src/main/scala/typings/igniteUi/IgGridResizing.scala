package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResizing
  extends /**
	 * Option for igGridResizing
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
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
}

object IgGridResizing {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridResizing
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowDoubleClickToResize: js.UndefOr[Boolean] = js.undefined,
    columnResized: (/* event */ Event_, /* ui */ ColumnResizedEventUIParam) => Unit = null,
    columnResizing: (/* event */ Event_, /* ui */ ColumnResizingEventUIParam) => Unit = null,
    columnResizingRefused: (/* event */ Event_, /* ui */ ColumnResizingRefusedEventUIParam) => Unit = null,
    columnSettings: js.Array[IgGridResizingColumnSetting] = null,
    deferredResizing: js.UndefOr[Boolean] = js.undefined,
    handleThreshold: Int | Double = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: js.Any = null,
    regional: String | js.Object = null
  ): IgGridResizing = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowDoubleClickToResize)) __obj.updateDynamic("allowDoubleClickToResize")(allowDoubleClickToResize.asInstanceOf[js.Any])
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction2(columnResized))
    if (columnResizing != null) __obj.updateDynamic("columnResizing")(js.Any.fromFunction2(columnResizing))
    if (columnResizingRefused != null) __obj.updateDynamic("columnResizingRefused")(js.Any.fromFunction2(columnResizingRefused))
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(deferredResizing)) __obj.updateDynamic("deferredResizing")(deferredResizing.asInstanceOf[js.Any])
    if (handleThreshold != null) __obj.updateDynamic("handleThreshold")(handleThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridResizing]
  }
}

