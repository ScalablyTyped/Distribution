package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynaTreeDataModel extends StObject {
  
  // Use <span> instead of <a> tag for this node
  var activate: js.UndefOr[Boolean] = js.native
  
  // Use a custom image (filename relative to tree.options.imagePath). 'null' for default icon, 'false' for no icon.
  var addClass: js.UndefOr[String] = js.native
  
  // Prevent selection.
  // The following attributes are only valid if passed to some functions:
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.native
  
  // Initial focused status.
  var expand: js.UndefOr[Boolean] = js.native
  
  // Initial active status.
  var focus: js.UndefOr[Boolean] = js.native
  
  // Initial selected status.
  var hideCheckbox: js.UndefOr[Boolean] = js.native
  
  // Show this popup text.
  var href: js.UndefOr[String] = js.native
  
  // Added to the generated <a> tag.
  var icon: js.UndefOr[String] = js.native
  
  // May be used with activate(), select(), find(), ...
  var isFolder: js.UndefOr[Boolean] = js.native
  
  // Use a folder icon. Also the node is expandable but not selectable.
  var isLazy: js.UndefOr[Boolean] = js.native
  
  // (required) Displayed name of the node (html is allowed here)
  var key: js.UndefOr[String] = js.native
  
  // Class name added to the node's span tag.
  var noLink: js.UndefOr[Boolean] = js.native
  
  // Initial expanded status.
  var select: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
  
  // Call onLazyRead(), when the node is expanded for the first time to allow for delayed creation of children.
  var tooltip: js.UndefOr[String] = js.native
  
  // Suppress checkbox display for this node.
  var unselectable: js.UndefOr[Boolean] = js.native
}
object DynaTreeDataModel {
  
  @scala.inline
  def apply(title: String): DynaTreeDataModel = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDataModel]
  }
  
  @scala.inline
  implicit class DynaTreeDataModelMutableBuilder[Self <: DynaTreeDataModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[DynaTreeDataModel]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DynaTreeDataModel*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setHideCheckbox(value: Boolean): Self = StObject.set(x, "hideCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideCheckboxUndefined: Self = StObject.set(x, "hideCheckbox", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFolderUndefined: Self = StObject.set(x, "isFolder", js.undefined)
    
    @scala.inline
    def setIsLazy(value: Boolean): Self = StObject.set(x, "isLazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLazyUndefined: Self = StObject.set(x, "isLazy", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
  }
}
