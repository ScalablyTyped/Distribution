package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgTreeGridColumnMoving
  extends /**
	 * Option for igTreeGridColumnMoving
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies if header cells should include an additional button that opens a moving helper dropdown.
  	 *
  	 */
  var addMovingDropdown: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event which is fired when a drag operation is canceled
  	 */
  var columnDragCanceled: js.UndefOr[ColumnDragCanceledEvent] = js.undefined
  /**
  	 * Event which is fired when a drag operation ends on a column header
  	 */
  var columnDragEnd: js.UndefOr[ColumnDragEndEvent] = js.undefined
  /**
  	 * Event which is fired when a drag operation begins on a column header
  	 */
  var columnDragStart: js.UndefOr[ColumnDragStartEvent] = js.undefined
  /**
  	 * Event which is fired when a column moving operation completes
  	 */
  var columnMoved: js.UndefOr[ColumnMovedEvent] = js.undefined
  /**
  	 * Event which is fired when a column moving operation is initiated
  	 */
  var columnMoving: js.UndefOr[ColumnMovingEvent] = js.undefined
  /**
  	 * Controls containment behavior of column moving dialog.
  	 *
  	 *                 owner  The dialog will be draggable only in the grid area
  	 *                 window  The dialog will be draggable in the whole window area
  	 */
  var columnMovingDialogContainment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of column settings that specifies moving options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnMovingColumnSetting]] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the opacity of the drag markup, while a column header is being dragged.
  	 * The value must be between 0 and 1. When GroupBy is enabled, the corresponding option in the GroupBy configuration
  	 * will be used with priority over this one.
  	 *
  	 */
  var dragHelperOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveFirstText](ui.iggridcolumnmoving#options:locale.dropDownMoveFirstText).
  	 */
  var dropDownMoveFirstText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveLastText](ui.iggridcolumnmoving#options:locale.dropDownMoveLastText).
  	 */
  var dropDownMoveLastText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move left dropdown button. Use option [locale.dropDownMoveLeftText](ui.iggridcolumnmoving#options:locale.dropDownMoveLeftText).
  	 */
  var dropDownMoveLeftText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move right dropdown button. Use option [locale.dropDownMoveRightText](ui.iggridcolumnmoving#options:locale.dropDownMoveRightText).
  	 */
  var dropDownMoveRightText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the feature chooser submenu button. Use option [locale.featureChooserSubmenuText](ui.iggridcolumnmoving#options:locale.featureChooserSubmenuText).
  	 */
  var featureChooserSubmenuText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies whether the contents of the column being dragged will get hidden. The option is only
  	 * relevant in immediate moving mode.
  	 *
  	 */
  var hideHeaderContentsDuringDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[IgGridColumnMovingLocale] = js.undefined
  /**
  	 * Specify the drag-and-drop mode for the feature
  	 *
  	 *
  	 * Valid values:
  	 * "immediate" Column headers will rearange as you drag with a space opening under the cursor for the header to be dropped on
  	 * "deferred" A clone of the header dragged will be created and indicators will be shown between columns to help navigate the drop.
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specify the way columns will be rearranged
  	 *
  	 *
  	 * Valid values:
  	 * "dom" Columns will be rearranged through dom manipulation
  	 * "render" Columns will not be rearranged but the grid will be rendered again with the new column order. Please note this option is incompatible with immediate move mode.
  	 */
  var moveType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the length (in pixels) between the dragged column and the column edges below which the move operation is accepted
  	 *
  	 */
  var movingAcceptanceTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies time in milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var movingDialogAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each move up button in the column moving dialog. Use option [locale.movingDialogCaptionButtonAsc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonAsc).
  	 */
  var movingDialogCaptionButtonAsc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each move down button in the column moving dialog. Use option [locale.movingDialogCaptionButtonDesc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonDesc).
  	 */
  var movingDialogCaptionButtonDesc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the column moving dialog. Use option [locale.movingDialogCaptionText](ui.iggridcolumnmoving#options:locale.movingDialogCaptionText).
  	 */
  var movingDialogCaptionText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after the moving dialog has been closed.
  	 */
  var movingDialogClosed: js.UndefOr[MovingDialogClosedEvent] = js.undefined
  /**
  	 * Event fired before the moving dialog is closed.
  	 */
  var movingDialogClosing: js.UndefOr[MovingDialogClosingEvent] = js.undefined
  /**
  	 * Event fired after the contents of the model dialog are rendered.
  	 */
  var movingDialogContentsRendered: js.UndefOr[MovingDialogContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the model dialog are rendered.
  	 */
  var movingDialogContentsRendering: js.UndefOr[MovingDialogContentsRenderingEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the feature chooser entry. Use option [locale.movingDialogDisplayText](ui.iggridcolumnmoving#options:locale.movingDialogDisplayText).
  	 */
  var movingDialogDisplayText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired when column moving is completed through dragging it in the moving dialog
  	 */
  var movingDialogDragColumnMoved: js.UndefOr[MovingDialogDragColumnMovedEvent] = js.undefined
  /**
  	 * Event fired when column moving is initiated through dragging it in the moving dialog
  	 */
  var movingDialogDragColumnMoving: js.UndefOr[MovingDialogDragColumnMovingEvent] = js.undefined
  /**
  	 * Event fired every time the moving dialog changes its position.
  	 */
  var movingDialogDragged: js.UndefOr[MovingDialogDraggedEvent] = js.undefined
  /**
  	 * Specifies markup for drop tooltip in column moving dialog
  	 *
  	 */
  var movingDialogDropTooltipMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text for drop tooltip in column moving dialog. Use option [locale.movingDialogDropTooltipText](ui.iggridcolumnmoving#options:locale.movingDialogDropTooltipText).
  	 */
  var movingDialogDropTooltipText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies height of column moving dialog
  	 *
  	 */
  var movingDialogHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired when move down button is pressed in the moving dialog
  	 */
  var movingDialogMoveDownButtonPressed: js.UndefOr[MovingDialogMoveDownButtonPressedEvent] = js.undefined
  /**
  	 * Event fired when move up button is pressed in the moving dialog
  	 */
  var movingDialogMoveUpButtonPressed: js.UndefOr[MovingDialogMoveUpButtonPressedEvent] = js.undefined
  /**
  	 * Event fired after the column chooser is already opened.
  	 */
  var movingDialogOpened: js.UndefOr[MovingDialogOpenedEvent] = js.undefined
  /**
  	 * Event fired before the moving dialog is opened.
  	 */
  var movingDialogOpening: js.UndefOr[MovingDialogOpeningEvent] = js.undefined
  /**
  	 * Specifies width of column moving dialog
  	 *
  	 */
  var movingDialogWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies the length (in pixels) between the dragged column and the grid edges below which horizontal scrolling occurs
  	 *
  	 */
  var movingScrollTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the feature chooser submenu button. Use option [locale.movingToolTipMove](ui.iggridcolumnmoving#options:locale.movingToolTipMove).
  	 */
  var movingToolTipMove: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the length (in pixels) of each individual scroll operation
  	 *
  	 */
  var scrollDelta: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies a multiplier for the delay between subsequent scroll operations. The larger this number is, the slower scrolling will appear to be.
  	 *
  	 */
  var scrollSpeedMultiplier: js.UndefOr[scala.Double] = js.undefined
}

