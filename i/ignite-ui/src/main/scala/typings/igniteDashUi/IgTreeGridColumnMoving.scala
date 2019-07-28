package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridColumnMoving
  extends /**
	 * Option for igTreeGridColumnMoving
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies if header cells should include an additional button that opens a moving helper dropdown.
  	 *
  	 */
  var addMovingDropdown: js.UndefOr[Boolean] = js.undefined
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
  var columnMovingDialogContainment: js.UndefOr[String] = js.undefined
  /**
  	 * A list of column settings that specifies moving options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnMovingColumnSetting]] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the opacity of the drag markup, while a column header is being dragged.
  	 * The value must be between 0 and 1. When GroupBy is enabled, the corresponding option in the GroupBy configuration
  	 * will be used with priority over this one.
  	 *
  	 */
  var dragHelperOpacity: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveFirstText](ui.iggridcolumnmoving#options:locale.dropDownMoveFirstText).
  	 */
  var dropDownMoveFirstText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveLastText](ui.iggridcolumnmoving#options:locale.dropDownMoveLastText).
  	 */
  var dropDownMoveLastText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move left dropdown button. Use option [locale.dropDownMoveLeftText](ui.iggridcolumnmoving#options:locale.dropDownMoveLeftText).
  	 */
  var dropDownMoveLeftText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the move right dropdown button. Use option [locale.dropDownMoveRightText](ui.iggridcolumnmoving#options:locale.dropDownMoveRightText).
  	 */
  var dropDownMoveRightText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the feature chooser submenu button. Use option [locale.featureChooserSubmenuText](ui.iggridcolumnmoving#options:locale.featureChooserSubmenuText).
  	 */
  var featureChooserSubmenuText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies whether the contents of the column being dragged will get hidden. The option is only
  	 * relevant in immediate moving mode.
  	 *
  	 */
  var hideHeaderContentsDuringDrag: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[IgGridColumnMovingLocale] = js.undefined
  /**
  	 * Specify the drag-and-drop mode for the feature
  	 *
  	 *
  	 * Valid values:
  	 * "immediate" Column headers will rearange as you drag with a space opening under the cursor for the header to be dropped on
  	 * "deferred" A clone of the header dragged will be created and indicators will be shown between columns to help navigate the drop.
  	 */
  var mode: js.UndefOr[String] = js.undefined
  /**
  	 * Specify the way columns will be rearranged
  	 *
  	 *
  	 * Valid values:
  	 * "dom" Columns will be rearranged through dom manipulation
  	 * "render" Columns will not be rearranged but the grid will be rendered again with the new column order. Please note this option is incompatible with immediate move mode.
  	 */
  var moveType: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the length (in pixels) between the dragged column and the column edges below which the move operation is accepted
  	 *
  	 */
  var movingAcceptanceTolerance: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies time in milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var movingDialogAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each move up button in the column moving dialog. Use option [locale.movingDialogCaptionButtonAsc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonAsc).
  	 */
  var movingDialogCaptionButtonAsc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each move down button in the column moving dialog. Use option [locale.movingDialogCaptionButtonDesc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonDesc).
  	 */
  var movingDialogCaptionButtonDesc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the column moving dialog. Use option [locale.movingDialogCaptionText](ui.iggridcolumnmoving#options:locale.movingDialogCaptionText).
  	 */
  var movingDialogCaptionText: js.UndefOr[String] = js.undefined
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
  var movingDialogDisplayText: js.UndefOr[String] = js.undefined
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
  var movingDialogDropTooltipMarkup: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text for drop tooltip in column moving dialog. Use option [locale.movingDialogDropTooltipText](ui.iggridcolumnmoving#options:locale.movingDialogDropTooltipText).
  	 */
  var movingDialogDropTooltipText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies height of column moving dialog
  	 *
  	 */
  var movingDialogHeight: js.UndefOr[Double] = js.undefined
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
  var movingDialogWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies the length (in pixels) between the dragged column and the grid edges below which horizontal scrolling occurs
  	 *
  	 */
  var movingScrollTolerance: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the feature chooser submenu button. Use option [locale.movingToolTipMove](ui.iggridcolumnmoving#options:locale.movingToolTipMove).
  	 */
  var movingToolTipMove: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the length (in pixels) of each individual scroll operation
  	 *
  	 */
  var scrollDelta: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies a multiplier for the delay between subsequent scroll operations. The larger this number is, the slower scrolling will appear to be.
  	 *
  	 */
  var scrollSpeedMultiplier: js.UndefOr[Double] = js.undefined
}

object IgTreeGridColumnMoving {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridColumnMoving
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    addMovingDropdown: js.UndefOr[Boolean] = js.undefined,
    columnDragCanceled: ColumnDragCanceledEvent = null,
    columnDragEnd: ColumnDragEndEvent = null,
    columnDragStart: ColumnDragStartEvent = null,
    columnMoved: ColumnMovedEvent = null,
    columnMoving: ColumnMovingEvent = null,
    columnMovingDialogContainment: String = null,
    columnSettings: js.Array[IgGridColumnMovingColumnSetting] = null,
    dialogWidget: String = null,
    dragHelperOpacity: Int | Double = null,
    dropDownMoveFirstText: String = null,
    dropDownMoveLastText: String = null,
    dropDownMoveLeftText: String = null,
    dropDownMoveRightText: String = null,
    featureChooserSubmenuText: String = null,
    hideHeaderContentsDuringDrag: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    locale: IgGridColumnMovingLocale = null,
    mode: String = null,
    moveType: String = null,
    movingAcceptanceTolerance: Int | Double = null,
    movingDialogAnimationDuration: Int | Double = null,
    movingDialogCaptionButtonAsc: String = null,
    movingDialogCaptionButtonDesc: String = null,
    movingDialogCaptionText: String = null,
    movingDialogClosed: MovingDialogClosedEvent = null,
    movingDialogClosing: MovingDialogClosingEvent = null,
    movingDialogContentsRendered: MovingDialogContentsRenderedEvent = null,
    movingDialogContentsRendering: MovingDialogContentsRenderingEvent = null,
    movingDialogDisplayText: String = null,
    movingDialogDragColumnMoved: MovingDialogDragColumnMovedEvent = null,
    movingDialogDragColumnMoving: MovingDialogDragColumnMovingEvent = null,
    movingDialogDragged: MovingDialogDraggedEvent = null,
    movingDialogDropTooltipMarkup: String = null,
    movingDialogDropTooltipText: String = null,
    movingDialogHeight: Int | Double = null,
    movingDialogMoveDownButtonPressed: MovingDialogMoveDownButtonPressedEvent = null,
    movingDialogMoveUpButtonPressed: MovingDialogMoveUpButtonPressedEvent = null,
    movingDialogOpened: MovingDialogOpenedEvent = null,
    movingDialogOpening: MovingDialogOpeningEvent = null,
    movingDialogWidth: Int | Double = null,
    movingScrollTolerance: Int | Double = null,
    movingToolTipMove: String = null,
    scrollDelta: Int | Double = null,
    scrollSpeedMultiplier: Int | Double = null
  ): IgTreeGridColumnMoving = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addMovingDropdown)) __obj.updateDynamic("addMovingDropdown")(addMovingDropdown)
    if (columnDragCanceled != null) __obj.updateDynamic("columnDragCanceled")(columnDragCanceled)
    if (columnDragEnd != null) __obj.updateDynamic("columnDragEnd")(columnDragEnd)
    if (columnDragStart != null) __obj.updateDynamic("columnDragStart")(columnDragStart)
    if (columnMoved != null) __obj.updateDynamic("columnMoved")(columnMoved)
    if (columnMoving != null) __obj.updateDynamic("columnMoving")(columnMoving)
    if (columnMovingDialogContainment != null) __obj.updateDynamic("columnMovingDialogContainment")(columnMovingDialogContainment)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget)
    if (dragHelperOpacity != null) __obj.updateDynamic("dragHelperOpacity")(dragHelperOpacity.asInstanceOf[js.Any])
    if (dropDownMoveFirstText != null) __obj.updateDynamic("dropDownMoveFirstText")(dropDownMoveFirstText)
    if (dropDownMoveLastText != null) __obj.updateDynamic("dropDownMoveLastText")(dropDownMoveLastText)
    if (dropDownMoveLeftText != null) __obj.updateDynamic("dropDownMoveLeftText")(dropDownMoveLeftText)
    if (dropDownMoveRightText != null) __obj.updateDynamic("dropDownMoveRightText")(dropDownMoveRightText)
    if (featureChooserSubmenuText != null) __obj.updateDynamic("featureChooserSubmenuText")(featureChooserSubmenuText)
    if (!js.isUndefined(hideHeaderContentsDuringDrag)) __obj.updateDynamic("hideHeaderContentsDuringDrag")(hideHeaderContentsDuringDrag)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (moveType != null) __obj.updateDynamic("moveType")(moveType)
    if (movingAcceptanceTolerance != null) __obj.updateDynamic("movingAcceptanceTolerance")(movingAcceptanceTolerance.asInstanceOf[js.Any])
    if (movingDialogAnimationDuration != null) __obj.updateDynamic("movingDialogAnimationDuration")(movingDialogAnimationDuration.asInstanceOf[js.Any])
    if (movingDialogCaptionButtonAsc != null) __obj.updateDynamic("movingDialogCaptionButtonAsc")(movingDialogCaptionButtonAsc)
    if (movingDialogCaptionButtonDesc != null) __obj.updateDynamic("movingDialogCaptionButtonDesc")(movingDialogCaptionButtonDesc)
    if (movingDialogCaptionText != null) __obj.updateDynamic("movingDialogCaptionText")(movingDialogCaptionText)
    if (movingDialogClosed != null) __obj.updateDynamic("movingDialogClosed")(movingDialogClosed)
    if (movingDialogClosing != null) __obj.updateDynamic("movingDialogClosing")(movingDialogClosing)
    if (movingDialogContentsRendered != null) __obj.updateDynamic("movingDialogContentsRendered")(movingDialogContentsRendered)
    if (movingDialogContentsRendering != null) __obj.updateDynamic("movingDialogContentsRendering")(movingDialogContentsRendering)
    if (movingDialogDisplayText != null) __obj.updateDynamic("movingDialogDisplayText")(movingDialogDisplayText)
    if (movingDialogDragColumnMoved != null) __obj.updateDynamic("movingDialogDragColumnMoved")(movingDialogDragColumnMoved)
    if (movingDialogDragColumnMoving != null) __obj.updateDynamic("movingDialogDragColumnMoving")(movingDialogDragColumnMoving)
    if (movingDialogDragged != null) __obj.updateDynamic("movingDialogDragged")(movingDialogDragged)
    if (movingDialogDropTooltipMarkup != null) __obj.updateDynamic("movingDialogDropTooltipMarkup")(movingDialogDropTooltipMarkup)
    if (movingDialogDropTooltipText != null) __obj.updateDynamic("movingDialogDropTooltipText")(movingDialogDropTooltipText)
    if (movingDialogHeight != null) __obj.updateDynamic("movingDialogHeight")(movingDialogHeight.asInstanceOf[js.Any])
    if (movingDialogMoveDownButtonPressed != null) __obj.updateDynamic("movingDialogMoveDownButtonPressed")(movingDialogMoveDownButtonPressed)
    if (movingDialogMoveUpButtonPressed != null) __obj.updateDynamic("movingDialogMoveUpButtonPressed")(movingDialogMoveUpButtonPressed)
    if (movingDialogOpened != null) __obj.updateDynamic("movingDialogOpened")(movingDialogOpened)
    if (movingDialogOpening != null) __obj.updateDynamic("movingDialogOpening")(movingDialogOpening)
    if (movingDialogWidth != null) __obj.updateDynamic("movingDialogWidth")(movingDialogWidth.asInstanceOf[js.Any])
    if (movingScrollTolerance != null) __obj.updateDynamic("movingScrollTolerance")(movingScrollTolerance.asInstanceOf[js.Any])
    if (movingToolTipMove != null) __obj.updateDynamic("movingToolTipMove")(movingToolTipMove)
    if (scrollDelta != null) __obj.updateDynamic("scrollDelta")(scrollDelta.asInstanceOf[js.Any])
    if (scrollSpeedMultiplier != null) __obj.updateDynamic("scrollSpeedMultiplier")(scrollSpeedMultiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridColumnMoving]
  }
}

