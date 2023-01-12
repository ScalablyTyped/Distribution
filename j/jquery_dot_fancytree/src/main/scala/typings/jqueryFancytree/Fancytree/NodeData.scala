package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Data object passed to FancytreeNode() constructor. Note: typically these attributes are accessed by meber methods, e.g. `node.isExpanded()` and `node.setSelected(false)`.  */
trait NodeData extends StObject {
  
  /** (initialization only, but will not be stored with the node). */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** optional array of child nodes */
  var children: js.UndefOr[js.Array[NodeData]] = js.undefined
  
  /** all properties from will be copied to `node.data` */
  var data: js.UndefOr[js.Object] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /** class names added to the node markup (separate with space) */
  var extraClasses: js.UndefOr[String] = js.undefined
  
  /** (initialization only, but will not be stored with the node). */
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var folder: js.UndefOr[Boolean] = js.undefined
  
  var hideCheckbox: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Boolean | String] = js.undefined
  
  /** Will be added as title attribute of the node's icon span,thus enabling a tooltip. */
  var iconTooltip: js.UndefOr[String] = js.undefined
  
  /** unique key for this node (auto-generated if omitted) */
  var key: js.UndefOr[String] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  /** (reserved) */
  var refKey: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /** If set, make this node a status node. Values: 'error', 'loading', 'nodata', 'paging'. */
  var statusNodeType: js.UndefOr[String] = js.undefined
  
  /** node text (may contain HTML tags) */
  var title: String
  
  var tooltip: js.UndefOr[String] = js.undefined
  
  /** Made available as node.type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[Boolean] = js.undefined
  
  /** Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[Boolean] = js.undefined
  
  /** Use this as constant selected value(overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[Boolean] = js.undefined
}
object NodeData {
  
  inline def apply(title: String): NodeData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeData] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setChildren(value: js.Array[NodeData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: NodeData*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setExtraClasses(value: String): Self = StObject.set(x, "extraClasses", value.asInstanceOf[js.Any])
    
    inline def setExtraClassesUndefined: Self = StObject.set(x, "extraClasses", js.undefined)
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFolder(value: Boolean): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setHideCheckbox(value: Boolean): Self = StObject.set(x, "hideCheckbox", value.asInstanceOf[js.Any])
    
    inline def setHideCheckboxUndefined: Self = StObject.set(x, "hideCheckbox", js.undefined)
    
    inline def setIcon(value: Boolean | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconTooltip(value: String): Self = StObject.set(x, "iconTooltip", value.asInstanceOf[js.Any])
    
    inline def setIconTooltipUndefined: Self = StObject.set(x, "iconTooltip", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
    
    inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStatusNodeType(value: String): Self = StObject.set(x, "statusNodeType", value.asInstanceOf[js.Any])
    
    inline def setStatusNodeTypeUndefined: Self = StObject.set(x, "statusNodeType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableIgnore(value: Boolean): Self = StObject.set(x, "unselectableIgnore", value.asInstanceOf[js.Any])
    
    inline def setUnselectableIgnoreUndefined: Self = StObject.set(x, "unselectableIgnore", js.undefined)
    
    inline def setUnselectableStatus(value: Boolean): Self = StObject.set(x, "unselectableStatus", value.asInstanceOf[js.Any])
    
    inline def setUnselectableStatusUndefined: Self = StObject.set(x, "unselectableStatus", js.undefined)
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
  }
}
