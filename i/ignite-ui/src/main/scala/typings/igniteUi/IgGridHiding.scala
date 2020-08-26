package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridHiding
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies time of milliseconds for animation duration to show/hide modal dialog
    *
    */
  var columnChooserAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Event fired when button Apply in column chooser is clicked
    */
  var columnChooserButtonApplyClick: js.UndefOr[ColumnChooserButtonApplyClickEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which apply changes in modal dialog. Use option [locale.columnChooserButtonApplyText](ui.iggridhiding#options:locale.columnChooserButtonApplyText).
    */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which cancel changes in modal dialog. Use option [locale.columnChooserButtonCancelText](ui.iggridhiding#options:locale.columnChooserButtonCancelText).
    */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.native
  /**
    * Event fired when button Reset in column chooser is clicked
    */
  var columnChooserButtonResetClick: js.UndefOr[ColumnChooserButtonResetClickEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The caption of the column chooser dialog. Use option [locale.columnChooserCaptionText](ui.iggridhiding#options:locale.columnChooserCaptionText).
    */
  var columnChooserCaptionText: js.UndefOr[String] = js.native
  /**
    * Event fired after the column chooser has been closed.
    */
  var columnChooserClosed: js.UndefOr[ColumnChooserClosedEvent] = js.native
  /**
    * Event fired before the column chooser is closed.
    */
  var columnChooserClosing: js.UndefOr[ColumnChooserClosingEvent] = js.native
  /**
    * Controls containment behavior.
    *
    * owner  The column chooser dialog will be draggable only in the grid area
    * window  The column chooser dialog will be draggable in the whole window area
    */
  var columnChooserContainment: js.UndefOr[String] = js.native
  /**
    * Event fired after the contents of the column chooser are rendered.
    */
  var columnChooserContentsRendered: js.UndefOr[ColumnChooserContentsRenderedEvent] = js.native
  /**
    * Event fired before the contents of the column chooser are rendered.
    */
  var columnChooserContentsRendering: js.UndefOr[ColumnChooserContentsRenderingEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog. Use option [locale.columnChooserDisplayText](ui.iggridhiding#options:locale.columnChooserDisplayText).
    */
  var columnChooserDisplayText: js.UndefOr[String] = js.native
  /**
    * The default column chooser height.
    *
    */
  var columnChooserHeight: js.UndefOr[String] = js.native
  /**
    * Specifies on click show/hide directly to be shown/hidden columns. If columnChooserHideOnClick is false then Apply and Cancel Buttons are shown on the bottom of modal dialog. Columns are Shown/Hidden after the Apply button is clicked
    *
    */
  var columnChooserHideOnClick: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the column chooser to hide column. Use option [locale.columnChooserHideText](ui.iggridhiding#options:locale.columnChooserHideText).
    */
  var columnChooserHideText: js.UndefOr[String] = js.native
  /**
    * Event fired every time the column chooser changes its position.
    */
  var columnChooserMoving: js.UndefOr[ColumnChooserMovingEvent] = js.native
  /**
    * Event fired after the column chooser is already opened.
    */
  var columnChooserOpened: js.UndefOr[ColumnChooserOpenedEvent] = js.native
  /**
    * Event fired before the column chooser is opened.
    */
  var columnChooserOpening: js.UndefOr[ColumnChooserOpeningEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text label for reset button. Use option [locale.columnChooserResetButtonLabel](ui.iggridhiding#options:locale.columnChooserResetButtonLabel).
    */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the column chooser to show column. Use option [locale.columnChooserShowText](ui.iggridhiding#options:locale.columnChooserShowText).
    */
  var columnChooserShowText: js.UndefOr[String] = js.native
  /**
    * The default column chooser width.
    *
    */
  var columnChooserWidth: js.UndefOr[String] = js.native
  /**
    * Event fired after the hiding has been executed and results are rendered.
    */
  var columnHidden: js.UndefOr[ColumnHiddenEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the drop down tools menu(Feature Chooser) to hide a column. Use option [locale.columnHideText](ui.iggridhiding#options:locale.columnHideText).
    */
  var columnHideText: js.UndefOr[String] = js.native
  /**
    * Event fired before a hiding operation is executed.
    */
  var columnHiding: js.UndefOr[ColumnHidingEvent] = js.native
  /**
    * Event fired when trying to hide all columns in fixed or unfixed area.
    */
  var columnHidingRefused: js.UndefOr[ColumnHidingRefusedEvent] = js.native
  /**
    * A list of column settings that specifies hiding options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridHidingColumnSetting]] = js.native
  /**
    * Event fired before a showing operation is executed.
    */
  var columnShowing: js.UndefOr[ColumnShowingEvent] = js.native
  /**
    * Event fired when trying to show column(s) in fixed area and total width of fixed are will be larger than whole grid width.
    */
  var columnShowingRefused: js.UndefOr[ColumnShowingRefusedEvent] = js.native
  /**
    * Event fired after the showing has been executed and results are rendered.
    */
  var columnShown: js.UndefOr[ColumnShownEvent] = js.native
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
    * The duration of the dropdown animation in milliseconds.
    *
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * The width in pixels of the hidden column indicator in the header.
    *
    */
  var hiddenColumnIndicatorHeaderWidth: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text displayed in the tooltip of the hidden column indicator. Use option [locale.hiddenColumnIndicatorTooltipText](ui.iggridhiding#options:locale.hiddenColumnIndicatorTooltipText).
    */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.native
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    *
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridHidingLocale] = js.native
  /**
    * Event fired before a hiding operation is executed.
    */
  var multiColumnHiding: js.UndefOr[MultiColumnHidingEvent] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
}

object IgGridHiding {
  @scala.inline
  def apply(): IgGridHiding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHiding]
  }
  @scala.inline
  implicit class IgGridHidingOps[Self <: IgGridHiding] (val x: Self) extends AnyVal {
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
    def setColumnChooserAnimationDuration(value: Double): Self = this.set("columnChooserAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserAnimationDuration: Self = this.set("columnChooserAnimationDuration", js.undefined)
    @scala.inline
    def setColumnChooserButtonApplyClick(value: (/* event */ Event, /* ui */ ColumnChooserButtonApplyClickEventUIParam) => Unit): Self = this.set("columnChooserButtonApplyClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserButtonApplyClick: Self = this.set("columnChooserButtonApplyClick", js.undefined)
    @scala.inline
    def setColumnChooserButtonApplyText(value: String): Self = this.set("columnChooserButtonApplyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserButtonApplyText: Self = this.set("columnChooserButtonApplyText", js.undefined)
    @scala.inline
    def setColumnChooserButtonCancelText(value: String): Self = this.set("columnChooserButtonCancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserButtonCancelText: Self = this.set("columnChooserButtonCancelText", js.undefined)
    @scala.inline
    def setColumnChooserButtonResetClick(value: (/* event */ Event, /* ui */ ColumnChooserButtonResetClickEventUIParam) => Unit): Self = this.set("columnChooserButtonResetClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserButtonResetClick: Self = this.set("columnChooserButtonResetClick", js.undefined)
    @scala.inline
    def setColumnChooserCaptionText(value: String): Self = this.set("columnChooserCaptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserCaptionText: Self = this.set("columnChooserCaptionText", js.undefined)
    @scala.inline
    def setColumnChooserClosed(value: (/* event */ Event, /* ui */ ColumnChooserClosedEventUIParam) => Unit): Self = this.set("columnChooserClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserClosed: Self = this.set("columnChooserClosed", js.undefined)
    @scala.inline
    def setColumnChooserClosing(value: (/* event */ Event, /* ui */ ColumnChooserClosingEventUIParam) => Unit): Self = this.set("columnChooserClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserClosing: Self = this.set("columnChooserClosing", js.undefined)
    @scala.inline
    def setColumnChooserContainment(value: String): Self = this.set("columnChooserContainment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserContainment: Self = this.set("columnChooserContainment", js.undefined)
    @scala.inline
    def setColumnChooserContentsRendered(value: (/* event */ Event, /* ui */ ColumnChooserContentsRenderedEventUIParam) => Unit): Self = this.set("columnChooserContentsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserContentsRendered: Self = this.set("columnChooserContentsRendered", js.undefined)
    @scala.inline
    def setColumnChooserContentsRendering(value: (/* event */ Event, /* ui */ ColumnChooserContentsRenderingEventUIParam) => Unit): Self = this.set("columnChooserContentsRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserContentsRendering: Self = this.set("columnChooserContentsRendering", js.undefined)
    @scala.inline
    def setColumnChooserDisplayText(value: String): Self = this.set("columnChooserDisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserDisplayText: Self = this.set("columnChooserDisplayText", js.undefined)
    @scala.inline
    def setColumnChooserHeight(value: String): Self = this.set("columnChooserHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserHeight: Self = this.set("columnChooserHeight", js.undefined)
    @scala.inline
    def setColumnChooserHideOnClick(value: Boolean): Self = this.set("columnChooserHideOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserHideOnClick: Self = this.set("columnChooserHideOnClick", js.undefined)
    @scala.inline
    def setColumnChooserHideText(value: String): Self = this.set("columnChooserHideText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserHideText: Self = this.set("columnChooserHideText", js.undefined)
    @scala.inline
    def setColumnChooserMoving(value: (/* event */ Event, /* ui */ ColumnChooserMovingEventUIParam) => Unit): Self = this.set("columnChooserMoving", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserMoving: Self = this.set("columnChooserMoving", js.undefined)
    @scala.inline
    def setColumnChooserOpened(value: (/* event */ Event, /* ui */ ColumnChooserOpenedEventUIParam) => Unit): Self = this.set("columnChooserOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserOpened: Self = this.set("columnChooserOpened", js.undefined)
    @scala.inline
    def setColumnChooserOpening(value: (/* event */ Event, /* ui */ ColumnChooserOpeningEventUIParam) => Unit): Self = this.set("columnChooserOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnChooserOpening: Self = this.set("columnChooserOpening", js.undefined)
    @scala.inline
    def setColumnChooserResetButtonLabel(value: String): Self = this.set("columnChooserResetButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserResetButtonLabel: Self = this.set("columnChooserResetButtonLabel", js.undefined)
    @scala.inline
    def setColumnChooserShowText(value: String): Self = this.set("columnChooserShowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserShowText: Self = this.set("columnChooserShowText", js.undefined)
    @scala.inline
    def setColumnChooserWidth(value: String): Self = this.set("columnChooserWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserWidth: Self = this.set("columnChooserWidth", js.undefined)
    @scala.inline
    def setColumnHidden(value: (/* event */ Event, /* ui */ ColumnHiddenEventUIParam) => Unit): Self = this.set("columnHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnHidden: Self = this.set("columnHidden", js.undefined)
    @scala.inline
    def setColumnHideText(value: String): Self = this.set("columnHideText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHideText: Self = this.set("columnHideText", js.undefined)
    @scala.inline
    def setColumnHiding(value: (/* event */ Event, /* ui */ ColumnHidingEventUIParam) => Unit): Self = this.set("columnHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnHiding: Self = this.set("columnHiding", js.undefined)
    @scala.inline
    def setColumnHidingRefused(value: (/* event */ Event, /* ui */ ColumnHidingRefusedEventUIParam) => Unit): Self = this.set("columnHidingRefused", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnHidingRefused: Self = this.set("columnHidingRefused", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridHidingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridHidingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setColumnShowing(value: (/* event */ Event, /* ui */ ColumnShowingEventUIParam) => Unit): Self = this.set("columnShowing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnShowing: Self = this.set("columnShowing", js.undefined)
    @scala.inline
    def setColumnShowingRefused(value: (/* event */ Event, /* ui */ ColumnShowingRefusedEventUIParam) => Unit): Self = this.set("columnShowingRefused", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnShowingRefused: Self = this.set("columnShowingRefused", js.undefined)
    @scala.inline
    def setColumnShown(value: (/* event */ Event, /* ui */ ColumnShownEventUIParam) => Unit): Self = this.set("columnShown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnShown: Self = this.set("columnShown", js.undefined)
    @scala.inline
    def setDialogWidget(value: String): Self = this.set("dialogWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogWidget: Self = this.set("dialogWidget", js.undefined)
    @scala.inline
    def setDropDownAnimationDuration(value: Double): Self = this.set("dropDownAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAnimationDuration: Self = this.set("dropDownAnimationDuration", js.undefined)
    @scala.inline
    def setHiddenColumnIndicatorHeaderWidth(value: Double): Self = this.set("hiddenColumnIndicatorHeaderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenColumnIndicatorHeaderWidth: Self = this.set("hiddenColumnIndicatorHeaderWidth", js.undefined)
    @scala.inline
    def setHiddenColumnIndicatorTooltipText(value: String): Self = this.set("hiddenColumnIndicatorTooltipText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenColumnIndicatorTooltipText: Self = this.set("hiddenColumnIndicatorTooltipText", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgGridHidingLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMultiColumnHiding(value: (/* event */ Event, /* ui */ MultiColumnHidingEventUIParam) => Unit): Self = this.set("multiColumnHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMultiColumnHiding: Self = this.set("multiColumnHiding", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
  }
  
}

