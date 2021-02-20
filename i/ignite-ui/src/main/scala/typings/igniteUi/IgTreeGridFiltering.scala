package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridFiltering
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Defines whether to render editors in advanced [mode](ui.iggridfiltering#options:mode). If false, no editors will be rendered in the advanced [mode](ui.iggridfiltering#options:mode).
    *
    */
  var advancedModeEditorsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Location of the advanced filtering button when [advancedModeEditorsVisible](ui.iggridfiltering#options:advancedModeEditorsVisible) is false (i.e. when the button is rendered in the header).
    *
    *
    * Valid values:
    * "left"
    * "right"
    */
  var advancedModeHeaderButtonLocation: js.UndefOr[String] = js.native
  
  /**
    * Enables or disables the filtering case sensitivity. Works only for local filtering. If true, it case sensitive filtering is performed. If false, filtering is case insensitive.
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of column settings that specifies custom filtering options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridFilteringColumnSetting]] = js.native
  
  /**
    * Event fired after the filtering has been executed and results are rendered.
    */
  var dataFiltered: js.UndefOr[DataFilteredEvent] = js.native
  
  /**
    * Event fired before a filtering operation is executed (remote request or local).
    * Return false in order to cancel filtering operation.
    */
  var dataFiltering: js.UndefOr[DataFilteringEvent] = js.native
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  
  /**
    * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don"t match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don"t match filtering conditions
    *
    */
  var displayMode: js.UndefOr[js.Any] = js.native
  
  /**
    * Event fired after a filter column dropdown is completely closed.
    */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  
  /**
    * Event fired before the filter dropdown starts closing.
    * Return false in order to cancel dropdown closing.
    */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  
  /**
    * Event fired after the filter dropdown is opened for a specific column.
    */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  
  /**
    * Event fired before the filter dropdown is opened for a specific column.
    * Return false in order to cancel dropdown opening.
    */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter is shown and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserText](ui.iggridfiltering#options:locale.featureChooserText).
    */
  var featureChooserText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter [mode](ui.iggridfiltering#options:mode) is advanced. Use option [locale.featureChooserTextAdvancedFilter](ui.iggridfiltering#options:locale.featureChooserTextAdvancedFilter).
    */
  var featureChooserTextAdvancedFilter: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter is hidden and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserTextHide](ui.iggridfiltering#options:locale.featureChooserTextHide).
    */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  
  /**
    * The filtering button for filter dropdowns can be rendered either on the left of the filter editor, or on the right.
    *
    *
    * Valid values:
    * "left" The button is rendered on the left.
    * "right" The button is rendered on the right.
    */
  var filterButtonLocation: js.UndefOr[String] = js.native
  
  /**
    * Time in milliseconds for which widget will wait between keystrokes before sending filtering requests.
    *
    */
  var filterDelay: js.UndefOr[Double] = js.native
  
  /**
    * Add button width - in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The dialog Add button width in pixels (100px).
    * "number" The dialog Add button width in pixels as a number (100).
    */
  var filterDialogAddButtonWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Custom template for options in dropdown in add condition area in the filter dialog. The default template is "<option value='${value}'>${text}</option>"
    * and it is used when [filterDialogAddConditionTemplate](ui.iggridfiltering#options:filterDialogAddConditionTemplate) is applied
    *
    */
  var filterDialogAddConditionDropDownTemplate: js.UndefOr[String] = js.native
  
  /**
    * Custom template for add condition area in the filter dialog. The default template is "<div><span>${label1}</span><div><input></input></div><span>${label2}</span></div>".
    *
    */
  var filterDialogAddConditionTemplate: js.UndefOr[String] = js.native
  
  /**
    * Event fired after the advanced filter dialog has been closed.
    */
  var filterDialogClosed: js.UndefOr[FilterDialogClosedEvent] = js.native
  
  /**
    * Event fired before the advanced filter dialog is closed.
    * Return false in order to cancel filtering dialog closing.
    */
  var filterDialogClosing: js.UndefOr[FilterDialogClosingEvent] = js.native
  
  /**
    * Width of the column chooser dropdowns in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The column chooser dropdowns width in pixels (80px).
    * "number" The column chooser dropdowns width in pixels  as a number (80).
    */
  var filterDialogColumnDropDownDefaultWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Controls containment behavior.
    *
    * owner  The filter dialog will be draggable only within the grid area.
    * window  The filter dialog will be draggable within the whole window area.
    */
  var filterDialogContainment: js.UndefOr[String] = js.native
  
  /**
    * Event fired after the contents of the advanced filter dialog are rendered.
    */
  var filterDialogContentsRendered: js.UndefOr[FilterDialogContentsRenderedEvent] = js.native
  
  /**
    * Event fired before the contents of the advanced filter dialog are rendered.
    * Return false in order to cancel filtering dialog rendering.
    */
  var filterDialogContentsRendering: js.UndefOr[FilterDialogContentsRenderingEvent] = js.native
  
  /**
    * Width of the filtering expression input boxes in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The filtering expression input boxes width in pixels (80px).
    * "number" The filtering expression input boxes width in pixels as a number (80).
    */
  var filterDialogExprInputDefaultWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Event fired after a filter row is added to the advanced filter dialog.
    */
  var filterDialogFilterAdded: js.UndefOr[FilterDialogFilterAddedEvent] = js.native
  
  /**
    * Event fired before a filter row is added to the advanced filter dialog.
    * Return false in order to cancel filter adding to the advanced filtering dialog.
    */
  var filterDialogFilterAdding: js.UndefOr[FilterDialogFilterAddingEvent] = js.native
  
  /**
    * Custom template for options in condition list in filter dialog. The default template is "<option value='${condition}'>${text}</option>"
    * and it is used for custimizing DOM elemenent with attribute "data-af-cond".
    *
    */
  var filterDialogFilterConditionTemplate: js.UndefOr[String] = js.native
  
  /**
    * Width of the filtering condition dropdowns in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The filtering condition dropdowns width in pixels (80px).
    * "number" The filtering condition dropdowns width in pixels as a number (80).
    */
  var filterDialogFilterDropDownDefaultWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Custom template for filter dialog.
    * Each DOM element which is used for selecting filter conditions/columns/filter expressions has "data-*" attribute.
    * E.g.: DOM element used for selecting column has attribute "data-af-col", for selecting filter condition - "data-af-cond", for filter expression- "data-af-expr".
    * NOTE: The template is supported only with <tr />.
    * The default template is "<tr data-af-row><td><input data-af-col/></td><td><input data-af-cond/></td><td><input data-af-expr /> </td><td><span data-af-rmv></span></td></tr>".
    *
    */
  var filterDialogFilterTemplate: js.UndefOr[String] = js.native
  
  /**
    * Event fired when the OK button in the advanced filter dialog is pressed.
    */
  var filterDialogFiltering: js.UndefOr[FilterDialogFilteringEvent] = js.native
  
  /**
    * default filter dialog height (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
    *
    *
    * Valid values:
    * "string" The dialog window height in pixels (350px).
    * "number" The dialog window height in pixels as a number (350).
    */
  var filterDialogHeight: js.UndefOr[String | Double] = js.native
  
  /**
    * Maximum number of filter rows in the advanced filtering dialog. If this number is exceeded, an error message will be rendered.
    *
    */
  var filterDialogMaxFilterCount: js.UndefOr[Double] = js.native
  
  /**
    * Event fired every time the advanced filter dialog changes its position.
    */
  var filterDialogMoving: js.UndefOr[FilterDialogMovingEvent] = js.native
  
  /**
    * Width of the Ok and Cancel buttons in the advanced filtering dialogs.
    *
    *
    * Valid values:
    * "string" The advanced filter dialog Ok and Cancel buttons width in pixels (120px).
    * "number" The advanced filter dialog Ok and Cancel buttons width in pixels as a number (120).
    */
  var filterDialogOkCancelButtonWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Event fired after the advanced filter dialog is already opened.
    */
  var filterDialogOpened: js.UndefOr[FilterDialogOpenedEvent] = js.native
  
  /**
    * Event fired before the advanced filtering dialog is opened.
    * Return false in order to cancel filter dialog opening.
    */
  var filterDialogOpening: js.UndefOr[FilterDialogOpeningEvent] = js.native
  
  /**
    * Default filter dialog width (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
    *
    *
    * Valid values:
    * "string" The dialog window width in pixels (500px).
    * "number" The dialog window width in pixels as a number (500).
    */
  var filterDialogWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Animation duration in milliseconds for the [filterDropDownAnimations](ui.iggridfiltering#options:filterDropDownAnimations).
    *
    */
  var filterDropDownAnimationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Type of animations for the column filter dropdowns.
    *
    *
    * Valid values:
    * "linear" The column filtering drop downs are shown with a linear animation.
    * "none" No animation is used when showing the filtering drop downs.
    */
  var filterDropDownAnimations: js.UndefOr[String] = js.native
  
  /**
    * Height of the column filter dropdowns.
    *
    * string  The height of the column filter dropdowns in pixels (0px).
    * number  The height of the column filter dropdowns in pixels as a number (0).
    */
  var filterDropDownHeight: js.UndefOr[js.Any] = js.native
  
  /**
    * Enable/disable filter icons visibility.
    *
    *
    * Valid values:
    * "true" All predefined filters in the filter dropdowns will have icons rendered in front of the text.
    * "false" No icons will be rendered.
    */
  var filterDropDownItemIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * Width of the column filter dropdowns.
    *
    *
    * Valid values:
    * "string" The width in pixels (0px)
    * "number" The width in pixels as a number (0)
    */
  var filterDropDownWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * URL key name that specifies how the filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
    *
    */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Enable/disable footer visibility with summary info about the filter.
    * When false, the filter summary row (in the footer) will only be visible when paging is enabled (or some other feature that renders a footer).
    * When true, the filter summary row will only be visible when a filter is applied i.e. it's not visible by default.
    *
    */
  var filterSummaryAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Template that is used when filtering is applied and paging is enabled and user goes to another page. It takes precedence over the pagerRecordsLabelTemplate(option from igTreeGridPaging). If it is set to null then it is taken option from igTreeGridPaging.
    * Supported options:
    * ${currentPageMatches} (filtering)
    * ${totalMatches} (filtering)
    * ${startRecord} (paging)
    * ${endRecord} (paging)
    * ${recordCount} (paging)
    * Use option [locale.collapseTooltipText](ui.igtreegrid#options:locale.collapseTooltipText).
    */
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Summary template that will appear in the bottom left corner of the footer. Has the format '${matches} matching records'. Use option [locale.filterSummaryTemplate](ui.iggridfiltering#options:locale.filterSummaryTemplate).
    */
  var filterSummaryTemplate: js.UndefOr[String] = js.native
  
  /**
    * Specifies from which data bound level to be applied filtering - 0 is the first level
    *
    */
  var fromLevel: js.UndefOr[Double] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * A list of configurable and localized labels that are used for the predefined filtering conditions in the filter dropdowns. Use option [locale](ui.iggridfiltering#options:locale).
    */
  var labels: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[IgTreeGridFilteringLocale] = js.native
  
  /**
    * Specifies the name of a boolean property in the dataRecord object that indicates whether the dataRow matches the filtering conditions.
    * When filtering a boolean flag  with the specified name is added on each data record object with a value of true if it matches the condition or false if it doesn"t.
    * This is used mainly for internal purposes.
    *
    */
  var matchFiltering: js.UndefOr[String] = js.native
  
  /**
    * Default is 'simple' for non-virtualized grids, and 'advanced' when [virtualization](ui.iggrid#options:virtualization) is enabled.
    *
    *
    * Valid values:
    * "simple" Renders just a filter row.
    * "advanced" Allows to configure multiple filters from a dialog - Excel style.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * List of configurable and localized null texts that will be used for the filter editors. Use option [locale](ui.iggridfiltering#options:locale).
    */
  var nullTexts: js.UndefOr[String] = js.native
  
  /**
    * Enables/disables filtering persistence between states.
    *
    */
  var persist: js.UndefOr[Boolean] = js.native
  
  /**
    * The property in the response that will hold the total number of records in the data source
    *
    */
  var recordCountKey: js.UndefOr[String] = js.native
  
  /**
    * Render in [Feature Chooser](http://www.igniteui.com/help/iggrid-feature-chooser)
    *
    */
  var renderFC: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable/disable filter button visibility. If false, no filter dropdown buttons will be rendered and a predefined list of filters will not be rendered for the columns.
    *
    */
  var renderFilterButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable/disable empty condition visibility in the filter. If true, shows empty and not empty filtering conditions in the dropdowns.
    *
    */
  var showEmptyConditions: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable/disable visibility of null and not null filtering conditions in the dropdowns. If true, shows null and not null filtering conditions in the dropdowns.
    *
    */
  var showNullConditions: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
    *
    */
  var toLevel: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Custom tooltip template for the filter button, when a filter is applied. Use option [locale.tooltipTemplate](ui.iggridfiltering#options:locale.tooltipTemplate).
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  
  /**
    * Type of filtering. Delegates all filtering functionality to the [$.ig.DataSource](ig.datasource).
    *
    *
    * Valid values:
    * "remote" Filtering is performed by a remote end-point.
    * "local" Filtering is performed locally by the [$.ig.DataSource](ig.datasource).
    */
  var `type`: js.UndefOr[String] = js.native
}
object IgTreeGridFiltering {
  
  @scala.inline
  def apply(): IgTreeGridFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFiltering]
  }
  
  @scala.inline
  implicit class IgTreeGridFilteringMutableBuilder[Self <: IgTreeGridFiltering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedModeEditorsVisible(value: Boolean): Self = StObject.set(x, "advancedModeEditorsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedModeEditorsVisibleUndefined: Self = StObject.set(x, "advancedModeEditorsVisible", js.undefined)
    
    @scala.inline
    def setAdvancedModeHeaderButtonLocation(value: String): Self = StObject.set(x, "advancedModeHeaderButtonLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedModeHeaderButtonLocationUndefined: Self = StObject.set(x, "advancedModeHeaderButtonLocation", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridFilteringColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridFilteringColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setDataFiltered(value: (/* event */ Event, /* ui */ DataFilteredEventUIParam) => Unit): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
    
    @scala.inline
    def setDataFiltering(value: (/* event */ Event, /* ui */ DataFilteringEventUIParam) => Unit): Self = StObject.set(x, "dataFiltering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataFilteringUndefined: Self = StObject.set(x, "dataFiltering", js.undefined)
    
    @scala.inline
    def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: js.Any): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = StObject.set(x, "dropDownClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownClosedUndefined: Self = StObject.set(x, "dropDownClosed", js.undefined)
    
    @scala.inline
    def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = StObject.set(x, "dropDownClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownClosingUndefined: Self = StObject.set(x, "dropDownClosing", js.undefined)
    
    @scala.inline
    def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = StObject.set(x, "dropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownOpenedUndefined: Self = StObject.set(x, "dropDownOpened", js.undefined)
    
    @scala.inline
    def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = StObject.set(x, "dropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownOpeningUndefined: Self = StObject.set(x, "dropDownOpening", js.undefined)
    
    @scala.inline
    def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextAdvancedFilter(value: String): Self = StObject.set(x, "featureChooserTextAdvancedFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextAdvancedFilterUndefined: Self = StObject.set(x, "featureChooserTextAdvancedFilter", js.undefined)
    
    @scala.inline
    def setFeatureChooserTextHide(value: String): Self = StObject.set(x, "featureChooserTextHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextHideUndefined: Self = StObject.set(x, "featureChooserTextHide", js.undefined)
    
    @scala.inline
    def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    @scala.inline
    def setFilterButtonLocation(value: String): Self = StObject.set(x, "filterButtonLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterButtonLocationUndefined: Self = StObject.set(x, "filterButtonLocation", js.undefined)
    
    @scala.inline
    def setFilterDelay(value: Double): Self = StObject.set(x, "filterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDelayUndefined: Self = StObject.set(x, "filterDelay", js.undefined)
    
    @scala.inline
    def setFilterDialogAddButtonWidth(value: String | Double): Self = StObject.set(x, "filterDialogAddButtonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogAddButtonWidthUndefined: Self = StObject.set(x, "filterDialogAddButtonWidth", js.undefined)
    
    @scala.inline
    def setFilterDialogAddConditionDropDownTemplate(value: String): Self = StObject.set(x, "filterDialogAddConditionDropDownTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogAddConditionDropDownTemplateUndefined: Self = StObject.set(x, "filterDialogAddConditionDropDownTemplate", js.undefined)
    
    @scala.inline
    def setFilterDialogAddConditionTemplate(value: String): Self = StObject.set(x, "filterDialogAddConditionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogAddConditionTemplateUndefined: Self = StObject.set(x, "filterDialogAddConditionTemplate", js.undefined)
    
    @scala.inline
    def setFilterDialogClosed(value: (/* event */ Event, /* ui */ FilterDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "filterDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogClosedUndefined: Self = StObject.set(x, "filterDialogClosed", js.undefined)
    
    @scala.inline
    def setFilterDialogClosing(value: (/* event */ Event, /* ui */ FilterDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "filterDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogClosingUndefined: Self = StObject.set(x, "filterDialogClosing", js.undefined)
    
    @scala.inline
    def setFilterDialogColumnDropDownDefaultWidth(value: String | Double): Self = StObject.set(x, "filterDialogColumnDropDownDefaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogColumnDropDownDefaultWidthUndefined: Self = StObject.set(x, "filterDialogColumnDropDownDefaultWidth", js.undefined)
    
    @scala.inline
    def setFilterDialogContainment(value: String): Self = StObject.set(x, "filterDialogContainment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogContainmentUndefined: Self = StObject.set(x, "filterDialogContainment", js.undefined)
    
    @scala.inline
    def setFilterDialogContentsRendered(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "filterDialogContentsRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogContentsRenderedUndefined: Self = StObject.set(x, "filterDialogContentsRendered", js.undefined)
    
    @scala.inline
    def setFilterDialogContentsRendering(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "filterDialogContentsRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogContentsRenderingUndefined: Self = StObject.set(x, "filterDialogContentsRendering", js.undefined)
    
    @scala.inline
    def setFilterDialogExprInputDefaultWidth(value: String | Double): Self = StObject.set(x, "filterDialogExprInputDefaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogExprInputDefaultWidthUndefined: Self = StObject.set(x, "filterDialogExprInputDefaultWidth", js.undefined)
    
    @scala.inline
    def setFilterDialogFilterAdded(value: (/* event */ Event, /* ui */ FilterDialogFilterAddedEventUIParam) => Unit): Self = StObject.set(x, "filterDialogFilterAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogFilterAddedUndefined: Self = StObject.set(x, "filterDialogFilterAdded", js.undefined)
    
    @scala.inline
    def setFilterDialogFilterAdding(value: (/* event */ Event, /* ui */ FilterDialogFilterAddingEventUIParam) => Unit): Self = StObject.set(x, "filterDialogFilterAdding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogFilterAddingUndefined: Self = StObject.set(x, "filterDialogFilterAdding", js.undefined)
    
    @scala.inline
    def setFilterDialogFilterConditionTemplate(value: String): Self = StObject.set(x, "filterDialogFilterConditionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogFilterConditionTemplateUndefined: Self = StObject.set(x, "filterDialogFilterConditionTemplate", js.undefined)
    
    @scala.inline
    def setFilterDialogFilterDropDownDefaultWidth(value: String | Double): Self = StObject.set(x, "filterDialogFilterDropDownDefaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogFilterDropDownDefaultWidthUndefined: Self = StObject.set(x, "filterDialogFilterDropDownDefaultWidth", js.undefined)
    
    @scala.inline
    def setFilterDialogFilterTemplate(value: String): Self = StObject.set(x, "filterDialogFilterTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogFilterTemplateUndefined: Self = StObject.set(x, "filterDialogFilterTemplate", js.undefined)
    
    @scala.inline
    def setFilterDialogFiltering(value: (/* event */ Event, /* ui */ FilterDialogFilteringEventUIParam) => Unit): Self = StObject.set(x, "filterDialogFiltering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogFilteringUndefined: Self = StObject.set(x, "filterDialogFiltering", js.undefined)
    
    @scala.inline
    def setFilterDialogHeight(value: String | Double): Self = StObject.set(x, "filterDialogHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogHeightUndefined: Self = StObject.set(x, "filterDialogHeight", js.undefined)
    
    @scala.inline
    def setFilterDialogMaxFilterCount(value: Double): Self = StObject.set(x, "filterDialogMaxFilterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogMaxFilterCountUndefined: Self = StObject.set(x, "filterDialogMaxFilterCount", js.undefined)
    
    @scala.inline
    def setFilterDialogMoving(value: (/* event */ Event, /* ui */ FilterDialogMovingEventUIParam) => Unit): Self = StObject.set(x, "filterDialogMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogMovingUndefined: Self = StObject.set(x, "filterDialogMoving", js.undefined)
    
    @scala.inline
    def setFilterDialogOkCancelButtonWidth(value: String | Double): Self = StObject.set(x, "filterDialogOkCancelButtonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogOkCancelButtonWidthUndefined: Self = StObject.set(x, "filterDialogOkCancelButtonWidth", js.undefined)
    
    @scala.inline
    def setFilterDialogOpened(value: (/* event */ Event, /* ui */ FilterDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "filterDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogOpenedUndefined: Self = StObject.set(x, "filterDialogOpened", js.undefined)
    
    @scala.inline
    def setFilterDialogOpening(value: (/* event */ Event, /* ui */ FilterDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "filterDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDialogOpeningUndefined: Self = StObject.set(x, "filterDialogOpening", js.undefined)
    
    @scala.inline
    def setFilterDialogWidth(value: String | Double): Self = StObject.set(x, "filterDialogWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDialogWidthUndefined: Self = StObject.set(x, "filterDialogWidth", js.undefined)
    
    @scala.inline
    def setFilterDropDownAnimationDuration(value: Double): Self = StObject.set(x, "filterDropDownAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropDownAnimationDurationUndefined: Self = StObject.set(x, "filterDropDownAnimationDuration", js.undefined)
    
    @scala.inline
    def setFilterDropDownAnimations(value: String): Self = StObject.set(x, "filterDropDownAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropDownAnimationsUndefined: Self = StObject.set(x, "filterDropDownAnimations", js.undefined)
    
    @scala.inline
    def setFilterDropDownHeight(value: js.Any): Self = StObject.set(x, "filterDropDownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropDownHeightUndefined: Self = StObject.set(x, "filterDropDownHeight", js.undefined)
    
    @scala.inline
    def setFilterDropDownItemIcons(value: Boolean): Self = StObject.set(x, "filterDropDownItemIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropDownItemIconsUndefined: Self = StObject.set(x, "filterDropDownItemIcons", js.undefined)
    
    @scala.inline
    def setFilterDropDownWidth(value: String | Double): Self = StObject.set(x, "filterDropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropDownWidthUndefined: Self = StObject.set(x, "filterDropDownWidth", js.undefined)
    
    @scala.inline
    def setFilterExprUrlKey(value: String): Self = StObject.set(x, "filterExprUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExprUrlKeyUndefined: Self = StObject.set(x, "filterExprUrlKey", js.undefined)
    
    @scala.inline
    def setFilterSummaryAlwaysVisible(value: Boolean): Self = StObject.set(x, "filterSummaryAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSummaryAlwaysVisibleUndefined: Self = StObject.set(x, "filterSummaryAlwaysVisible", js.undefined)
    
    @scala.inline
    def setFilterSummaryInPagerTemplate(value: String): Self = StObject.set(x, "filterSummaryInPagerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSummaryInPagerTemplateUndefined: Self = StObject.set(x, "filterSummaryInPagerTemplate", js.undefined)
    
    @scala.inline
    def setFilterSummaryTemplate(value: String): Self = StObject.set(x, "filterSummaryTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSummaryTemplateUndefined: Self = StObject.set(x, "filterSummaryTemplate", js.undefined)
    
    @scala.inline
    def setFromLevel(value: Double): Self = StObject.set(x, "fromLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromLevelUndefined: Self = StObject.set(x, "fromLevel", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocale(value: IgTreeGridFilteringLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMatchFiltering(value: String): Self = StObject.set(x, "matchFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchFilteringUndefined: Self = StObject.set(x, "matchFiltering", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNullTexts(value: String): Self = StObject.set(x, "nullTexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullTextsUndefined: Self = StObject.set(x, "nullTexts", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setRecordCountKey(value: String): Self = StObject.set(x, "recordCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountKeyUndefined: Self = StObject.set(x, "recordCountKey", js.undefined)
    
    @scala.inline
    def setRenderFC(value: Boolean): Self = StObject.set(x, "renderFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFCUndefined: Self = StObject.set(x, "renderFC", js.undefined)
    
    @scala.inline
    def setRenderFilterButton(value: Boolean): Self = StObject.set(x, "renderFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFilterButtonUndefined: Self = StObject.set(x, "renderFilterButton", js.undefined)
    
    @scala.inline
    def setShowEmptyConditions(value: Boolean): Self = StObject.set(x, "showEmptyConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEmptyConditionsUndefined: Self = StObject.set(x, "showEmptyConditions", js.undefined)
    
    @scala.inline
    def setShowNullConditions(value: Boolean): Self = StObject.set(x, "showNullConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNullConditionsUndefined: Self = StObject.set(x, "showNullConditions", js.undefined)
    
    @scala.inline
    def setToLevel(value: Double): Self = StObject.set(x, "toLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLevelUndefined: Self = StObject.set(x, "toLevel", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
