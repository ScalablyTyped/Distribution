package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTree
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the duration of each animation such as the expand/collapse.
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Gets the data binding properties and keys. The igTree uses these to extract the corresponding data from the dataSource.
    *
    */
  var bindings: js.UndefOr[IgTreeBindings] = js.native
  /**
    * Gets the behavior and type of the checkboxes rendered for the tree nodes. Can be set only at initialization.
    *
    *
    * Valid values:
    * "off" Checkboxes are turned off and are not rendered for the tree.
    * "biState" Checkboxes are rendered and support two states (checked and unchecked). Checkboxes do not cascade down or up in this mode.
    * "triState" Checkboxes are rendered and support three states (checked, partial and unchecked). Checkboxes cascade up and down in this mode.
    */
  var checkboxMode: js.UndefOr[String] = js.native
  /**
    * Fired before databinding is performed.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
    * Fired after databinding is finished.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
    * Gets/Sets the igTree data source. Accepts any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
    * Once the data source is initialized, this option becomes an instance of the $.ig.HierarchicalDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Gets the type of the data source. Delegates the value to [$.ig.DataSource.settings.type](ig.datasource#options:settings.type). Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource.settings.type.
    *
    *
    * Valid values:
    * "string" Specifies the data source type implicitly.
    * "null" Type is inferred.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * Gets/Sets a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
    *
    *
    * Valid values:
    * "string" Specifies the remote url.
    * "null" Option is ignored.
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
    * Gets the default target attribute value for the node anchors.
    *
    */
  var defaultNodeTarget: js.UndefOr[String] = js.native
  /**
    * Fired on node drag.
    */
  var drag: js.UndefOr[DragEvent] = js.native
  /**
    * Gets/Sets whether drag and drop functionality is enabled.
    *
    */
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets specific settings for the drag and drop functionality.
    *
    */
  var dragAndDropSettings: js.UndefOr[IgTreeDragAndDropSettings] = js.native
  /**
    * Fired on node drag start.
    */
  var dragStart: js.UndefOr[DragStartEvent] = js.native
  /**
    * Fired after a drag operation has completed.
    */
  var dragStop: js.UndefOr[DragStopEvent] = js.native
  /**
    * Gets/Sets how the height of of the control container.
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number in pixels.
    * "null" No height will be applied to the container and it will be rendered default for the browser rendering engine.
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Gets/Sets whether nodes are hoverable. Setting this option to false would make the tree to not apply hover styles on the nodes when they are hovered.
    *
    */
  var hotTracking: js.UndefOr[Boolean] = js.native
  /**
    * Gets the initial depth the igTree is going to be expanded to upon initial render.
    *
    */
  var initialExpandDepth: js.UndefOr[Double] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the CSS class applied to all leaf nodes.
    *
    *
    * Valid values:
    * "string" Specified class with a CSS sprite that would be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
    * "null" Option is ignored
    */
  var leafNodeImageClass: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the tooltip applied to all leaf node images.
    *
    *
    * Valid values:
    * "string" Specified a tooltip that would be rendered for each node that has no children.
    * "null" Option is ignored
    */
  var leafNodeImageTooltip: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the image url applied to all leaf nodes.
    *
    *
    * Valid values:
    * "string" Image with the specified URL will be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
    * "null" Option is ignored
    */
  var leafNodeImageUrl: js.UndefOr[String] = js.native
  /**
    * Gets whether all the data would be bound initially or each child collection would be bound upon expand.
    *
    */
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Fired after the checkstate of a node is changed.
    */
  var nodeCheckstateChanged: js.UndefOr[NodeCheckstateChangedEvent] = js.native
  /**
    * Fired before the checkbox state of a node is changed.
    */
  var nodeCheckstateChanging: js.UndefOr[NodeCheckstateChangingEvent] = js.native
  /**
    * Fired on node click.
    */
  var nodeClick: js.UndefOr[NodeClickEvent] = js.native
  /**
    * Fired after a node is collapsed.
    */
  var nodeCollapsed: js.UndefOr[NodeCollapsedEvent] = js.native
  /**
    * Fired before a node is collapsed.
    */
  var nodeCollapsing: js.UndefOr[NodeCollapsingEvent] = js.native
  /**
    * Fired on node double click.
    */
  var nodeDoubleClick: js.UndefOr[NodeDoubleClickEvent] = js.native
  /**
    * Fired after a node is dropped.
    */
  var nodeDropped: js.UndefOr[NodeDroppedEvent] = js.native
  /**
    * Fired before a node is dropped.
    */
  var nodeDropping: js.UndefOr[NodeDroppingEvent] = js.native
  /**
    * Fired after a node is expanded.
    */
  var nodeExpanded: js.UndefOr[NodeExpandedEvent] = js.native
  /**
    * Fired before a node is expanded.
    */
  var nodeExpanding: js.UndefOr[NodeExpandingEvent] = js.native
  /**
    * Fired after the children of a node are populated in the case of load on demand.
    */
  var nodePopulated: js.UndefOr[NodePopulatedEvent] = js.native
  /**
    * Fired before the children of a node are populated in the case of load on demand.
    */
  var nodePopulating: js.UndefOr[NodePopulatingEvent] = js.native
  /**
    * Gets/Sets the CSS class applied to all parent nodes.
    *
    *
    * Valid values:
    * "string" Specified class with a CSS sprite that would be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
    * "null" Option is ignored
    */
  var parentNodeImageClass: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the tooltip applied to all parent node images.
    *
    *
    * Valid values:
    * "string" Specified a tooltip that would be rendered for each node that has children.
    * "null" Option is ignored
    */
  var parentNodeImageTooltip: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the image url applied to all parent nodes.
    *
    *
    * Valid values:
    * "string" Image with the specified URL will be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
    * "null" Option is ignored
    */
  var parentNodeImageUrl: js.UndefOr[String] = js.native
  /**
    * Gets the node data-path attribute separator character.
    *
    */
  var pathSeparator: js.UndefOr[String] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Fired after rendering of the tree has finished.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
    * Fired before rendering of the tree begins.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
    * Gets the HTTP verb used for remote requests. Specifies the HTTP verb to be used to issue the requests to the [dataSourceUrl](ui.igtree#options:dataSourceUrl).
    *
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * Gets the type of the content in a remote data source response. Content type of the response from the [dataSourceUrl](ui.igtree#options:dataSourceUrl). See http://api.jquery.com/jQuery.ajax/ => contentType
    *
    */
  var responseContentType: js.UndefOr[String] = js.native
  /**
    * Gets the JSON key at which a remote data source will write the data. Delegates the value to [$.ig.DataSource.settings.responseDataKey](ig.datasource#options:settings.responseDataKey). Please refer to the documentation of $.ig.DataSource.settings.responseDataKey.
    *
    *
    * Valid values:
    * "string" Specifies the name of the property in which data records are held if the response is wrapped.
    * "null" Option is ignored.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * Gets the data type of the remote data source response. Delegates the value to [$.ig.DataSource.settings.responseDataType](ig.datasource#options:settings.responseDataType). Please refer to the documentation of $.ig.DataSource.settings.responseDataType.
    *
    *
    * Valid values:
    * "string" Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType.
    * "null" Type is inferred.
    */
  var responseDataType: js.UndefOr[String] = js.native
  /**
    * Fired after a new node is selected.
    */
  var selectionChanged: js.UndefOr[IgTreeSelectionChangedEvent] = js.native
  /**
    * Fired before a new node is selected.
    */
  var selectionChanging: js.UndefOr[SelectionChangingEvent] = js.native
  /**
    * Gets/Sets one or more branches to be expanded at a time. If set to true then only one branch at each level of the tree can be expanded at a time. Otherwise multiple branches can be expanded at a time.
    *
    */
  var singleBranchExpand: js.UndefOr[Boolean] = js.native
  /**
    * Gets the URL to which updating requests will be made.
    *
    */
  var updateUrl: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the width of the control container.
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%).
    * "number" The widget width can be set as a number in pixels.
    * "null" No width will be applied to the container and it will be rendered by default for the browser rendering engine.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgTree {
  @scala.inline
  def apply(): IgTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTree]
  }
  @scala.inline
  implicit class IgTreeOps[Self <: IgTree] (val x: Self) extends AnyVal {
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBindings(value: IgTreeBindings): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    @scala.inline
    def setCheckboxMode(value: String): Self = this.set("checkboxMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxMode: Self = this.set("checkboxMode", js.undefined)
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = this.set("dataBinding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = this.set("dataBound", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    @scala.inline
    def setDefaultNodeTarget(value: String): Self = this.set("defaultNodeTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNodeTarget: Self = this.set("defaultNodeTarget", js.undefined)
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = this.set("dragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndDrop: Self = this.set("dragAndDrop", js.undefined)
    @scala.inline
    def setDragAndDropSettings(value: IgTreeDragAndDropSettings): Self = this.set("dragAndDropSettings", value.asInstanceOf[js.Any])
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHotTracking(value: Boolean): Self = this.set("hotTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHotTracking: Self = this.set("hotTracking", js.undefined)
    @scala.inline
    def setInitialExpandDepth(value: Double): Self = this.set("initialExpandDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialExpandDepth: Self = this.set("initialExpandDepth", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLeafNodeImageClass(value: String): Self = this.set("leafNodeImageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeafNodeImageClass: Self = this.set("leafNodeImageClass", js.undefined)
    @scala.inline
    def setLeafNodeImageTooltip(value: String): Self = this.set("leafNodeImageTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeafNodeImageTooltip: Self = this.set("leafNodeImageTooltip", js.undefined)
    @scala.inline
    def setLeafNodeImageUrl(value: String): Self = this.set("leafNodeImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeafNodeImageUrl: Self = this.set("leafNodeImageUrl", js.undefined)
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setNodeCheckstateChanged(value: (/* event */ Event, /* ui */ NodeCheckstateChangedEventUIParam) => Unit): Self = this.set("nodeCheckstateChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeCheckstateChanged: Self = this.set("nodeCheckstateChanged", js.undefined)
    @scala.inline
    def setNodeCheckstateChanging(value: (/* event */ Event, /* ui */ NodeCheckstateChangingEventUIParam) => Unit): Self = this.set("nodeCheckstateChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeCheckstateChanging: Self = this.set("nodeCheckstateChanging", js.undefined)
    @scala.inline
    def setNodeClick(value: (/* event */ Event, /* ui */ NodeClickEventUIParam) => Unit): Self = this.set("nodeClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeClick: Self = this.set("nodeClick", js.undefined)
    @scala.inline
    def setNodeCollapsed(value: (/* event */ Event, /* ui */ NodeCollapsedEventUIParam) => Unit): Self = this.set("nodeCollapsed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeCollapsed: Self = this.set("nodeCollapsed", js.undefined)
    @scala.inline
    def setNodeCollapsing(value: (/* event */ Event, /* ui */ NodeCollapsingEventUIParam) => Unit): Self = this.set("nodeCollapsing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeCollapsing: Self = this.set("nodeCollapsing", js.undefined)
    @scala.inline
    def setNodeDoubleClick(value: (/* event */ Event, /* ui */ NodeDoubleClickEventUIParam) => Unit): Self = this.set("nodeDoubleClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeDoubleClick: Self = this.set("nodeDoubleClick", js.undefined)
    @scala.inline
    def setNodeDropped(value: (/* event */ Event, /* ui */ NodeDroppedEventUIParam) => Unit): Self = this.set("nodeDropped", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeDropped: Self = this.set("nodeDropped", js.undefined)
    @scala.inline
    def setNodeDropping(value: (/* event */ Event, /* ui */ NodeDroppingEventUIParam) => Unit): Self = this.set("nodeDropping", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeDropping: Self = this.set("nodeDropping", js.undefined)
    @scala.inline
    def setNodeExpanded(value: (/* event */ Event, /* ui */ NodeExpandedEventUIParam) => Unit): Self = this.set("nodeExpanded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeExpanded: Self = this.set("nodeExpanded", js.undefined)
    @scala.inline
    def setNodeExpanding(value: (/* event */ Event, /* ui */ NodeExpandingEventUIParam) => Unit): Self = this.set("nodeExpanding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeExpanding: Self = this.set("nodeExpanding", js.undefined)
    @scala.inline
    def setNodePopulated(value: (/* event */ Event, /* ui */ NodePopulatedEventUIParam) => Unit): Self = this.set("nodePopulated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodePopulated: Self = this.set("nodePopulated", js.undefined)
    @scala.inline
    def setNodePopulating(value: (/* event */ Event, /* ui */ NodePopulatingEventUIParam) => Unit): Self = this.set("nodePopulating", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodePopulating: Self = this.set("nodePopulating", js.undefined)
    @scala.inline
    def setParentNodeImageClass(value: String): Self = this.set("parentNodeImageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNodeImageClass: Self = this.set("parentNodeImageClass", js.undefined)
    @scala.inline
    def setParentNodeImageTooltip(value: String): Self = this.set("parentNodeImageTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNodeImageTooltip: Self = this.set("parentNodeImageTooltip", js.undefined)
    @scala.inline
    def setParentNodeImageUrl(value: String): Self = this.set("parentNodeImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNodeImageUrl: Self = this.set("parentNodeImageUrl", js.undefined)
    @scala.inline
    def setPathSeparator(value: String): Self = this.set("pathSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathSeparator: Self = this.set("pathSeparator", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = this.set("rendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendering: Self = this.set("rendering", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setResponseContentType(value: String): Self = this.set("responseContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseContentType: Self = this.set("responseContentType", js.undefined)
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    @scala.inline
    def setResponseDataType(value: String): Self = this.set("responseDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataType: Self = this.set("responseDataType", js.undefined)
    @scala.inline
    def setSelectionChanged(value: (/* event */ Event, /* ui */ IgTreeSelectionChangedEventUIParam) => Unit): Self = this.set("selectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectionChanged: Self = this.set("selectionChanged", js.undefined)
    @scala.inline
    def setSelectionChanging(value: (/* event */ Event, /* ui */ SelectionChangingEventUIParam) => Unit): Self = this.set("selectionChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectionChanging: Self = this.set("selectionChanging", js.undefined)
    @scala.inline
    def setSingleBranchExpand(value: Boolean): Self = this.set("singleBranchExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleBranchExpand: Self = this.set("singleBranchExpand", js.undefined)
    @scala.inline
    def setUpdateUrl(value: String): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

