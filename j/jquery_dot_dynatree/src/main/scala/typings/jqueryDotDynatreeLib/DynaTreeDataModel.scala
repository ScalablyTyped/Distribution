package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeDataModel extends js.Object {
   // Use <span> instead of <a> tag for this node
  var activate: js.UndefOr[scala.Boolean] = js.undefined
   // Use a custom image (filename relative to tree.options.imagePath). 'null' for default icon, 'false' for no icon.
  var addClass: js.UndefOr[java.lang.String] = js.undefined
   // Prevent selection.
  // The following attributes are only valid if passed to some functions:
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.undefined
   // Initial focused status.
  var expand: js.UndefOr[scala.Boolean] = js.undefined
   // Initial active status.
  var focus: js.UndefOr[scala.Boolean] = js.undefined
   // Initial selected status.
  var hideCheckbox: js.UndefOr[scala.Boolean] = js.undefined
   // Show this popup text.
  var href: js.UndefOr[java.lang.String] = js.undefined
   // Added to the generated <a> tag.
  var icon: js.UndefOr[java.lang.String] = js.undefined
   // May be used with activate(), select(), find(), ...
  var isFolder: js.UndefOr[scala.Boolean] = js.undefined
   // Use a folder icon. Also the node is expandable but not selectable.
  var isLazy: js.UndefOr[scala.Boolean] = js.undefined
   // (required) Displayed name of the node (html is allowed here)
  var key: js.UndefOr[java.lang.String] = js.undefined
   // Class name added to the node's span tag.
  var noLink: js.UndefOr[scala.Boolean] = js.undefined
   // Initial expanded status.
  var select: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
   // Call onLazyRead(), when the node is expanded for the first time to allow for delayed creation of children.
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
   // Suppress checkbox display for this node.
  var unselectable: js.UndefOr[scala.Boolean] = js.undefined
}

object DynaTreeDataModel {
  @scala.inline
  def apply(
    title: java.lang.String,
    activate: js.UndefOr[scala.Boolean] = js.undefined,
    addClass: java.lang.String = null,
    children: js.Array[DynaTreeDataModel] = null,
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    hideCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    icon: java.lang.String = null,
    isFolder: js.UndefOr[scala.Boolean] = js.undefined,
    isLazy: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    noLink: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: java.lang.String = null,
    unselectable: js.UndefOr[scala.Boolean] = js.undefined
  ): DynaTreeDataModel = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate)
    if (addClass != null) __obj.updateDynamic("addClass")(addClass)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(hideCheckbox)) __obj.updateDynamic("hideCheckbox")(hideCheckbox)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(isFolder)) __obj.updateDynamic("isFolder")(isFolder)
    if (!js.isUndefined(isLazy)) __obj.updateDynamic("isLazy")(isLazy)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(noLink)) __obj.updateDynamic("noLink")(noLink)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable)
    __obj.asInstanceOf[DynaTreeDataModel]
  }
}

