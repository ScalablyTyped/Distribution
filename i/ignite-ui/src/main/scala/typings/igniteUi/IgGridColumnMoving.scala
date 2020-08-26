package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnMoving
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies if header cells should include an additional button that opens a moving helper dropdown.
    *
    */
  var addMovingDropdown: js.UndefOr[Boolean] = js.native
  /**
    * Event which is fired when a drag operation is canceled
    */
  var columnDragCanceled: js.UndefOr[ColumnDragCanceledEvent] = js.native
  /**
    * Event which is fired when a drag operation ends on a column header
    */
  var columnDragEnd: js.UndefOr[ColumnDragEndEvent] = js.native
  /**
    * Event which is fired when a drag operation begins on a column header
    */
  var columnDragStart: js.UndefOr[ColumnDragStartEvent] = js.native
  /**
    * Event which is fired when a column moving operation completes
    */
  var columnMoved: js.UndefOr[ColumnMovedEvent] = js.native
  /**
    * Event which is fired when a column moving operation is initiated
    */
  var columnMoving: js.UndefOr[ColumnMovingEvent] = js.native
  /**
    * Controls containment behavior of column moving dialog.
    *
    *                 owner  The dialog will be draggable only in the grid area
    *                 window  The dialog will be draggable in the whole window area
    */
  var columnMovingDialogContainment: js.UndefOr[String] = js.native
  /**
    * A list of column settings that specifies moving options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnMovingColumnSetting]] = js.native
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
    * Specifies the opacity of the drag markup, while a column header is being dragged.
    * The value must be between 0 and 1. When GroupBy is enabled, the corresponding option in the GroupBy configuration
    * will be used with priority over this one.
    *
    */
  var dragHelperOpacity: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveFirstText](ui.iggridcolumnmoving#options:locale.dropDownMoveFirstText).
    */
  var dropDownMoveFirstText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveLastText](ui.iggridcolumnmoving#options:locale.dropDownMoveLastText).
    */
  var dropDownMoveLastText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move left dropdown button. Use option [locale.dropDownMoveLeftText](ui.iggridcolumnmoving#options:locale.dropDownMoveLeftText).
    */
  var dropDownMoveLeftText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move right dropdown button. Use option [locale.dropDownMoveRightText](ui.iggridcolumnmoving#options:locale.dropDownMoveRightText).
    */
  var dropDownMoveRightText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the feature chooser submenu button. Use option [locale.featureChooserSubmenuText](ui.iggridcolumnmoving#options:locale.featureChooserSubmenuText).
    */
  var featureChooserSubmenuText: js.UndefOr[String] = js.native
  /**
    * Specifies whether the contents of the column being dragged will get hidden. The option is only
    * relevant in immediate moving mode.
    *
    */
  var hideHeaderContentsDuringDrag: js.UndefOr[Boolean] = js.native
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridColumnMovingLocale] = js.native
  /**
    * Specify the drag-and-drop mode for the feature
    *
    *
    * Valid values:
    * "immediate" Column headers will rearange as you drag with a space opening under the cursor for the header to be dropped on
    * "deferred" A clone of the header dragged will be created and indicators will be shown between columns to help navigate the drop.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Specify the way columns will be rearranged
    *
    *
    * Valid values:
    * "dom" Columns will be rearranged through dom manipulation
    * "render" Columns will not be rearranged but the grid will be rendered again with the new column order. Please note this option is incompatible with immediate move mode.
    */
  var moveType: js.UndefOr[String] = js.native
  /**
    * Specifies the length (in pixels) between the dragged column and the column edges below which the move operation is accepted
    *
    */
  var movingAcceptanceTolerance: js.UndefOr[Double] = js.native
  /**
    * Specifies time in milliseconds for animation duration to show/hide modal dialog
    *
    */
  var movingDialogAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each move up button in the column moving dialog. Use option [locale.movingDialogCaptionButtonAsc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonAsc).
    */
  var movingDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each move down button in the column moving dialog. Use option [locale.movingDialogCaptionButtonDesc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonDesc).
    */
  var movingDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the column moving dialog. Use option [locale.movingDialogCaptionText](ui.iggridcolumnmoving#options:locale.movingDialogCaptionText).
    */
  var movingDialogCaptionText: js.UndefOr[String] = js.native
  /**
    * Event fired after the moving dialog has been closed.
    */
  var movingDialogClosed: js.UndefOr[MovingDialogClosedEvent] = js.native
  /**
    * Event fired before the moving dialog is closed.
    */
  var movingDialogClosing: js.UndefOr[MovingDialogClosingEvent] = js.native
  /**
    * Event fired after the contents of the model dialog are rendered.
    */
  var movingDialogContentsRendered: js.UndefOr[MovingDialogContentsRenderedEvent] = js.native
  /**
    * Event fired before the contents of the model dialog are rendered.
    */
  var movingDialogContentsRendering: js.UndefOr[MovingDialogContentsRenderingEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the feature chooser entry. Use option [locale.movingDialogDisplayText](ui.iggridcolumnmoving#options:locale.movingDialogDisplayText).
    */
  var movingDialogDisplayText: js.UndefOr[String] = js.native
  /**
    * Event fired when column moving is completed through dragging it in the moving dialog
    */
  var movingDialogDragColumnMoved: js.UndefOr[MovingDialogDragColumnMovedEvent] = js.native
  /**
    * Event fired when column moving is initiated through dragging it in the moving dialog
    */
  var movingDialogDragColumnMoving: js.UndefOr[MovingDialogDragColumnMovingEvent] = js.native
  /**
    * Event fired every time the moving dialog changes its position.
    */
  var movingDialogDragged: js.UndefOr[MovingDialogDraggedEvent] = js.native
  /**
    * Specifies markup for drop tooltip in column moving dialog
    *
    */
  var movingDialogDropTooltipMarkup: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text for drop tooltip in column moving dialog. Use option [locale.movingDialogDropTooltipText](ui.iggridcolumnmoving#options:locale.movingDialogDropTooltipText).
    */
  var movingDialogDropTooltipText: js.UndefOr[String] = js.native
  /**
    * Specifies height of column moving dialog
    *
    */
  var movingDialogHeight: js.UndefOr[Double] = js.native
  /**
    * Event fired when move down button is pressed in the moving dialog
    */
  var movingDialogMoveDownButtonPressed: js.UndefOr[MovingDialogMoveDownButtonPressedEvent] = js.native
  /**
    * Event fired when move up button is pressed in the moving dialog
    */
  var movingDialogMoveUpButtonPressed: js.UndefOr[MovingDialogMoveUpButtonPressedEvent] = js.native
  /**
    * Event fired after the column chooser is already opened.
    */
  var movingDialogOpened: js.UndefOr[MovingDialogOpenedEvent] = js.native
  /**
    * Event fired before the moving dialog is opened.
    */
  var movingDialogOpening: js.UndefOr[MovingDialogOpeningEvent] = js.native
  /**
    * Specifies width of column moving dialog
    *
    */
  var movingDialogWidth: js.UndefOr[Double] = js.native
  /**
    * Specifies the length (in pixels) between the dragged column and the grid edges below which horizontal scrolling occurs
    *
    */
  var movingScrollTolerance: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the feature chooser submenu button. Use option [locale.movingToolTipMove](ui.iggridcolumnmoving#options:locale.movingToolTipMove).
    */
  var movingToolTipMove: js.UndefOr[String] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Specifies the length (in pixels) of each individual scroll operation
    *
    */
  var scrollDelta: js.UndefOr[Double] = js.native
  /**
    * Specifies a multiplier for the delay between subsequent scroll operations. The larger this number is, the slower scrolling will appear to be.
    *
    */
  var scrollSpeedMultiplier: js.UndefOr[Double] = js.native
}

object IgGridColumnMoving {
  @scala.inline
  def apply(): IgGridColumnMoving = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnMoving]
  }
  @scala.inline
  implicit class IgGridColumnMovingOps[Self <: IgGridColumnMoving] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddMovingDropdown(value: Boolean): Self = this.set("addMovingDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddMovingDropdown: Self = this.set("addMovingDropdown", js.undefined)
    @scala.inline
    def setColumnDragCanceled(value: (/* event */ Event, /* ui */ ColumnDragCanceledEventUIParam) => Unit): Self = this.set("columnDragCanceled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnDragCanceled: Self = this.set("columnDragCanceled", js.undefined)
    @scala.inline
    def setColumnDragEnd(value: (/* event */ Event, /* ui */ ColumnDragEndEventUIParam) => Unit): Self = this.set("columnDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnDragEnd: Self = this.set("columnDragEnd", js.undefined)
    @scala.inline
    def setColumnDragStart(value: (/* event */ Event, /* ui */ ColumnDragStartEventUIParam) => Unit): Self = this.set("columnDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnDragStart: Self = this.set("columnDragStart", js.undefined)
    @scala.inline
    def setColumnMoved(value: (/* event */ Event, /* ui */ ColumnMovedEventUIParam) => Unit): Self = this.set("columnMoved", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnMoved: Self = this.set("columnMoved", js.undefined)
    @scala.inline
    def setColumnMoving(value: (/* event */ Event, /* ui */ ColumnMovingEventUIParam) => Unit): Self = this.set("columnMoving", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnMoving: Self = this.set("columnMoving", js.undefined)
    @scala.inline
    def setColumnMovingDialogContainment(value: String): Self = this.set("columnMovingDialogContainment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMovingDialogContainment: Self = this.set("columnMovingDialogContainment", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridColumnMovingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridColumnMovingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setDialogWidget(value: String): Self = this.set("dialogWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogWidget: Self = this.set("dialogWidget", js.undefined)
    @scala.inline
    def setDragHelperOpacity(value: Double): Self = this.set("dragHelperOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHelperOpacity: Self = this.set("dragHelperOpacity", js.undefined)
    @scala.inline
    def setDropDownMoveFirstText(value: String): Self = this.set("dropDownMoveFirstText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownMoveFirstText: Self = this.set("dropDownMoveFirstText", js.undefined)
    @scala.inline
    def setDropDownMoveLastText(value: String): Self = this.set("dropDownMoveLastText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownMoveLastText: Self = this.set("dropDownMoveLastText", js.undefined)
    @scala.inline
    def setDropDownMoveLeftText(value: String): Self = this.set("dropDownMoveLeftText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownMoveLeftText: Self = this.set("dropDownMoveLeftText", js.undefined)
    @scala.inline
    def setDropDownMoveRightText(value: String): Self = this.set("dropDownMoveRightText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownMoveRightText: Self = this.set("dropDownMoveRightText", js.undefined)
    @scala.inline
    def setFeatureChooserSubmenuText(value: String): Self = this.set("featureChooserSubmenuText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserSubmenuText: Self = this.set("featureChooserSubmenuText", js.undefined)
    @scala.inline
    def setHideHeaderContentsDuringDrag(value: Boolean): Self = this.set("hideHeaderContentsDuringDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideHeaderContentsDuringDrag: Self = this.set("hideHeaderContentsDuringDrag", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgGridColumnMovingLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMoveType(value: String): Self = this.set("moveType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveType: Self = this.set("moveType", js.undefined)
    @scala.inline
    def setMovingAcceptanceTolerance(value: Double): Self = this.set("movingAcceptanceTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingAcceptanceTolerance: Self = this.set("movingAcceptanceTolerance", js.undefined)
    @scala.inline
    def setMovingDialogAnimationDuration(value: Double): Self = this.set("movingDialogAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogAnimationDuration: Self = this.set("movingDialogAnimationDuration", js.undefined)
    @scala.inline
    def setMovingDialogCaptionButtonAsc(value: String): Self = this.set("movingDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogCaptionButtonAsc: Self = this.set("movingDialogCaptionButtonAsc", js.undefined)
    @scala.inline
    def setMovingDialogCaptionButtonDesc(value: String): Self = this.set("movingDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogCaptionButtonDesc: Self = this.set("movingDialogCaptionButtonDesc", js.undefined)
    @scala.inline
    def setMovingDialogCaptionText(value: String): Self = this.set("movingDialogCaptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogCaptionText: Self = this.set("movingDialogCaptionText", js.undefined)
    @scala.inline
    def setMovingDialogClosed(value: (/* event */ Event, /* ui */ MovingDialogClosedEventUIParam) => Unit): Self = this.set("movingDialogClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogClosed: Self = this.set("movingDialogClosed", js.undefined)
    @scala.inline
    def setMovingDialogClosing(value: (/* event */ Event, /* ui */ MovingDialogClosingEventUIParam) => Unit): Self = this.set("movingDialogClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogClosing: Self = this.set("movingDialogClosing", js.undefined)
    @scala.inline
    def setMovingDialogContentsRendered(value: (/* event */ Event, /* ui */ MovingDialogContentsRenderedEventUIParam) => Unit): Self = this.set("movingDialogContentsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogContentsRendered: Self = this.set("movingDialogContentsRendered", js.undefined)
    @scala.inline
    def setMovingDialogContentsRendering(value: (/* event */ Event, /* ui */ MovingDialogContentsRenderingEventUIParam) => Unit): Self = this.set("movingDialogContentsRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogContentsRendering: Self = this.set("movingDialogContentsRendering", js.undefined)
    @scala.inline
    def setMovingDialogDisplayText(value: String): Self = this.set("movingDialogDisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogDisplayText: Self = this.set("movingDialogDisplayText", js.undefined)
    @scala.inline
    def setMovingDialogDragColumnMoved(value: (/* event */ Event, /* ui */ MovingDialogDragColumnMovedEventUIParam) => Unit): Self = this.set("movingDialogDragColumnMoved", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogDragColumnMoved: Self = this.set("movingDialogDragColumnMoved", js.undefined)
    @scala.inline
    def setMovingDialogDragColumnMoving(value: (/* event */ Event, /* ui */ MovingDialogDragColumnMovingEventUIParam) => Unit): Self = this.set("movingDialogDragColumnMoving", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogDragColumnMoving: Self = this.set("movingDialogDragColumnMoving", js.undefined)
    @scala.inline
    def setMovingDialogDragged(value: (/* event */ Event, /* ui */ MovingDialogDraggedEventUIParam) => Unit): Self = this.set("movingDialogDragged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogDragged: Self = this.set("movingDialogDragged", js.undefined)
    @scala.inline
    def setMovingDialogDropTooltipMarkup(value: String): Self = this.set("movingDialogDropTooltipMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogDropTooltipMarkup: Self = this.set("movingDialogDropTooltipMarkup", js.undefined)
    @scala.inline
    def setMovingDialogDropTooltipText(value: String): Self = this.set("movingDialogDropTooltipText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogDropTooltipText: Self = this.set("movingDialogDropTooltipText", js.undefined)
    @scala.inline
    def setMovingDialogHeight(value: Double): Self = this.set("movingDialogHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogHeight: Self = this.set("movingDialogHeight", js.undefined)
    @scala.inline
    def setMovingDialogMoveDownButtonPressed(value: (/* event */ Event, /* ui */ MovingDialogMoveDownButtonPressedEventUIParam) => Unit): Self = this.set("movingDialogMoveDownButtonPressed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogMoveDownButtonPressed: Self = this.set("movingDialogMoveDownButtonPressed", js.undefined)
    @scala.inline
    def setMovingDialogMoveUpButtonPressed(value: (/* event */ Event, /* ui */ MovingDialogMoveUpButtonPressedEventUIParam) => Unit): Self = this.set("movingDialogMoveUpButtonPressed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogMoveUpButtonPressed: Self = this.set("movingDialogMoveUpButtonPressed", js.undefined)
    @scala.inline
    def setMovingDialogOpened(value: (/* event */ Event, /* ui */ MovingDialogOpenedEventUIParam) => Unit): Self = this.set("movingDialogOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogOpened: Self = this.set("movingDialogOpened", js.undefined)
    @scala.inline
    def setMovingDialogOpening(value: (/* event */ Event, /* ui */ MovingDialogOpeningEventUIParam) => Unit): Self = this.set("movingDialogOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovingDialogOpening: Self = this.set("movingDialogOpening", js.undefined)
    @scala.inline
    def setMovingDialogWidth(value: Double): Self = this.set("movingDialogWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingDialogWidth: Self = this.set("movingDialogWidth", js.undefined)
    @scala.inline
    def setMovingScrollTolerance(value: Double): Self = this.set("movingScrollTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingScrollTolerance: Self = this.set("movingScrollTolerance", js.undefined)
    @scala.inline
    def setMovingToolTipMove(value: String): Self = this.set("movingToolTipMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingToolTipMove: Self = this.set("movingToolTipMove", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setScrollDelta(value: Double): Self = this.set("scrollDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDelta: Self = this.set("scrollDelta", js.undefined)
    @scala.inline
    def setScrollSpeedMultiplier(value: Double): Self = this.set("scrollSpeedMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeedMultiplier: Self = this.set("scrollSpeedMultiplier", js.undefined)
  }
  
}

