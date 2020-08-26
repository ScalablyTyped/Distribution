package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeDataModel extends js.Object {
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
  implicit class DynaTreeDataModelOps[Self <: DynaTreeDataModel] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivate(value: Boolean): Self = this.set("activate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setAddClass(value: String): Self = this.set("addClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: DynaTreeDataModel*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[DynaTreeDataModel]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setHideCheckbox(value: Boolean): Self = this.set("hideCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCheckbox: Self = this.set("hideCheckbox", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIsFolder(value: Boolean): Self = this.set("isFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFolder: Self = this.set("isFolder", js.undefined)
    @scala.inline
    def setIsLazy(value: Boolean): Self = this.set("isLazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLazy: Self = this.set("isLazy", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNoLink(value: Boolean): Self = this.set("noLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLink: Self = this.set("noLink", js.undefined)
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUnselectable(value: Boolean): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
  }
  
}

