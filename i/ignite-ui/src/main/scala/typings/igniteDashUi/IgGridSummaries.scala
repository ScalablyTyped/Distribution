package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummaries
  extends /**
	 * Option for igGridSummaries
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies when calculations are made.
  	 *
  	 *
  	 * Valid values:
  	 * "onselect" summaries are updated when checkbox is checked/unchecked
  	 * "okcancelbuttons" summaries are updated only when OK button is clicked
  	 */
  var calculateRenderMode: js.UndefOr[String] = js.undefined
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
  var dialogButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text of the button OK in the summaries dropdown
  	 * Use option [locale.dialogButtonOKText](ui.iggridsummaries#options:locale.dialogButtonOKText).
  	 */
  var dialogButtonOKText: js.UndefOr[String] = js.undefined
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
  var dropDownDialogAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Height of the dropdown in pixels
  	 *
  	 */
  var dropDownHeight: js.UndefOr[Double] = js.undefined
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
  var dropDownWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Empty text template to be shown for empty cells
  	 * Use option [locale.emptyCellText](ui.iggridsummaries#options:locale.emptyCellText).
  	 */
  var emptyCellText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
  	 * Use option [locale.featureChooserText](ui.iggridsummaries#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
  	 * Use option [locale.featureChooserTextHide](ui.iggridsummaries#options:locale.featureChooserTextHide).
  	 */
  var featureChooserTextHide: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgGridSummariesLocale] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * a reference or name of a javascript function - renders summary cell in grid footer.(if not set it is used default render function) It takes 3 parameters - methodName(summary method), columnKey, data(summary data which should be rendered)
  	 *
  	 */
  var renderSummaryCellFunc: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Result template for summary result(shown in table cell)
  	 *
  	 */
  var resultTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Show/hide footer button(on click show/hide dropdown)
  	 *
  	 */
  var showDropDownButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Show header button icon in the header cell. On click - shows/hides summaries. If false then summary icon should not be shown in the feature chooser(if shown).
  	 *
  	 */
  var showSummariesButton: js.UndefOr[Boolean] = js.undefined
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
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when user selects/deselects summary method from checkbox
  	 */
  var summariesMethodSelectionChanged: js.UndefOr[SummariesMethodSelectionChangedEvent] = js.undefined
  /**
  	 * Result key by which we get data from the result returned by remote data source.
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[String] = js.undefined
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
  var summaryExecution: js.UndefOr[String] = js.undefined
  /**
  	 * Set key in GET Request for summaries - used only when type is remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * type of summaries calculating.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" when it is remote summaries calculations are made on the server
  	 * "local"	When it is local calculations are made on the client
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object IgGridSummaries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridSummaries
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    calculateRenderMode: String = null,
    callee: js.Function = null,
    columnSettings: js.Array[IgGridSummariesColumnSetting] = null,
    compactRenderingMode: js.Any = null,
    dialogButtonCancelText: String = null,
    dialogButtonOKText: String = null,
    dropDownCancelClicked: DropDownCancelClickedEvent = null,
    dropDownClosed: DropDownClosedEvent = null,
    dropDownClosing: DropDownClosingEvent = null,
    dropDownDialogAnimationDuration: Int | Double = null,
    dropDownHeight: Int | Double = null,
    dropDownOKClicked: DropDownOKClickedEvent = null,
    dropDownOpened: DropDownOpenedEvent = null,
    dropDownOpening: DropDownOpeningEvent = null,
    dropDownWidth: Int | Double = null,
    emptyCellText: String = null,
    featureChooserText: String = null,
    featureChooserTextHide: String = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: IgGridSummariesLocale = null,
    regional: String | js.Object = null,
    renderSummaryCellFunc: String | js.Object = null,
    resultTemplate: String = null,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showSummariesButton: js.UndefOr[Boolean] = js.undefined,
    summariesCalculated: SummariesCalculatedEvent = null,
    summariesCalculating: SummariesCalculatingEvent = null,
    summariesHeaderButtonTooltip: String = null,
    summariesMethodSelectionChanged: SummariesMethodSelectionChangedEvent = null,
    summariesResponseKey: String = null,
    summariesToggled: SummariesToggledEvent = null,
    summariesToggling: SummariesTogglingEvent = null,
    summaryExecution: String = null,
    summaryExprUrlKey: String = null,
    `type`: String = null
  ): IgGridSummaries = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (calculateRenderMode != null) __obj.updateDynamic("calculateRenderMode")(calculateRenderMode)
    if (callee != null) __obj.updateDynamic("callee")(callee)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (compactRenderingMode != null) __obj.updateDynamic("compactRenderingMode")(compactRenderingMode)
    if (dialogButtonCancelText != null) __obj.updateDynamic("dialogButtonCancelText")(dialogButtonCancelText)
    if (dialogButtonOKText != null) __obj.updateDynamic("dialogButtonOKText")(dialogButtonOKText)
    if (dropDownCancelClicked != null) __obj.updateDynamic("dropDownCancelClicked")(dropDownCancelClicked)
    if (dropDownClosed != null) __obj.updateDynamic("dropDownClosed")(dropDownClosed)
    if (dropDownClosing != null) __obj.updateDynamic("dropDownClosing")(dropDownClosing)
    if (dropDownDialogAnimationDuration != null) __obj.updateDynamic("dropDownDialogAnimationDuration")(dropDownDialogAnimationDuration.asInstanceOf[js.Any])
    if (dropDownHeight != null) __obj.updateDynamic("dropDownHeight")(dropDownHeight.asInstanceOf[js.Any])
    if (dropDownOKClicked != null) __obj.updateDynamic("dropDownOKClicked")(dropDownOKClicked)
    if (dropDownOpened != null) __obj.updateDynamic("dropDownOpened")(dropDownOpened)
    if (dropDownOpening != null) __obj.updateDynamic("dropDownOpening")(dropDownOpening)
    if (dropDownWidth != null) __obj.updateDynamic("dropDownWidth")(dropDownWidth.asInstanceOf[js.Any])
    if (emptyCellText != null) __obj.updateDynamic("emptyCellText")(emptyCellText)
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText)
    if (featureChooserTextHide != null) __obj.updateDynamic("featureChooserTextHide")(featureChooserTextHide)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (renderSummaryCellFunc != null) __obj.updateDynamic("renderSummaryCellFunc")(renderSummaryCellFunc.asInstanceOf[js.Any])
    if (resultTemplate != null) __obj.updateDynamic("resultTemplate")(resultTemplate)
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton)
    if (!js.isUndefined(showSummariesButton)) __obj.updateDynamic("showSummariesButton")(showSummariesButton)
    if (summariesCalculated != null) __obj.updateDynamic("summariesCalculated")(summariesCalculated)
    if (summariesCalculating != null) __obj.updateDynamic("summariesCalculating")(summariesCalculating)
    if (summariesHeaderButtonTooltip != null) __obj.updateDynamic("summariesHeaderButtonTooltip")(summariesHeaderButtonTooltip)
    if (summariesMethodSelectionChanged != null) __obj.updateDynamic("summariesMethodSelectionChanged")(summariesMethodSelectionChanged)
    if (summariesResponseKey != null) __obj.updateDynamic("summariesResponseKey")(summariesResponseKey)
    if (summariesToggled != null) __obj.updateDynamic("summariesToggled")(summariesToggled)
    if (summariesToggling != null) __obj.updateDynamic("summariesToggling")(summariesToggling)
    if (summaryExecution != null) __obj.updateDynamic("summaryExecution")(summaryExecution)
    if (summaryExprUrlKey != null) __obj.updateDynamic("summaryExprUrlKey")(summaryExprUrlKey)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IgGridSummaries]
  }
}

