package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTree
  extends /**
	 * Option for igTree
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the duration of each animation such as the expand/collapse.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the data binding properties and keys. The igTree uses these to extract the corresponding data from the dataSource.
  	 *
  	 */
  var bindings: js.UndefOr[IgTreeBindings] = js.undefined
  /**
  	 * Gets the behavior and type of the checkboxes rendered for the tree nodes. Can be set only at initialization.
  	 *
  	 *
  	 * Valid values:
  	 * "off" Checkboxes are turned off and are not rendered for the tree.
  	 * "biState" Checkboxes are rendered and support two states (checked and unchecked). Checkboxes do not cascade down or up in this mode.
  	 * "triState" Checkboxes are rendered and support three states (checked, partial and unchecked). Checkboxes cascade up and down in this mode.
  	 */
  var checkboxMode: js.UndefOr[String] = js.undefined
  /**
  	 * Fired before databinding is performed.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
  	 * Fired after databinding is finished.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  /**
  	 * Gets/Sets the igTree data source. Accepts any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
  	 * Once the data source is initialized, this option becomes an instance of the $.ig.HierarchicalDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the type of the data source. Delegates the value to [$.ig.DataSource.settings.type](ig.datasource#options:settings.type). Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource.settings.type.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the data source type implicitly.
  	 * "null" Type is inferred.
  	 */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the remote url.
  	 * "null" Option is ignored.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the default target attribute value for the node anchors.
  	 *
  	 */
  var defaultNodeTarget: js.UndefOr[String] = js.undefined
  /**
  	 * Fired on node drag.
  	 */
  var drag: js.UndefOr[DragEvent] = js.undefined
  /**
  	 * Gets/Sets whether drag and drop functionality is enabled.
  	 *
  	 */
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets specific settings for the drag and drop functionality.
  	 *
  	 */
  var dragAndDropSettings: js.UndefOr[IgTreeDragAndDropSettings] = js.undefined
  /**
  	 * Fired on node drag start.
  	 */
  var dragStart: js.UndefOr[DragStartEvent] = js.undefined
  /**
  	 * Fired after a drag operation has completed.
  	 */
  var dragStop: js.UndefOr[DragStopEvent] = js.undefined
  /**
  	 * Gets/Sets how the height of of the control container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number in pixels.
  	 * "null" No height will be applied to the container and it will be rendered default for the browser rendering engine.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Gets/Sets whether nodes are hoverable. Setting this option to false would make the tree to not apply hover styles on the nodes when they are hovered.
  	 *
  	 */
  var hotTracking: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the initial depth the igTree is going to be expanded to upon initial render.
  	 *
  	 */
  var initialExpandDepth: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the CSS class applied to all leaf nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified class with a CSS sprite that would be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var leafNodeImageClass: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the tooltip applied to all leaf node images.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified a tooltip that would be rendered for each node that has no children.
  	 * "null" Option is ignored
  	 */
  var leafNodeImageTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the image url applied to all leaf nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Image with the specified URL will be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var leafNodeImageUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets whether all the data would be bound initially or each child collection would be bound upon expand.
  	 *
  	 */
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the checkstate of a node is changed.
  	 */
  var nodeCheckstateChanged: js.UndefOr[NodeCheckstateChangedEvent] = js.undefined
  /**
  	 * Fired before the checkbox state of a node is changed.
  	 */
  var nodeCheckstateChanging: js.UndefOr[NodeCheckstateChangingEvent] = js.undefined
  /**
  	 * Fired on node click.
  	 */
  var nodeClick: js.UndefOr[NodeClickEvent] = js.undefined
  /**
  	 * Fired after a node is collapsed.
  	 */
  var nodeCollapsed: js.UndefOr[NodeCollapsedEvent] = js.undefined
  /**
  	 * Fired before a node is collapsed.
  	 */
  var nodeCollapsing: js.UndefOr[NodeCollapsingEvent] = js.undefined
  /**
  	 * Fired on node double click.
  	 */
  var nodeDoubleClick: js.UndefOr[NodeDoubleClickEvent] = js.undefined
  /**
  	 * Fired after a node is dropped.
  	 */
  var nodeDropped: js.UndefOr[NodeDroppedEvent] = js.undefined
  /**
  	 * Fired before a node is dropped.
  	 */
  var nodeDropping: js.UndefOr[NodeDroppingEvent] = js.undefined
  /**
  	 * Fired after a node is expanded.
  	 */
  var nodeExpanded: js.UndefOr[NodeExpandedEvent] = js.undefined
  /**
  	 * Fired before a node is expanded.
  	 */
  var nodeExpanding: js.UndefOr[NodeExpandingEvent] = js.undefined
  /**
  	 * Fired after the children of a node are populated in the case of load on demand.
  	 */
  var nodePopulated: js.UndefOr[NodePopulatedEvent] = js.undefined
  /**
  	 * Fired before the children of a node are populated in the case of load on demand.
  	 */
  var nodePopulating: js.UndefOr[NodePopulatingEvent] = js.undefined
  /**
  	 * Gets/Sets the CSS class applied to all parent nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified class with a CSS sprite that would be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var parentNodeImageClass: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the tooltip applied to all parent node images.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified a tooltip that would be rendered for each node that has children.
  	 * "null" Option is ignored
  	 */
  var parentNodeImageTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the image url applied to all parent nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Image with the specified URL will be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var parentNodeImageUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the node data-path attribute separator character.
  	 *
  	 */
  var pathSeparator: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Fired after rendering of the tree has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Fired before rendering of the tree begins.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  /**
  	 * Gets the HTTP verb used for remote requests. Specifies the HTTP verb to be used to issue the requests to the [dataSourceUrl](ui.igtree#options:dataSourceUrl).
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the type of the content in a remote data source response. Content type of the response from the [dataSourceUrl](ui.igtree#options:dataSourceUrl). See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the JSON key at which a remote data source will write the data. Delegates the value to [$.ig.DataSource.settings.responseDataKey](ig.datasource#options:settings.responseDataKey). Please refer to the documentation of $.ig.DataSource.settings.responseDataKey.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the name of the property in which data records are held if the response is wrapped.
  	 * "null" Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the data type of the remote data source response. Delegates the value to [$.ig.DataSource.settings.responseDataType](ig.datasource#options:settings.responseDataType). Please refer to the documentation of $.ig.DataSource.settings.responseDataType.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType.
  	 * "null" Type is inferred.
  	 */
  var responseDataType: js.UndefOr[String] = js.undefined
  /**
  	 * Fired after a new node is selected.
  	 */
  var selectionChanged: js.UndefOr[IgTreeSelectionChangedEvent] = js.undefined
  /**
  	 * Fired before a new node is selected.
  	 */
  var selectionChanging: js.UndefOr[SelectionChangingEvent] = js.undefined
  /**
  	 * Gets/Sets one or more branches to be expanded at a time. If set to true then only one branch at each level of the tree can be expanded at a time. Otherwise multiple branches can be expanded at a time.
  	 *
  	 */
  var singleBranchExpand: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the URL to which updating requests will be made.
  	 *
  	 */
  var updateUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the width of the control container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number in pixels.
  	 * "null" No width will be applied to the container and it will be rendered by default for the browser rendering engine.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgTree {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTree
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    bindings: IgTreeBindings = null,
    checkboxMode: String = null,
    dataBinding: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit = null,
    dataBound: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    defaultNodeTarget: String = null,
    drag: (/* event */ Event, /* ui */ DragEventUIParam) => Unit = null,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    dragAndDropSettings: IgTreeDragAndDropSettings = null,
    dragStart: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit = null,
    dragStop: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit = null,
    height: String | Double = null,
    hotTracking: js.UndefOr[Boolean] = js.undefined,
    initialExpandDepth: Int | Double = null,
    language: String = null,
    leafNodeImageClass: String = null,
    leafNodeImageTooltip: String = null,
    leafNodeImageUrl: String = null,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    locale: js.Any = null,
    nodeCheckstateChanged: (/* event */ Event, /* ui */ NodeCheckstateChangedEventUIParam) => Unit = null,
    nodeCheckstateChanging: (/* event */ Event, /* ui */ NodeCheckstateChangingEventUIParam) => Unit = null,
    nodeClick: (/* event */ Event, /* ui */ NodeClickEventUIParam) => Unit = null,
    nodeCollapsed: (/* event */ Event, /* ui */ NodeCollapsedEventUIParam) => Unit = null,
    nodeCollapsing: (/* event */ Event, /* ui */ NodeCollapsingEventUIParam) => Unit = null,
    nodeDoubleClick: (/* event */ Event, /* ui */ NodeDoubleClickEventUIParam) => Unit = null,
    nodeDropped: (/* event */ Event, /* ui */ NodeDroppedEventUIParam) => Unit = null,
    nodeDropping: (/* event */ Event, /* ui */ NodeDroppingEventUIParam) => Unit = null,
    nodeExpanded: (/* event */ Event, /* ui */ NodeExpandedEventUIParam) => Unit = null,
    nodeExpanding: (/* event */ Event, /* ui */ NodeExpandingEventUIParam) => Unit = null,
    nodePopulated: (/* event */ Event, /* ui */ NodePopulatedEventUIParam) => Unit = null,
    nodePopulating: (/* event */ Event, /* ui */ NodePopulatingEventUIParam) => Unit = null,
    parentNodeImageClass: String = null,
    parentNodeImageTooltip: String = null,
    parentNodeImageUrl: String = null,
    pathSeparator: String = null,
    regional: String | js.Object = null,
    rendered: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit = null,
    rendering: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit = null,
    requestType: String = null,
    responseContentType: String = null,
    responseDataKey: String = null,
    responseDataType: String = null,
    selectionChanged: (/* event */ Event, /* ui */ IgTreeSelectionChangedEventUIParam) => Unit = null,
    selectionChanging: (/* event */ Event, /* ui */ SelectionChangingEventUIParam) => Unit = null,
    singleBranchExpand: js.UndefOr[Boolean] = js.undefined,
    updateUrl: String = null,
    width: String | Double = null
  ): IgTree = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (checkboxMode != null) __obj.updateDynamic("checkboxMode")(checkboxMode.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction2(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (defaultNodeTarget != null) __obj.updateDynamic("defaultNodeTarget")(defaultNodeTarget.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (dragAndDropSettings != null) __obj.updateDynamic("dragAndDropSettings")(dragAndDropSettings.asInstanceOf[js.Any])
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction2(dragStop))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hotTracking)) __obj.updateDynamic("hotTracking")(hotTracking.asInstanceOf[js.Any])
    if (initialExpandDepth != null) __obj.updateDynamic("initialExpandDepth")(initialExpandDepth.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (leafNodeImageClass != null) __obj.updateDynamic("leafNodeImageClass")(leafNodeImageClass.asInstanceOf[js.Any])
    if (leafNodeImageTooltip != null) __obj.updateDynamic("leafNodeImageTooltip")(leafNodeImageTooltip.asInstanceOf[js.Any])
    if (leafNodeImageUrl != null) __obj.updateDynamic("leafNodeImageUrl")(leafNodeImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (nodeCheckstateChanged != null) __obj.updateDynamic("nodeCheckstateChanged")(js.Any.fromFunction2(nodeCheckstateChanged))
    if (nodeCheckstateChanging != null) __obj.updateDynamic("nodeCheckstateChanging")(js.Any.fromFunction2(nodeCheckstateChanging))
    if (nodeClick != null) __obj.updateDynamic("nodeClick")(js.Any.fromFunction2(nodeClick))
    if (nodeCollapsed != null) __obj.updateDynamic("nodeCollapsed")(js.Any.fromFunction2(nodeCollapsed))
    if (nodeCollapsing != null) __obj.updateDynamic("nodeCollapsing")(js.Any.fromFunction2(nodeCollapsing))
    if (nodeDoubleClick != null) __obj.updateDynamic("nodeDoubleClick")(js.Any.fromFunction2(nodeDoubleClick))
    if (nodeDropped != null) __obj.updateDynamic("nodeDropped")(js.Any.fromFunction2(nodeDropped))
    if (nodeDropping != null) __obj.updateDynamic("nodeDropping")(js.Any.fromFunction2(nodeDropping))
    if (nodeExpanded != null) __obj.updateDynamic("nodeExpanded")(js.Any.fromFunction2(nodeExpanded))
    if (nodeExpanding != null) __obj.updateDynamic("nodeExpanding")(js.Any.fromFunction2(nodeExpanding))
    if (nodePopulated != null) __obj.updateDynamic("nodePopulated")(js.Any.fromFunction2(nodePopulated))
    if (nodePopulating != null) __obj.updateDynamic("nodePopulating")(js.Any.fromFunction2(nodePopulating))
    if (parentNodeImageClass != null) __obj.updateDynamic("parentNodeImageClass")(parentNodeImageClass.asInstanceOf[js.Any])
    if (parentNodeImageTooltip != null) __obj.updateDynamic("parentNodeImageTooltip")(parentNodeImageTooltip.asInstanceOf[js.Any])
    if (parentNodeImageUrl != null) __obj.updateDynamic("parentNodeImageUrl")(parentNodeImageUrl.asInstanceOf[js.Any])
    if (pathSeparator != null) __obj.updateDynamic("pathSeparator")(pathSeparator.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(js.Any.fromFunction2(rendered))
    if (rendering != null) __obj.updateDynamic("rendering")(js.Any.fromFunction2(rendering))
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType.asInstanceOf[js.Any])
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction2(selectionChanged))
    if (selectionChanging != null) __obj.updateDynamic("selectionChanging")(js.Any.fromFunction2(selectionChanging))
    if (!js.isUndefined(singleBranchExpand)) __obj.updateDynamic("singleBranchExpand")(singleBranchExpand.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTree]
  }
}

