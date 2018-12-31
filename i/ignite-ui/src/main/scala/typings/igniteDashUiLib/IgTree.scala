package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTree
  extends /**
	 * Option for igTree
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the duration of each animation such as the expand/collapse.
  	 *
  	 */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
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
  var checkboxMode: js.UndefOr[java.lang.String] = js.undefined
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
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the remote url.
  	 * "null" Option is ignored.
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the default target attribute value for the node anchors.
  	 *
  	 */
  var defaultNodeTarget: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Fired on node drag.
  	 */
  var drag: js.UndefOr[DragEvent] = js.undefined
  /**
  	 * Gets/Sets whether drag and drop functionality is enabled.
  	 *
  	 */
  var dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
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
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets/Sets whether nodes are hoverable. Setting this option to false would make the tree to not apply hover styles on the nodes when they are hovered.
  	 *
  	 */
  var hotTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the initial depth the igTree is going to be expanded to upon initial render.
  	 *
  	 */
  var initialExpandDepth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the CSS class applied to all leaf nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified class with a CSS sprite that would be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var leafNodeImageClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the tooltip applied to all leaf node images.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified a tooltip that would be rendered for each node that has no children.
  	 * "null" Option is ignored
  	 */
  var leafNodeImageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the image url applied to all leaf nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Image with the specified URL will be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var leafNodeImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets whether all the data would be bound initially or each child collection would be bound upon expand.
  	 *
  	 */
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
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
  var parentNodeImageClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the tooltip applied to all parent node images.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified a tooltip that would be rendered for each node that has children.
  	 * "null" Option is ignored
  	 */
  var parentNodeImageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the image url applied to all parent nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Image with the specified URL will be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var parentNodeImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the node data-path attribute separator character.
  	 *
  	 */
  var pathSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the type of the content in a remote data source response. Content type of the response from the [dataSourceUrl](ui.igtree#options:dataSourceUrl). See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the JSON key at which a remote data source will write the data. Delegates the value to [$.ig.DataSource.settings.responseDataKey](ig.datasource#options:settings.responseDataKey). Please refer to the documentation of $.ig.DataSource.settings.responseDataKey.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the name of the property in which data records are held if the response is wrapped.
  	 * "null" Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the data type of the remote data source response. Delegates the value to [$.ig.DataSource.settings.responseDataType](ig.datasource#options:settings.responseDataType). Please refer to the documentation of $.ig.DataSource.settings.responseDataType.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType.
  	 * "null" Type is inferred.
  	 */
  var responseDataType: js.UndefOr[java.lang.String] = js.undefined
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
  var singleBranchExpand: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the URL to which updating requests will be made.
  	 *
  	 */
  var updateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the width of the control container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number in pixels.
  	 * "null" No width will be applied to the container and it will be rendered by default for the browser rendering engine.
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

