package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Data object passed to FancytreeNode() constructor. Note: typically these attributes are accessed by meber methods, e.g. `node.isExpanded()` and `node.setSelected(false)`.  */

trait NodeData extends js.Object {
  /** (initialization only, but will not be stored with the node). */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** optional array of child nodes */
  var children: js.UndefOr[js.Array[NodeData]] = js.undefined
  /** all properties from will be copied to `node.data` */
  var data: js.UndefOr[js.Object] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** class names added to the node markup (separate with space) */
  var extraClasses: js.UndefOr[java.lang.String] = js.undefined
  /** (initialization only, but will not be stored with the node). */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var folder: js.UndefOr[scala.Boolean] = js.undefined
  var hideCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** Will be added as title attribute of the node's icon span,thus enabling a tooltip. */
  var iconTooltip: js.UndefOr[java.lang.String] = js.undefined
  /** unique key for this node (auto-generated if omitted) */
  var key: js.UndefOr[java.lang.String] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  /** (reserved) */
  var refKey: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** If set, make this node a status node. Values: 'error', 'loading', 'nodata', 'paging'. */
  var statusNodeType: js.UndefOr[java.lang.String] = js.undefined
  /** node text (may contain HTML tags) */
  var title: java.lang.String
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /** Made available as node.type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unselectable: js.UndefOr[scala.Boolean] = js.undefined
  /** Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[scala.Boolean] = js.undefined
  /** Use this as constant selected value(overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[scala.Boolean] = js.undefined
}

