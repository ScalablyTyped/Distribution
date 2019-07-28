package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelector
  extends /**
	 * Option for igPivotDataSelector
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A function that will be called to determine if an item can be moved in or dropped on an area of the data selector.
  	 *
  	 * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
  	 * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
  	 * paramType="string" The unique name of the item.
  	 * returnType="bool"  The function must return true if the item should be accepted.
  	 */
  var customMoveValidation: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Fired after the data selector is rendered. Changing the data source instance will re-render the data selector.
  	 */
  var dataSelectorRendered: js.UndefOr[DataSelectorRenderedEvent] = js.undefined
  /**
  	 * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the data source has initialized.
  	 */
  var dataSourceInitialized: js.UndefOr[DataSourceInitializedEvent] = js.undefined
  /**
  	 * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
  	 *
  	 */
  var dataSourceOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptions] = js.undefined
  /**
  	 * Fired after the data source has updated.
  	 */
  var dataSourceUpdated: js.UndefOr[DataSourceUpdatedEvent] = js.undefined
  /**
  	 * Setting deferUpdate to true will not apply changes to the data source until the update method is called or the update layout button is clicked.
  	 *
  	 */
  var deferUpdate: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired when the defer update checkbox changes.
  	 */
  var deferUpdateChanged: js.UndefOr[DeferUpdateChangedEvent] = js.undefined
  /**
  	 * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired on drag. Return false to cancel the dragging.
  	 */
  var drag: js.UndefOr[DragEvent] = js.undefined
  /**
  	 * Settings for the drag and drop functionality of the igPivotDataSelector.
  	 *
  	 */
  var dragAndDropSettings: js.UndefOr[IgPivotDataSelectorDragAndDropSettings] = js.undefined
  /**
  	 * Fired on drag start. Return false to cancel the drag.
  	 */
  var dragStart: js.UndefOr[DragStartEvent] = js.undefined
  /**
  	 * Fired on drag stop.
  	 */
  var dragStop: js.UndefOr[DragStopEvent] = js.undefined
  /**
  	 * Specifies the parent for the drop downs.
  	 */
  var dropDownParent: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the filter members drop down closes.
  	 */
  var filterDropDownClosed: js.UndefOr[FilterDropDownClosedEvent] = js.undefined
  /**
  	 * Fired before the filter members drop down closes. Return false to cancel the closing.
  	 */
  var filterDropDownClosing: js.UndefOr[FilterDropDownClosingEvent] = js.undefined
  /**
  	 * Fired after the OK button in the filter members drop down is clicked. Return false to cancel the applying of the filters.
  	 */
  var filterDropDownOk: js.UndefOr[FilterDropDownOkEvent] = js.undefined
  /**
  	 * Fired after the filter members drop down opens.
  	 */
  var filterDropDownOpened: js.UndefOr[FilterDropDownOpenedEvent] = js.undefined
  /**
  	 * Fired before the filter members drop down opens. Return false to cancel the opening.
  	 */
  var filterDropDownOpening: js.UndefOr[FilterDropDownOpeningEvent] = js.undefined
  /**
  	 * Fired after the filter members are loaded.
  	 */
  var filterMembersLoaded: js.UndefOr[FilterMembersLoadedEvent] = js.undefined
  /**
  	 * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row -  (if any), etc.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number.
  	 * "null" will stretch vertically to fit data, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after a metadata item drop.
  	 */
  var metadataDropped: js.UndefOr[MetadataDroppedEvent] = js.undefined
  /**
  	 * Fired before a metadata item drop. Return false to cancel the drop.
  	 */
  var metadataDropping: js.UndefOr[MetadataDroppingEvent] = js.undefined
  /**
  	 * Fired after a metadata item is removed when the user clicks the close icon.
  	 */
  var metadataRemoved: js.UndefOr[MetadataRemovedEvent] = js.undefined
  /**
  	 * Fired before a metadata item is removed when the user clicks the close icon. Return false to cancel the removing.
  	 */
  var metadataRemoving: js.UndefOr[MetadataRemovingEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%). The recommended width is 250px.
  	 * "number" The widget width can be set as a number.
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgPivotDataSelector {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igPivotDataSelector
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    customMoveValidation: js.Function = null,
    dataSelectorRendered: DataSelectorRenderedEvent = null,
    dataSource: js.Any = null,
    dataSourceInitialized: DataSourceInitializedEvent = null,
    dataSourceOptions: IgPivotDataSelectorDataSourceOptions = null,
    dataSourceUpdated: DataSourceUpdatedEvent = null,
    deferUpdate: js.UndefOr[Boolean] = js.undefined,
    deferUpdateChanged: DeferUpdateChangedEvent = null,
    disableColumnsDropArea: js.UndefOr[Boolean] = js.undefined,
    disableFiltersDropArea: js.UndefOr[Boolean] = js.undefined,
    disableMeasuresDropArea: js.UndefOr[Boolean] = js.undefined,
    disableRowsDropArea: js.UndefOr[Boolean] = js.undefined,
    drag: DragEvent = null,
    dragAndDropSettings: IgPivotDataSelectorDragAndDropSettings = null,
    dragStart: DragStartEvent = null,
    dragStop: DragStopEvent = null,
    dropDownParent: js.Any = null,
    filterDropDownClosed: FilterDropDownClosedEvent = null,
    filterDropDownClosing: FilterDropDownClosingEvent = null,
    filterDropDownOk: FilterDropDownOkEvent = null,
    filterDropDownOpened: FilterDropDownOpenedEvent = null,
    filterDropDownOpening: FilterDropDownOpeningEvent = null,
    filterMembersLoaded: FilterMembersLoadedEvent = null,
    height: String | Double = null,
    language: String = null,
    locale: js.Any = null,
    metadataDropped: MetadataDroppedEvent = null,
    metadataDropping: MetadataDroppingEvent = null,
    metadataRemoved: MetadataRemovedEvent = null,
    metadataRemoving: MetadataRemovingEvent = null,
    regional: String | js.Object = null,
    width: String | Double = null
  ): IgPivotDataSelector = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (customMoveValidation != null) __obj.updateDynamic("customMoveValidation")(customMoveValidation)
    if (dataSelectorRendered != null) __obj.updateDynamic("dataSelectorRendered")(dataSelectorRendered)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceInitialized != null) __obj.updateDynamic("dataSourceInitialized")(dataSourceInitialized)
    if (dataSourceOptions != null) __obj.updateDynamic("dataSourceOptions")(dataSourceOptions)
    if (dataSourceUpdated != null) __obj.updateDynamic("dataSourceUpdated")(dataSourceUpdated)
    if (!js.isUndefined(deferUpdate)) __obj.updateDynamic("deferUpdate")(deferUpdate)
    if (deferUpdateChanged != null) __obj.updateDynamic("deferUpdateChanged")(deferUpdateChanged)
    if (!js.isUndefined(disableColumnsDropArea)) __obj.updateDynamic("disableColumnsDropArea")(disableColumnsDropArea)
    if (!js.isUndefined(disableFiltersDropArea)) __obj.updateDynamic("disableFiltersDropArea")(disableFiltersDropArea)
    if (!js.isUndefined(disableMeasuresDropArea)) __obj.updateDynamic("disableMeasuresDropArea")(disableMeasuresDropArea)
    if (!js.isUndefined(disableRowsDropArea)) __obj.updateDynamic("disableRowsDropArea")(disableRowsDropArea)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragAndDropSettings != null) __obj.updateDynamic("dragAndDropSettings")(dragAndDropSettings)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (dragStop != null) __obj.updateDynamic("dragStop")(dragStop)
    if (dropDownParent != null) __obj.updateDynamic("dropDownParent")(dropDownParent)
    if (filterDropDownClosed != null) __obj.updateDynamic("filterDropDownClosed")(filterDropDownClosed)
    if (filterDropDownClosing != null) __obj.updateDynamic("filterDropDownClosing")(filterDropDownClosing)
    if (filterDropDownOk != null) __obj.updateDynamic("filterDropDownOk")(filterDropDownOk)
    if (filterDropDownOpened != null) __obj.updateDynamic("filterDropDownOpened")(filterDropDownOpened)
    if (filterDropDownOpening != null) __obj.updateDynamic("filterDropDownOpening")(filterDropDownOpening)
    if (filterMembersLoaded != null) __obj.updateDynamic("filterMembersLoaded")(filterMembersLoaded)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (metadataDropped != null) __obj.updateDynamic("metadataDropped")(metadataDropped)
    if (metadataDropping != null) __obj.updateDynamic("metadataDropping")(metadataDropping)
    if (metadataRemoved != null) __obj.updateDynamic("metadataRemoved")(metadataRemoved)
    if (metadataRemoving != null) __obj.updateDynamic("metadataRemoving")(metadataRemoving)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotDataSelector]
  }
}

