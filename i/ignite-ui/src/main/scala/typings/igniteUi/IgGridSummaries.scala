package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummaries
  extends /**
  * Option for JSONPDataSourceSettings
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
  var calculateRenderMode: js.UndefOr[String] = js.native
  /**
    * Function reference - it is called when data is retrieved from the data source
    *
    */
  var callee: js.UndefOr[js.Function] = js.native
  /**
    * A list of column settings that specifies custom summaries options per column basis
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridSummariesColumnSetting]] = js.native
  /**
    * Specifies how compact the summaries are rendered.
    * When true indicates that the summaries may be rendered compactly, even mixing different summaries on the same line.
    * False ensures that each summary type is occupying a separate line.
    * Auto will use True if the maximum number of visible summaries is one or less and False otherwise.
    *
    */
  var compactRenderingMode: js.UndefOr[js.Any] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text of the button Cancel in the summaries dropdown
    * Use option [locale.dialogButtonCancelText](ui.iggridsummaries#options:locale.dialogButtonCancelText).
    */
  var dialogButtonCancelText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text of the button OK in the summaries dropdown
    * Use option [locale.dialogButtonOKText](ui.iggridsummaries#options:locale.dialogButtonOKText).
    */
  var dialogButtonOKText: js.UndefOr[String] = js.native
  /**
    * Event is fired when Cancel button is clicked in drop down.
    */
  var dropDownCancelClicked: js.UndefOr[DropDownCancelClickedEvent] = js.native
  /**
    * Event fired after the dropdown for a summary column is closed
    */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  /**
    * Event fired before the dropdown for a summary column starts closing
    * Return false in order to cancel closing the drop down.
    */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  /**
    * Dropdown animation duration
    *
    */
  var dropDownDialogAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Height of the dropdown in pixels
    *
    */
  var dropDownHeight: js.UndefOr[Double] = js.native
  /**
    * Event is fired when OK button is clicked in drop down
    */
  var dropDownOKClicked: js.UndefOr[DropDownOKClickedEvent] = js.native
  /**
    * Event fired after the summaries dropdown is opened for a specific column
    */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  /**
    * Event fired before drop down is opened for a specific column summary
    * Return false in order to cancel opening the drop down.
    */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  /**
    * Width of the dropdown in pixels
    *
    */
  var dropDownWidth: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Empty text template to be shown for empty cells
    * Use option [locale.emptyCellText](ui.iggridsummaries#options:locale.emptyCellText).
    */
  var emptyCellText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
    * Use option [locale.featureChooserText](ui.iggridsummaries#options:locale.featureChooserText).
    */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
    * Use option [locale.featureChooserTextHide](ui.iggridsummaries#options:locale.featureChooserTextHide).
    */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridSummariesLocale] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * a reference or name of a javascript function - renders summary cell in grid footer.(if not set it is used default render function) It takes 3 parameters - methodName(summary method), columnKey, data(summary data which should be rendered)
    *
    */
  var renderSummaryCellFunc: js.UndefOr[String | js.Object] = js.native
  /**
    * Result template for summary result(shown in table cell)
    *
    */
  var resultTemplate: js.UndefOr[String] = js.native
  /**
    * Show/hide footer button(on click show/hide dropdown)
    *
    */
  var showDropDownButton: js.UndefOr[Boolean] = js.native
  /**
    * Show header button icon in the header cell. On click - shows/hides summaries. If false then summary icon should not be shown in the feature chooser(if shown).
    *
    */
  var showSummariesButton: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after summaries calculation are completely made
    */
  var summariesCalculated: js.UndefOr[SummariesCalculatedEvent] = js.native
  /**
    * Event fired before summaries calculations are made
    * Return false in order to cancel calculation of summaries.
    */
  var summariesCalculating: js.UndefOr[SummariesCalculatingEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for header cell button
    * Use option [locale.summariesHeaderButtonTooltip](ui.iggridsummaries#options:locale.summariesHeaderButtonTooltip).
    */
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.native
  /**
    * Event fired when user selects/deselects summary method from checkbox
    */
  var summariesMethodSelectionChanged: js.UndefOr[SummariesMethodSelectionChangedEvent] = js.native
  /**
    * Result key by which we get data from the result returned by remote data source.
    *
    */
  var summariesResponseKey: js.UndefOr[String] = js.native
  /**
    * Event is fired after summary rows are toggled
    */
  var summariesToggled: js.UndefOr[SummariesToggledEvent] = js.native
  /**
    * Event is fired bofore summary rows start toggling
    * Return false in order to cancel showing/hiding of summaries.
    */
  var summariesToggling: js.UndefOr[SummariesTogglingEvent] = js.native
  /**
    * Determines when the summary values are calculated when type is local
    *
    *
    * Valid values:
    * "priortofilteringandpaging" summaries are calculated prior to filtering and paging
    * "afterfilteringbeforepaging" summaries are calculated after filtering and before paging
    * "afterfilteringandpaging" summaries are calculated after filtering and paging
    */
  var summaryExecution: js.UndefOr[String] = js.native
  /**
    * Set key in GET Request for summaries - used only when type is remote
    *
    */
  var summaryExprUrlKey: js.UndefOr[String] = js.native
  /**
    * type of summaries calculating.
    *
    *
    * Valid values:
    * "remote" when it is remote summaries calculations are made on the server
    * "local"    When it is local calculations are made on the client
    */
  var `type`: js.UndefOr[String] = js.native
}

object IgGridSummaries {
  @scala.inline
  def apply(): IgGridSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummaries]
  }
  @scala.inline
  implicit class IgGridSummariesOps[Self <: IgGridSummaries] (val x: Self) extends AnyVal {
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
    def setCalculateRenderMode(value: String): Self = this.set("calculateRenderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateRenderMode: Self = this.set("calculateRenderMode", js.undefined)
    @scala.inline
    def setCallee(value: js.Function): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridSummariesColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridSummariesColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setCompactRenderingMode(value: js.Any): Self = this.set("compactRenderingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactRenderingMode: Self = this.set("compactRenderingMode", js.undefined)
    @scala.inline
    def setDialogButtonCancelText(value: String): Self = this.set("dialogButtonCancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogButtonCancelText: Self = this.set("dialogButtonCancelText", js.undefined)
    @scala.inline
    def setDialogButtonOKText(value: String): Self = this.set("dialogButtonOKText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogButtonOKText: Self = this.set("dialogButtonOKText", js.undefined)
    @scala.inline
    def setDropDownCancelClicked(value: (/* event */ Event, /* ui */ DropDownCancelClickedEventUIParam) => Unit): Self = this.set("dropDownCancelClicked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownCancelClicked: Self = this.set("dropDownCancelClicked", js.undefined)
    @scala.inline
    def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = this.set("dropDownClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownClosed: Self = this.set("dropDownClosed", js.undefined)
    @scala.inline
    def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = this.set("dropDownClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownClosing: Self = this.set("dropDownClosing", js.undefined)
    @scala.inline
    def setDropDownDialogAnimationDuration(value: Double): Self = this.set("dropDownDialogAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownDialogAnimationDuration: Self = this.set("dropDownDialogAnimationDuration", js.undefined)
    @scala.inline
    def setDropDownHeight(value: Double): Self = this.set("dropDownHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownHeight: Self = this.set("dropDownHeight", js.undefined)
    @scala.inline
    def setDropDownOKClicked(value: (/* event */ Event, /* ui */ DropDownOKClickedEventUIParam) => Unit): Self = this.set("dropDownOKClicked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOKClicked: Self = this.set("dropDownOKClicked", js.undefined)
    @scala.inline
    def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = this.set("dropDownOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOpened: Self = this.set("dropDownOpened", js.undefined)
    @scala.inline
    def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = this.set("dropDownOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOpening: Self = this.set("dropDownOpening", js.undefined)
    @scala.inline
    def setDropDownWidth(value: Double): Self = this.set("dropDownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownWidth: Self = this.set("dropDownWidth", js.undefined)
    @scala.inline
    def setEmptyCellText(value: String): Self = this.set("emptyCellText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyCellText: Self = this.set("emptyCellText", js.undefined)
    @scala.inline
    def setFeatureChooserText(value: String): Self = this.set("featureChooserText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserText: Self = this.set("featureChooserText", js.undefined)
    @scala.inline
    def setFeatureChooserTextHide(value: String): Self = this.set("featureChooserTextHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextHide: Self = this.set("featureChooserTextHide", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgGridSummariesLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRenderSummaryCellFunc(value: String | js.Object): Self = this.set("renderSummaryCellFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderSummaryCellFunc: Self = this.set("renderSummaryCellFunc", js.undefined)
    @scala.inline
    def setResultTemplate(value: String): Self = this.set("resultTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultTemplate: Self = this.set("resultTemplate", js.undefined)
    @scala.inline
    def setShowDropDownButton(value: Boolean): Self = this.set("showDropDownButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDropDownButton: Self = this.set("showDropDownButton", js.undefined)
    @scala.inline
    def setShowSummariesButton(value: Boolean): Self = this.set("showSummariesButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSummariesButton: Self = this.set("showSummariesButton", js.undefined)
    @scala.inline
    def setSummariesCalculated(value: (/* event */ Event, /* ui */ SummariesCalculatedEventUIParam) => Unit): Self = this.set("summariesCalculated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSummariesCalculated: Self = this.set("summariesCalculated", js.undefined)
    @scala.inline
    def setSummariesCalculating(value: (/* event */ Event, /* ui */ SummariesCalculatingEventUIParam) => Unit): Self = this.set("summariesCalculating", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSummariesCalculating: Self = this.set("summariesCalculating", js.undefined)
    @scala.inline
    def setSummariesHeaderButtonTooltip(value: String): Self = this.set("summariesHeaderButtonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummariesHeaderButtonTooltip: Self = this.set("summariesHeaderButtonTooltip", js.undefined)
    @scala.inline
    def setSummariesMethodSelectionChanged(value: (/* event */ Event, /* ui */ SummariesMethodSelectionChangedEventUIParam) => Unit): Self = this.set("summariesMethodSelectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSummariesMethodSelectionChanged: Self = this.set("summariesMethodSelectionChanged", js.undefined)
    @scala.inline
    def setSummariesResponseKey(value: String): Self = this.set("summariesResponseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummariesResponseKey: Self = this.set("summariesResponseKey", js.undefined)
    @scala.inline
    def setSummariesToggled(value: (/* event */ Event, /* ui */ SummariesToggledEventUIParam) => Unit): Self = this.set("summariesToggled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSummariesToggled: Self = this.set("summariesToggled", js.undefined)
    @scala.inline
    def setSummariesToggling(value: (/* event */ Event, /* ui */ SummariesTogglingEventUIParam) => Unit): Self = this.set("summariesToggling", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSummariesToggling: Self = this.set("summariesToggling", js.undefined)
    @scala.inline
    def setSummaryExecution(value: String): Self = this.set("summaryExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryExecution: Self = this.set("summaryExecution", js.undefined)
    @scala.inline
    def setSummaryExprUrlKey(value: String): Self = this.set("summaryExprUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryExprUrlKey: Self = this.set("summaryExprUrlKey", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

