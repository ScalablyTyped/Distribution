package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITreeNode extends js.Object {
  /** List of child nodes of a specified node */
  var children: js.UndefOr[js.Array[UITreeNode]] = js.undefined
  /** Data of a specified node */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /** Depth of a specified node */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /** LI element of a specified node */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Index of a specified node  */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Unique number of a specifiede node at the current depth */
  var nodenum: js.UndefOr[scala.Double] = js.undefined
  /** Variable that refers to the parent of the current node */
  var parent: js.UndefOr[UITreeNode] = js.undefined
  /** State value that indicates whether a child node is shown or hidden */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

