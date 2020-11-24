package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotDataSelector
  extends /**
  * Option for JSONPDataSourceSettings
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
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  
  /**
    * Fired after the data selector is rendered. Changing the data source instance will re-render the data selector.
    */
  var dataSelectorRendered: js.UndefOr[DataSelectorRenderedEvent] = js.native
  
  /**
    * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the data source has initialized.
    */
  var dataSourceInitialized: js.UndefOr[DataSourceInitializedEvent] = js.native
  
  /**
    * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
    *
    */
  var dataSourceOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptions] = js.native
  
  /**
    * Fired after the data source has updated.
    */
  var dataSourceUpdated: js.UndefOr[DataSourceUpdatedEvent] = js.native
  
  /**
    * Setting deferUpdate to true will not apply changes to the data source until the update method is called or the update layout button is clicked.
    *
    */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired when the defer update checkbox changes.
    */
  var deferUpdateChanged: js.UndefOr[DeferUpdateChangedEvent] = js.native
  
  /**
    * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired on drag. Return false to cancel the dragging.
    */
  var drag: js.UndefOr[DragEvent] = js.native
  
  /**
    * Settings for the drag and drop functionality of the igPivotDataSelector.
    *
    */
  var dragAndDropSettings: js.UndefOr[IgPivotDataSelectorDragAndDropSettings] = js.native
  
  /**
    * Fired on drag start. Return false to cancel the drag.
    */
  var dragStart: js.UndefOr[DragStartEvent] = js.native
  
  /**
    * Fired on drag stop.
    */
  var dragStop: js.UndefOr[DragStopEvent] = js.native
  
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the filter members drop down closes.
    */
  var filterDropDownClosed: js.UndefOr[FilterDropDownClosedEvent] = js.native
  
  /**
    * Fired before the filter members drop down closes. Return false to cancel the closing.
    */
  var filterDropDownClosing: js.UndefOr[FilterDropDownClosingEvent] = js.native
  
  /**
    * Fired after the OK button in the filter members drop down is clicked. Return false to cancel the applying of the filters.
    */
  var filterDropDownOk: js.UndefOr[FilterDropDownOkEvent] = js.native
  
  /**
    * Fired after the filter members drop down opens.
    */
  var filterDropDownOpened: js.UndefOr[FilterDropDownOpenedEvent] = js.native
  
  /**
    * Fired before the filter members drop down opens. Return false to cancel the opening.
    */
  var filterDropDownOpening: js.UndefOr[FilterDropDownOpeningEvent] = js.native
  
  /**
    * Fired after the filter members are loaded.
    */
  var filterMembersLoaded: js.UndefOr[FilterMembersLoadedEvent] = js.native
  
  /**
    * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row -  (if any), etc.
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number.
    * "null" will stretch vertically to fit data, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after a metadata item drop.
    */
  var metadataDropped: js.UndefOr[MetadataDroppedEvent] = js.native
  
  /**
    * Fired before a metadata item drop. Return false to cancel the drop.
    */
  var metadataDropping: js.UndefOr[MetadataDroppingEvent] = js.native
  
  /**
    * Fired after a metadata item is removed when the user clicks the close icon.
    */
  var metadataRemoved: js.UndefOr[MetadataRemovedEvent] = js.native
  
  /**
    * Fired before a metadata item is removed when the user clicks the close icon. Return false to cancel the removing.
    */
  var metadataRemoving: js.UndefOr[MetadataRemovingEvent] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%). The recommended width is 250px.
    * "number" The widget width can be set as a number.
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgPivotDataSelector {
  
  @scala.inline
  def apply(): IgPivotDataSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelector]
  }
  
  @scala.inline
  implicit class IgPivotDataSelectorOps[Self <: IgPivotDataSelector] (val x: Self) extends AnyVal {
    
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
    def setCustomMoveValidation(value: js.Function): Self = this.set("customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMoveValidation: Self = this.set("customMoveValidation", js.undefined)
    
    @scala.inline
    def setDataSelectorRendered(value: (/* event */ Event, /* ui */ DataSelectorRenderedEventUIParam) => Unit): Self = this.set("dataSelectorRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataSelectorRendered: Self = this.set("dataSelectorRendered", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceInitialized(value: (/* event */ Event, /* ui */ DataSourceInitializedEventUIParam) => Unit): Self = this.set("dataSourceInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataSourceInitialized: Self = this.set("dataSourceInitialized", js.undefined)
    
    @scala.inline
    def setDataSourceOptions(value: IgPivotDataSelectorDataSourceOptions): Self = this.set("dataSourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceOptions: Self = this.set("dataSourceOptions", js.undefined)
    
    @scala.inline
    def setDataSourceUpdated(value: (/* event */ Event, /* ui */ DataSourceUpdatedEventUIParam) => Unit): Self = this.set("dataSourceUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataSourceUpdated: Self = this.set("dataSourceUpdated", js.undefined)
    
    @scala.inline
    def setDeferUpdate(value: Boolean): Self = this.set("deferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferUpdate: Self = this.set("deferUpdate", js.undefined)
    
    @scala.inline
    def setDeferUpdateChanged(value: (/* event */ Event, /* ui */ DeferUpdateChangedEventUIParam) => Unit): Self = this.set("deferUpdateChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeferUpdateChanged: Self = this.set("deferUpdateChanged", js.undefined)
    
    @scala.inline
    def setDisableColumnsDropArea(value: Boolean): Self = this.set("disableColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableColumnsDropArea: Self = this.set("disableColumnsDropArea", js.undefined)
    
    @scala.inline
    def setDisableFiltersDropArea(value: Boolean): Self = this.set("disableFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFiltersDropArea: Self = this.set("disableFiltersDropArea", js.undefined)
    
    @scala.inline
    def setDisableMeasuresDropArea(value: Boolean): Self = this.set("disableMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMeasuresDropArea: Self = this.set("disableMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setDisableRowsDropArea(value: Boolean): Self = this.set("disableRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRowsDropArea: Self = this.set("disableRowsDropArea", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotDataSelectorDragAndDropSettings): Self = this.set("dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragAndDropSettings: Self = this.set("dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDragStart(value: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit): Self = this.set("dragStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = this.set("dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownParent: Self = this.set("dropDownParent", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosed(value: (/* event */ Event, /* ui */ FilterDropDownClosedEventUIParam) => Unit): Self = this.set("filterDropDownClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownClosed: Self = this.set("filterDropDownClosed", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosing(value: (/* event */ Event, /* ui */ FilterDropDownClosingEventUIParam) => Unit): Self = this.set("filterDropDownClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownClosing: Self = this.set("filterDropDownClosing", js.undefined)
    
    @scala.inline
    def setFilterDropDownOk(value: (/* event */ Event, /* ui */ FilterDropDownOkEventUIParam) => Unit): Self = this.set("filterDropDownOk", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownOk: Self = this.set("filterDropDownOk", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpened(value: (/* event */ Event, /* ui */ FilterDropDownOpenedEventUIParam) => Unit): Self = this.set("filterDropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownOpened: Self = this.set("filterDropDownOpened", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpening(value: (/* event */ Event, /* ui */ FilterDropDownOpeningEventUIParam) => Unit): Self = this.set("filterDropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownOpening: Self = this.set("filterDropDownOpening", js.undefined)
    
    @scala.inline
    def setFilterMembersLoaded(value: (/* event */ Event, /* ui */ FilterMembersLoadedEventUIParam) => Unit): Self = this.set("filterMembersLoaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterMembersLoaded: Self = this.set("filterMembersLoaded", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMetadataDropped(value: (/* event */ Event, /* ui */ MetadataDroppedEventUIParam) => Unit): Self = this.set("metadataDropped", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataDropped: Self = this.set("metadataDropped", js.undefined)
    
    @scala.inline
    def setMetadataDropping(value: (/* event */ Event, /* ui */ MetadataDroppingEventUIParam) => Unit): Self = this.set("metadataDropping", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataDropping: Self = this.set("metadataDropping", js.undefined)
    
    @scala.inline
    def setMetadataRemoved(value: (/* event */ Event, /* ui */ MetadataRemovedEventUIParam) => Unit): Self = this.set("metadataRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataRemoved: Self = this.set("metadataRemoved", js.undefined)
    
    @scala.inline
    def setMetadataRemoving(value: (/* event */ Event, /* ui */ MetadataRemovingEventUIParam) => Unit): Self = this.set("metadataRemoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataRemoving: Self = this.set("metadataRemoving", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
