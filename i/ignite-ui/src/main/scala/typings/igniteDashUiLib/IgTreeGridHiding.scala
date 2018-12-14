package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgTreeGridHiding
  extends /**
	 * Option for igTreeGridHiding
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies time of milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var columnChooserAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired when button Apply in column chooser is clicked
  	 */
  var columnChooserButtonApplyClick: js.UndefOr[ColumnChooserButtonApplyClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which apply changes in modal dialog. Use option [locale.columnChooserButtonApplyText](ui.iggridhiding#options:locale.columnChooserButtonApplyText).
  	 */
  var columnChooserButtonApplyText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in modal dialog. Use option [locale.columnChooserButtonCancelText](ui.iggridhiding#options:locale.columnChooserButtonCancelText).
  	 */
  var columnChooserButtonCancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired when button Reset in column chooser is clicked
  	 */
  var columnChooserButtonResetClick: js.UndefOr[ColumnChooserButtonResetClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The caption of the column chooser dialog. Use option [locale.columnChooserCaptionText](ui.iggridhiding#options:locale.columnChooserCaptionText).
  	 */
  var columnChooserCaptionText: js.UndefOr[java.lang.String] = js.undefined
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
  var columnChooserContainment: js.UndefOr[java.lang.String] = js.undefined
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
  var columnChooserDisplayText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The default column chooser height.
  	 *
  	 */
  var columnChooserHeight: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies on click show/hide directly to be shown/hidden columns. If columnChooserHideOnClick is false then Apply and Cancel Buttons are shown on the bottom of modal dialog. Columns are Shown/Hidden after the Apply button is clicked
  	 *
  	 */
  var columnChooserHideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the column chooser to hide column. Use option [locale.columnChooserHideText](ui.iggridhiding#options:locale.columnChooserHideText).
  	 */
  var columnChooserHideText: js.UndefOr[java.lang.String] = js.undefined
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
  var columnChooserResetButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the column chooser to show column. Use option [locale.columnChooserShowText](ui.iggridhiding#options:locale.columnChooserShowText).
  	 */
  var columnChooserShowText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The default column chooser width.
  	 *
  	 */
  var columnChooserWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after the hiding has been executed and results are rendered.
  	 */
  var columnHidden: js.UndefOr[ColumnHiddenEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the drop down tools menu(Feature Chooser) to hide a column. Use option [locale.columnHideText](ui.iggridhiding#options:locale.columnHideText).
  	 */
  var columnHideText: js.UndefOr[java.lang.String] = js.undefined
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
  var dialogWidget: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The duration of the dropdown animation in milliseconds.
  	 *
  	 */
  var dropDownAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The width in pixels of the hidden column indicator in the header.
  	 *
  	 */
  var hiddenColumnIndicatorHeaderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text displayed in the tooltip of the hidden column indicator. Use option [locale.hiddenColumnIndicatorTooltipText](ui.iggridhiding#options:locale.hiddenColumnIndicatorTooltipText).
  	 */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[IgGridHidingLocale] = js.undefined
  /**
  	 * Event fired before a hiding operation is executed.
  	 */
  var multiColumnHiding: js.UndefOr[MultiColumnHidingEvent] = js.undefined
}

