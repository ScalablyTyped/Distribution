package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Data object passed to FancytreeNode() constructor. Note: typically these attributes are accessed by meber methods, e.g. `node.isExpanded()` and `node.setSelected(false)`.  */
@js.native
trait NodeData extends StObject {
  
  /** (initialization only, but will not be stored with the node). */
  var active: js.UndefOr[Boolean] = js.native
  
  /** optional array of child nodes */
  var children: js.UndefOr[js.Array[NodeData]] = js.native
  
  /** all properties from will be copied to `node.data` */
  var data: js.UndefOr[js.Object] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  /** class names added to the node markup (separate with space) */
  var extraClasses: js.UndefOr[String] = js.native
  
  /** (initialization only, but will not be stored with the node). */
  var focus: js.UndefOr[Boolean] = js.native
  
  var folder: js.UndefOr[Boolean] = js.native
  
  var hideCheckbox: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Boolean | String] = js.native
  
  /** Will be added as title attribute of the node's icon span,thus enabling a tooltip. */
  var iconTooltip: js.UndefOr[String] = js.native
  
  /** unique key for this node (auto-generated if omitted) */
  var key: js.UndefOr[String] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /** (reserved) */
  var refKey: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  /** If set, make this node a status node. Values: 'error', 'loading', 'nodata', 'paging'. */
  var statusNodeType: js.UndefOr[String] = js.native
  
  /** node text (may contain HTML tags) */
  var title: String = js.native
  
  var tooltip: js.UndefOr[String] = js.native
  
  /** Made available as node.type. */
  var `type`: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[Boolean] = js.native
  
  /** Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[Boolean] = js.native
  
  /** Use this as constant selected value(overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[Boolean] = js.native
}
object NodeData {
  
  @scala.inline
  def apply(title: String): NodeData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
  
  @scala.inline
  implicit class NodeDataMutableBuilder[Self <: NodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[NodeData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: NodeData*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setExtraClasses(value: String): Self = StObject.set(x, "extraClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraClassesUndefined: Self = StObject.set(x, "extraClasses", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFolder(value: Boolean): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setHideCheckbox(value: Boolean): Self = StObject.set(x, "hideCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideCheckboxUndefined: Self = StObject.set(x, "hideCheckbox", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTooltip(value: String): Self = StObject.set(x, "iconTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTooltipUndefined: Self = StObject.set(x, "iconTooltip", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    @scala.inline
    def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setStatusNodeType(value: String): Self = StObject.set(x, "statusNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNodeTypeUndefined: Self = StObject.set(x, "statusNodeType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableIgnore(value: Boolean): Self = StObject.set(x, "unselectableIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableIgnoreUndefined: Self = StObject.set(x, "unselectableIgnore", js.undefined)
    
    @scala.inline
    def setUnselectableStatus(value: Boolean): Self = StObject.set(x, "unselectableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableStatusUndefined: Self = StObject.set(x, "unselectableStatus", js.undefined)
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
  }
}
