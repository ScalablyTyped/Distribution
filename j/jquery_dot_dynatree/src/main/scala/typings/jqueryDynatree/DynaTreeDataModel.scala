package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynaTreeDataModel extends StObject {
  
  // Use <span> instead of <a> tag for this node
  var activate: js.UndefOr[Boolean] = js.undefined
  
  // Use a custom image (filename relative to tree.options.imagePath). 'null' for default icon, 'false' for no icon.
  var addClass: js.UndefOr[String] = js.undefined
  
  // Prevent selection.
  // The following attributes are only valid if passed to some functions:
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.undefined
  
  // Initial focused status.
  var expand: js.UndefOr[Boolean] = js.undefined
  
  // Initial active status.
  var focus: js.UndefOr[Boolean] = js.undefined
  
  // Initial selected status.
  var hideCheckbox: js.UndefOr[Boolean] = js.undefined
  
  // Show this popup text.
  var href: js.UndefOr[String] = js.undefined
  
  // Added to the generated <a> tag.
  var icon: js.UndefOr[String] = js.undefined
  
  // May be used with activate(), select(), find(), ...
  var isFolder: js.UndefOr[Boolean] = js.undefined
  
  // Use a folder icon. Also the node is expandable but not selectable.
  var isLazy: js.UndefOr[Boolean] = js.undefined
  
  // (required) Displayed name of the node (html is allowed here)
  var key: js.UndefOr[String] = js.undefined
  
  // Class name added to the node's span tag.
  var noLink: js.UndefOr[Boolean] = js.undefined
  
  // Initial expanded status.
  var select: js.UndefOr[Boolean] = js.undefined
  
  var title: String
  
  // Call onLazyRead(), when the node is expanded for the first time to allow for delayed creation of children.
  var tooltip: js.UndefOr[String] = js.undefined
  
  // Suppress checkbox display for this node.
  var unselectable: js.UndefOr[Boolean] = js.undefined
}
object DynaTreeDataModel {
  
  inline def apply(title: String): DynaTreeDataModel = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDataModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynaTreeDataModel] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
    
    inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    inline def setChildren(value: js.Array[DynaTreeDataModel]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DynaTreeDataModel*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHideCheckbox(value: Boolean): Self = StObject.set(x, "hideCheckbox", value.asInstanceOf[js.Any])
    
    inline def setHideCheckboxUndefined: Self = StObject.set(x, "hideCheckbox", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
    
    inline def setIsFolderUndefined: Self = StObject.set(x, "isFolder", js.undefined)
    
    inline def setIsLazy(value: Boolean): Self = StObject.set(x, "isLazy", value.asInstanceOf[js.Any])
    
    inline def setIsLazyUndefined: Self = StObject.set(x, "isLazy", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
    
    inline def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
    
    inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
  }
}
