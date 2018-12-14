package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridSummaries
  extends /**
	 * Option for igGridSummaries
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies when calculations are made.
  	 *
  	 *
  	 * Valid values:
  	 * "onselect" summaries are updated when checkbox is checked/unchecked
  	 * "okcancelbuttons" summaries are updated only when OK button is clicked
  	 */
  var calculateRenderMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function reference - it is called when data is retrieved from the data source
  	 *
  	 */
  var callee: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A list of column settings that specifies custom summaries options per column basis
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridSummariesColumnSetting]] = js.undefined
  /**
  	 * Specifies how compact the summaries are rendered.
  	 * When true indicates that the summaries may be rendered compactly, even mixing different summaries on the same line.
  	 * False ensures that each summary type is occupying a separate line.
  	 * Auto will use True if the maximum number of visible summaries is one or less and False otherwise.
  	 *
  	 */
  var compactRenderingMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text of the button Cancel in the summaries dropdown
  	 * Use option [locale.dialogButtonCancelText](ui.iggridsummaries#options:locale.dialogButtonCancelText).
  	 */
  var dialogButtonCancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text of the button OK in the summaries dropdown
  	 * Use option [locale.dialogButtonOKText](ui.iggridsummaries#options:locale.dialogButtonOKText).
  	 */
  var dialogButtonOKText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event is fired when Cancel button is clicked in drop down.
  	 */
  var dropDownCancelClicked: js.UndefOr[DropDownCancelClickedEvent] = js.undefined
  /**
  	 * Event fired after the dropdown for a summary column is closed
  	 */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.undefined
  /**
  	 * Event fired before the dropdown for a summary column starts closing
  	 * Return false in order to cancel closing the drop down.
  	 */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.undefined
  /**
  	 * Dropdown animation duration
  	 *
  	 */
  var dropDownDialogAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Height of the dropdown in pixels
  	 *
  	 */
  var dropDownHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event is fired when OK button is clicked in drop down
  	 */
  var dropDownOKClicked: js.UndefOr[DropDownOKClickedEvent] = js.undefined
  /**
  	 * Event fired after the summaries dropdown is opened for a specific column
  	 */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.undefined
  /**
  	 * Event fired before drop down is opened for a specific column summary
  	 * Return false in order to cancel opening the drop down.
  	 */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.undefined
  /**
  	 * Width of the dropdown in pixels
  	 *
  	 */
  var dropDownWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Empty text template to be shown for empty cells
  	 * Use option [locale.emptyCellText](ui.iggridsummaries#options:locale.emptyCellText).
  	 */
  var emptyCellText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
  	 * Use option [locale.featureChooserText](ui.iggridsummaries#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
  	 * Use option [locale.featureChooserTextHide](ui.iggridsummaries#options:locale.featureChooserTextHide).
  	 */
  var featureChooserTextHide: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgGridSummariesLocale] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * a reference or name of a javascript function - renders summary cell in grid footer.(if not set it is used default render function) It takes 3 parameters - methodName(summary method), columnKey, data(summary data which should be rendered)
  	 *
  	 */
  var renderSummaryCellFunc: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Result template for summary result(shown in table cell)
  	 *
  	 */
  var resultTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Show/hide footer button(on click show/hide dropdown)
  	 *
  	 */
  var showDropDownButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Show header button icon in the header cell. On click - shows/hides summaries. If false then summary icon should not be shown in the feature chooser(if shown).
  	 *
  	 */
  var showSummariesButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired after summaries calculation are completely made
  	 */
  var summariesCalculated: js.UndefOr[SummariesCalculatedEvent] = js.undefined
  /**
  	 * Event fired before summaries calculations are made
  	 * Return false in order to cancel calculation of summaries.
  	 */
  var summariesCalculating: js.UndefOr[SummariesCalculatingEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for header cell button
  	 * Use option [locale.summariesHeaderButtonTooltip](ui.iggridsummaries#options:locale.summariesHeaderButtonTooltip).
  	 */
  var summariesHeaderButtonTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired when user selects/deselects summary method from checkbox
  	 */
  var summariesMethodSelectionChanged: js.UndefOr[SummariesMethodSelectionChangedEvent] = js.undefined
  /**
  	 * Result key by which we get data from the result returned by remote data source.
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event is fired after summary rows are toggled
  	 */
  var summariesToggled: js.UndefOr[SummariesToggledEvent] = js.undefined
  /**
  	 * Event is fired bofore summary rows start toggling
  	 * Return false in order to cancel showing/hiding of summaries.
  	 */
  var summariesToggling: js.UndefOr[SummariesTogglingEvent] = js.undefined
  /**
  	 * Determines when the summary values are calculated when type is local
  	 *
  	 *
  	 * Valid values:
  	 * "priortofilteringandpaging" summaries are calculated prior to filtering and paging
  	 * "afterfilteringbeforepaging" summaries are calculated after filtering and before paging
  	 * "afterfilteringandpaging" summaries are calculated after filtering and paging
  	 */
  var summaryExecution: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set key in GET Request for summaries - used only when type is remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * type of summaries calculating.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" when it is remote summaries calculations are made on the server
  	 * "local"	When it is local calculations are made on the client
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

