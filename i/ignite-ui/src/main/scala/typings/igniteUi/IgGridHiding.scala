package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridHiding
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies time of milliseconds for animation duration to show/hide modal dialog
    *
    */
  var columnChooserAnimationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Event fired when button Apply in column chooser is clicked
    */
  var columnChooserButtonApplyClick: js.UndefOr[ColumnChooserButtonApplyClickEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which apply changes in modal dialog. Use option [locale.columnChooserButtonApplyText](ui.iggridhiding#options:locale.columnChooserButtonApplyText).
    */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which cancel changes in modal dialog. Use option [locale.columnChooserButtonCancelText](ui.iggridhiding#options:locale.columnChooserButtonCancelText).
    */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired when button Reset in column chooser is clicked
    */
  var columnChooserButtonResetClick: js.UndefOr[ColumnChooserButtonResetClickEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The caption of the column chooser dialog. Use option [locale.columnChooserCaptionText](ui.iggridhiding#options:locale.columnChooserCaptionText).
    */
  var columnChooserCaptionText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the column chooser has been closed.
    */
  var columnChooserClosed: js.UndefOr[ColumnChooserClosedEvent] = js.undefined
  
  /**
    * Event fired before the column chooser is closed.
    */
  var columnChooserClosing: js.UndefOr[ColumnChooserClosingEvent] = js.undefined
  
  /**
    * Controls containment behavior.
    *
    * owner  The column chooser dialog will be draggable only in the grid area
    * window  The column chooser dialog will be draggable in the whole window area
    */
  var columnChooserContainment: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the contents of the column chooser are rendered.
    */
  var columnChooserContentsRendered: js.UndefOr[ColumnChooserContentsRenderedEvent] = js.undefined
  
  /**
    * Event fired before the contents of the column chooser are rendered.
    */
  var columnChooserContentsRendering: js.UndefOr[ColumnChooserContentsRenderingEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog. Use option [locale.columnChooserDisplayText](ui.iggridhiding#options:locale.columnChooserDisplayText).
    */
  var columnChooserDisplayText: js.UndefOr[String] = js.undefined
  
  /**
    * The default column chooser height.
    *
    */
  var columnChooserHeight: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies on click show/hide directly to be shown/hidden columns. If columnChooserHideOnClick is false then Apply and Cancel Buttons are shown on the bottom of modal dialog. Columns are Shown/Hidden after the Apply button is clicked
    *
    */
  var columnChooserHideOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the column chooser to hide column. Use option [locale.columnChooserHideText](ui.iggridhiding#options:locale.columnChooserHideText).
    */
  var columnChooserHideText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired every time the column chooser changes its position.
    */
  var columnChooserMoving: js.UndefOr[ColumnChooserMovingEvent] = js.undefined
  
  /**
    * Event fired after the column chooser is already opened.
    */
  var columnChooserOpened: js.UndefOr[ColumnChooserOpenedEvent] = js.undefined
  
  /**
    * Event fired before the column chooser is opened.
    */
  var columnChooserOpening: js.UndefOr[ColumnChooserOpeningEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text label for reset button. Use option [locale.columnChooserResetButtonLabel](ui.iggridhiding#options:locale.columnChooserResetButtonLabel).
    */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the column chooser to show column. Use option [locale.columnChooserShowText](ui.iggridhiding#options:locale.columnChooserShowText).
    */
  var columnChooserShowText: js.UndefOr[String] = js.undefined
  
  /**
    * The default column chooser width.
    *
    */
  var columnChooserWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the hiding has been executed and results are rendered.
    */
  var columnHidden: js.UndefOr[ColumnHiddenEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text used in the drop down tools menu(Feature Chooser) to hide a column. Use option [locale.columnHideText](ui.iggridhiding#options:locale.columnHideText).
    */
  var columnHideText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired before a hiding operation is executed.
    */
  var columnHiding: js.UndefOr[ColumnHidingEvent] = js.undefined
  
  /**
    * Event fired when trying to hide all columns in fixed or unfixed area.
    */
  var columnHidingRefused: js.UndefOr[ColumnHidingRefusedEvent] = js.undefined
  
  /**
    * A list of column settings that specifies hiding options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridHidingColumnSetting]] = js.undefined
  
  /**
    * Event fired before a showing operation is executed.
    */
  var columnShowing: js.UndefOr[ColumnShowingEvent] = js.undefined
  
  /**
    * Event fired when trying to show column(s) in fixed area and total width of fixed are will be larger than whole grid width.
    */
  var columnShowingRefused: js.UndefOr[ColumnShowingRefusedEvent] = js.undefined
  
  /**
    * Event fired after the showing has been executed and results are rendered.
    */
  var columnShown: js.UndefOr[ColumnShownEvent] = js.undefined
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the dropdown animation in milliseconds.
    *
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * The width in pixels of the hidden column indicator in the header.
    *
    */
  var hiddenColumnIndicatorHeaderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * The text displayed in the tooltip of the hidden column indicator. Use option [locale.hiddenColumnIndicatorTooltipText](ui.iggridhiding#options:locale.hiddenColumnIndicatorTooltipText).
    */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.undefined
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    *
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[IgGridHidingLocale] = js.undefined
  
  /**
    * Event fired before a hiding operation is executed.
    */
  var multiColumnHiding: js.UndefOr[MultiColumnHidingEvent] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
}
object IgGridHiding {
  
  inline def apply(): IgGridHiding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHiding]
  }
  
  extension [Self <: IgGridHiding](x: Self) {
    
    inline def setColumnChooserAnimationDuration(value: Double): Self = StObject.set(x, "columnChooserAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserAnimationDurationUndefined: Self = StObject.set(x, "columnChooserAnimationDuration", js.undefined)
    
    inline def setColumnChooserButtonApplyClick(value: (/* event */ Event, /* ui */ ColumnChooserButtonApplyClickEventUIParam) => Unit): Self = StObject.set(x, "columnChooserButtonApplyClick", js.Any.fromFunction2(value))
    
    inline def setColumnChooserButtonApplyClickUndefined: Self = StObject.set(x, "columnChooserButtonApplyClick", js.undefined)
    
    inline def setColumnChooserButtonApplyText(value: String): Self = StObject.set(x, "columnChooserButtonApplyText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserButtonApplyTextUndefined: Self = StObject.set(x, "columnChooserButtonApplyText", js.undefined)
    
    inline def setColumnChooserButtonCancelText(value: String): Self = StObject.set(x, "columnChooserButtonCancelText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserButtonCancelTextUndefined: Self = StObject.set(x, "columnChooserButtonCancelText", js.undefined)
    
    inline def setColumnChooserButtonResetClick(value: (/* event */ Event, /* ui */ ColumnChooserButtonResetClickEventUIParam) => Unit): Self = StObject.set(x, "columnChooserButtonResetClick", js.Any.fromFunction2(value))
    
    inline def setColumnChooserButtonResetClickUndefined: Self = StObject.set(x, "columnChooserButtonResetClick", js.undefined)
    
    inline def setColumnChooserCaptionText(value: String): Self = StObject.set(x, "columnChooserCaptionText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserCaptionTextUndefined: Self = StObject.set(x, "columnChooserCaptionText", js.undefined)
    
    inline def setColumnChooserClosed(value: (/* event */ Event, /* ui */ ColumnChooserClosedEventUIParam) => Unit): Self = StObject.set(x, "columnChooserClosed", js.Any.fromFunction2(value))
    
    inline def setColumnChooserClosedUndefined: Self = StObject.set(x, "columnChooserClosed", js.undefined)
    
    inline def setColumnChooserClosing(value: (/* event */ Event, /* ui */ ColumnChooserClosingEventUIParam) => Unit): Self = StObject.set(x, "columnChooserClosing", js.Any.fromFunction2(value))
    
    inline def setColumnChooserClosingUndefined: Self = StObject.set(x, "columnChooserClosing", js.undefined)
    
    inline def setColumnChooserContainment(value: String): Self = StObject.set(x, "columnChooserContainment", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserContainmentUndefined: Self = StObject.set(x, "columnChooserContainment", js.undefined)
    
    inline def setColumnChooserContentsRendered(value: (/* event */ Event, /* ui */ ColumnChooserContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "columnChooserContentsRendered", js.Any.fromFunction2(value))
    
    inline def setColumnChooserContentsRenderedUndefined: Self = StObject.set(x, "columnChooserContentsRendered", js.undefined)
    
    inline def setColumnChooserContentsRendering(value: (/* event */ Event, /* ui */ ColumnChooserContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "columnChooserContentsRendering", js.Any.fromFunction2(value))
    
    inline def setColumnChooserContentsRenderingUndefined: Self = StObject.set(x, "columnChooserContentsRendering", js.undefined)
    
    inline def setColumnChooserDisplayText(value: String): Self = StObject.set(x, "columnChooserDisplayText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserDisplayTextUndefined: Self = StObject.set(x, "columnChooserDisplayText", js.undefined)
    
    inline def setColumnChooserHeight(value: String): Self = StObject.set(x, "columnChooserHeight", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserHeightUndefined: Self = StObject.set(x, "columnChooserHeight", js.undefined)
    
    inline def setColumnChooserHideOnClick(value: Boolean): Self = StObject.set(x, "columnChooserHideOnClick", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserHideOnClickUndefined: Self = StObject.set(x, "columnChooserHideOnClick", js.undefined)
    
    inline def setColumnChooserHideText(value: String): Self = StObject.set(x, "columnChooserHideText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserHideTextUndefined: Self = StObject.set(x, "columnChooserHideText", js.undefined)
    
    inline def setColumnChooserMoving(value: (/* event */ Event, /* ui */ ColumnChooserMovingEventUIParam) => Unit): Self = StObject.set(x, "columnChooserMoving", js.Any.fromFunction2(value))
    
    inline def setColumnChooserMovingUndefined: Self = StObject.set(x, "columnChooserMoving", js.undefined)
    
    inline def setColumnChooserOpened(value: (/* event */ Event, /* ui */ ColumnChooserOpenedEventUIParam) => Unit): Self = StObject.set(x, "columnChooserOpened", js.Any.fromFunction2(value))
    
    inline def setColumnChooserOpenedUndefined: Self = StObject.set(x, "columnChooserOpened", js.undefined)
    
    inline def setColumnChooserOpening(value: (/* event */ Event, /* ui */ ColumnChooserOpeningEventUIParam) => Unit): Self = StObject.set(x, "columnChooserOpening", js.Any.fromFunction2(value))
    
    inline def setColumnChooserOpeningUndefined: Self = StObject.set(x, "columnChooserOpening", js.undefined)
    
    inline def setColumnChooserResetButtonLabel(value: String): Self = StObject.set(x, "columnChooserResetButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserResetButtonLabelUndefined: Self = StObject.set(x, "columnChooserResetButtonLabel", js.undefined)
    
    inline def setColumnChooserShowText(value: String): Self = StObject.set(x, "columnChooserShowText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserShowTextUndefined: Self = StObject.set(x, "columnChooserShowText", js.undefined)
    
    inline def setColumnChooserWidth(value: String): Self = StObject.set(x, "columnChooserWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserWidthUndefined: Self = StObject.set(x, "columnChooserWidth", js.undefined)
    
    inline def setColumnHidden(value: (/* event */ Event, /* ui */ ColumnHiddenEventUIParam) => Unit): Self = StObject.set(x, "columnHidden", js.Any.fromFunction2(value))
    
    inline def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    inline def setColumnHideText(value: String): Self = StObject.set(x, "columnHideText", value.asInstanceOf[js.Any])
    
    inline def setColumnHideTextUndefined: Self = StObject.set(x, "columnHideText", js.undefined)
    
    inline def setColumnHiding(value: (/* event */ Event, /* ui */ ColumnHidingEventUIParam) => Unit): Self = StObject.set(x, "columnHiding", js.Any.fromFunction2(value))
    
    inline def setColumnHidingRefused(value: (/* event */ Event, /* ui */ ColumnHidingRefusedEventUIParam) => Unit): Self = StObject.set(x, "columnHidingRefused", js.Any.fromFunction2(value))
    
    inline def setColumnHidingRefusedUndefined: Self = StObject.set(x, "columnHidingRefused", js.undefined)
    
    inline def setColumnHidingUndefined: Self = StObject.set(x, "columnHiding", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridHidingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridHidingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    inline def setColumnShowing(value: (/* event */ Event, /* ui */ ColumnShowingEventUIParam) => Unit): Self = StObject.set(x, "columnShowing", js.Any.fromFunction2(value))
    
    inline def setColumnShowingRefused(value: (/* event */ Event, /* ui */ ColumnShowingRefusedEventUIParam) => Unit): Self = StObject.set(x, "columnShowingRefused", js.Any.fromFunction2(value))
    
    inline def setColumnShowingRefusedUndefined: Self = StObject.set(x, "columnShowingRefused", js.undefined)
    
    inline def setColumnShowingUndefined: Self = StObject.set(x, "columnShowing", js.undefined)
    
    inline def setColumnShown(value: (/* event */ Event, /* ui */ ColumnShownEventUIParam) => Unit): Self = StObject.set(x, "columnShown", js.Any.fromFunction2(value))
    
    inline def setColumnShownUndefined: Self = StObject.set(x, "columnShown", js.undefined)
    
    inline def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    inline def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    inline def setDropDownAnimationDuration(value: Double): Self = StObject.set(x, "dropDownAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setDropDownAnimationDurationUndefined: Self = StObject.set(x, "dropDownAnimationDuration", js.undefined)
    
    inline def setHiddenColumnIndicatorHeaderWidth(value: Double): Self = StObject.set(x, "hiddenColumnIndicatorHeaderWidth", value.asInstanceOf[js.Any])
    
    inline def setHiddenColumnIndicatorHeaderWidthUndefined: Self = StObject.set(x, "hiddenColumnIndicatorHeaderWidth", js.undefined)
    
    inline def setHiddenColumnIndicatorTooltipText(value: String): Self = StObject.set(x, "hiddenColumnIndicatorTooltipText", value.asInstanceOf[js.Any])
    
    inline def setHiddenColumnIndicatorTooltipTextUndefined: Self = StObject.set(x, "hiddenColumnIndicatorTooltipText", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: IgGridHidingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMultiColumnHiding(value: (/* event */ Event, /* ui */ MultiColumnHidingEventUIParam) => Unit): Self = StObject.set(x, "multiColumnHiding", js.Any.fromFunction2(value))
    
    inline def setMultiColumnHidingUndefined: Self = StObject.set(x, "multiColumnHiding", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
  }
}
