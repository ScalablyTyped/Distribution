package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeDataModel extends js.Object {
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
  @scala.inline
  def apply(
    title: String,
    activate: js.UndefOr[Boolean] = js.undefined,
    addClass: String = null,
    children: js.Array[DynaTreeDataModel] = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    hideCheckbox: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: String = null,
    isFolder: js.UndefOr[Boolean] = js.undefined,
    isLazy: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    noLink: js.UndefOr[Boolean] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined,
    tooltip: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined
  ): DynaTreeDataModel = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate.get.asInstanceOf[js.Any])
    if (addClass != null) __obj.updateDynamic("addClass")(addClass.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCheckbox)) __obj.updateDynamic("hideCheckbox")(hideCheckbox.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isFolder)) __obj.updateDynamic("isFolder")(isFolder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLazy)) __obj.updateDynamic("isLazy")(isLazy.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noLink)) __obj.updateDynamic("noLink")(noLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDataModel]
  }
}

