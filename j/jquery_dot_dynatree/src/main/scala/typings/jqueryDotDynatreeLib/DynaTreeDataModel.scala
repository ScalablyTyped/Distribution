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

