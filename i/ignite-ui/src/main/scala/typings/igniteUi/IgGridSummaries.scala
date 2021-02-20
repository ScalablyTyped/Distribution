package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgGridSummariesMutableBuilder[Self <: IgGridSummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateRenderMode(value: String): Self = StObject.set(x, "calculateRenderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateRenderModeUndefined: Self = StObject.set(x, "calculateRenderMode", js.undefined)
    
    @scala.inline
    def setCallee(value: js.Function): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridSummariesColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridSummariesColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setCompactRenderingMode(value: js.Any): Self = StObject.set(x, "compactRenderingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactRenderingModeUndefined: Self = StObject.set(x, "compactRenderingMode", js.undefined)
    
    @scala.inline
    def setDialogButtonCancelText(value: String): Self = StObject.set(x, "dialogButtonCancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogButtonCancelTextUndefined: Self = StObject.set(x, "dialogButtonCancelText", js.undefined)
    
    @scala.inline
    def setDialogButtonOKText(value: String): Self = StObject.set(x, "dialogButtonOKText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogButtonOKTextUndefined: Self = StObject.set(x, "dialogButtonOKText", js.undefined)
    
    @scala.inline
    def setDropDownCancelClicked(value: (/* event */ Event, /* ui */ DropDownCancelClickedEventUIParam) => Unit): Self = StObject.set(x, "dropDownCancelClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownCancelClickedUndefined: Self = StObject.set(x, "dropDownCancelClicked", js.undefined)
    
    @scala.inline
    def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = StObject.set(x, "dropDownClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownClosedUndefined: Self = StObject.set(x, "dropDownClosed", js.undefined)
    
    @scala.inline
    def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = StObject.set(x, "dropDownClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownClosingUndefined: Self = StObject.set(x, "dropDownClosing", js.undefined)
    
    @scala.inline
    def setDropDownDialogAnimationDuration(value: Double): Self = StObject.set(x, "dropDownDialogAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownDialogAnimationDurationUndefined: Self = StObject.set(x, "dropDownDialogAnimationDuration", js.undefined)
    
    @scala.inline
    def setDropDownHeight(value: Double): Self = StObject.set(x, "dropDownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownHeightUndefined: Self = StObject.set(x, "dropDownHeight", js.undefined)
    
    @scala.inline
    def setDropDownOKClicked(value: (/* event */ Event, /* ui */ DropDownOKClickedEventUIParam) => Unit): Self = StObject.set(x, "dropDownOKClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownOKClickedUndefined: Self = StObject.set(x, "dropDownOKClicked", js.undefined)
    
    @scala.inline
    def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = StObject.set(x, "dropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownOpenedUndefined: Self = StObject.set(x, "dropDownOpened", js.undefined)
    
    @scala.inline
    def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = StObject.set(x, "dropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownOpeningUndefined: Self = StObject.set(x, "dropDownOpening", js.undefined)
    
    @scala.inline
    def setDropDownWidth(value: Double): Self = StObject.set(x, "dropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownWidthUndefined: Self = StObject.set(x, "dropDownWidth", js.undefined)
    
    @scala.inline
    def setEmptyCellText(value: String): Self = StObject.set(x, "emptyCellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCellTextUndefined: Self = StObject.set(x, "emptyCellText", js.undefined)
    
    @scala.inline
    def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextHide(value: String): Self = StObject.set(x, "featureChooserTextHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextHideUndefined: Self = StObject.set(x, "featureChooserTextHide", js.undefined)
    
    @scala.inline
    def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgGridSummariesLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRenderSummaryCellFunc(value: String | js.Object): Self = StObject.set(x, "renderSummaryCellFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSummaryCellFuncUndefined: Self = StObject.set(x, "renderSummaryCellFunc", js.undefined)
    
    @scala.inline
    def setResultTemplate(value: String): Self = StObject.set(x, "resultTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTemplateUndefined: Self = StObject.set(x, "resultTemplate", js.undefined)
    
    @scala.inline
    def setShowDropDownButton(value: Boolean): Self = StObject.set(x, "showDropDownButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDropDownButtonUndefined: Self = StObject.set(x, "showDropDownButton", js.undefined)
    
    @scala.inline
    def setShowSummariesButton(value: Boolean): Self = StObject.set(x, "showSummariesButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSummariesButtonUndefined: Self = StObject.set(x, "showSummariesButton", js.undefined)
    
    @scala.inline
    def setSummariesCalculated(value: (/* event */ Event, /* ui */ SummariesCalculatedEventUIParam) => Unit): Self = StObject.set(x, "summariesCalculated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSummariesCalculatedUndefined: Self = StObject.set(x, "summariesCalculated", js.undefined)
    
    @scala.inline
    def setSummariesCalculating(value: (/* event */ Event, /* ui */ SummariesCalculatingEventUIParam) => Unit): Self = StObject.set(x, "summariesCalculating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSummariesCalculatingUndefined: Self = StObject.set(x, "summariesCalculating", js.undefined)
    
    @scala.inline
    def setSummariesHeaderButtonTooltip(value: String): Self = StObject.set(x, "summariesHeaderButtonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesHeaderButtonTooltipUndefined: Self = StObject.set(x, "summariesHeaderButtonTooltip", js.undefined)
    
    @scala.inline
    def setSummariesMethodSelectionChanged(value: (/* event */ Event, /* ui */ SummariesMethodSelectionChangedEventUIParam) => Unit): Self = StObject.set(x, "summariesMethodSelectionChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSummariesMethodSelectionChangedUndefined: Self = StObject.set(x, "summariesMethodSelectionChanged", js.undefined)
    
    @scala.inline
    def setSummariesResponseKey(value: String): Self = StObject.set(x, "summariesResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesResponseKeyUndefined: Self = StObject.set(x, "summariesResponseKey", js.undefined)
    
    @scala.inline
    def setSummariesToggled(value: (/* event */ Event, /* ui */ SummariesToggledEventUIParam) => Unit): Self = StObject.set(x, "summariesToggled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSummariesToggledUndefined: Self = StObject.set(x, "summariesToggled", js.undefined)
    
    @scala.inline
    def setSummariesToggling(value: (/* event */ Event, /* ui */ SummariesTogglingEventUIParam) => Unit): Self = StObject.set(x, "summariesToggling", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSummariesTogglingUndefined: Self = StObject.set(x, "summariesToggling", js.undefined)
    
    @scala.inline
    def setSummaryExecution(value: String): Self = StObject.set(x, "summaryExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryExecutionUndefined: Self = StObject.set(x, "summaryExecution", js.undefined)
    
    @scala.inline
    def setSummaryExprUrlKey(value: String): Self = StObject.set(x, "summaryExprUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryExprUrlKeyUndefined: Self = StObject.set(x, "summaryExprUrlKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
