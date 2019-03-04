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

object NodeData {
  @scala.inline
  def apply(
    title: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.Array[NodeData] = null,
    data: js.Object = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    extraClasses: java.lang.String = null,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    folder: js.UndefOr[scala.Boolean] = js.undefined,
    hideCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    icon: scala.Boolean | java.lang.String = null,
    iconTooltip: java.lang.String = null,
    key: java.lang.String = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    refKey: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    statusNodeType: java.lang.String = null,
    tooltip: java.lang.String = null,
    `type`: java.lang.String = null,
    unselectable: js.UndefOr[scala.Boolean] = js.undefined,
    unselectableIgnore: js.UndefOr[scala.Boolean] = js.undefined,
    unselectableStatus: js.UndefOr[scala.Boolean] = js.undefined
  ): NodeData = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (extraClasses != null) __obj.updateDynamic("extraClasses")(extraClasses)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(folder)) __obj.updateDynamic("folder")(folder)
    if (!js.isUndefined(hideCheckbox)) __obj.updateDynamic("hideCheckbox")(hideCheckbox)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconTooltip != null) __obj.updateDynamic("iconTooltip")(iconTooltip)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (statusNodeType != null) __obj.updateDynamic("statusNodeType")(statusNodeType)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable)
    if (!js.isUndefined(unselectableIgnore)) __obj.updateDynamic("unselectableIgnore")(unselectableIgnore)
    if (!js.isUndefined(unselectableStatus)) __obj.updateDynamic("unselectableStatus")(unselectableStatus)
    __obj.asInstanceOf[NodeData]
  }
}

