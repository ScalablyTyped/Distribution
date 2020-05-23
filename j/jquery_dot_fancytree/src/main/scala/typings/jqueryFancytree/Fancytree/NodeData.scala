package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Data object passed to FancytreeNode() constructor. Note: typically these attributes are accessed by meber methods, e.g. `node.isExpanded()` and `node.setSelected(false)`.  */
trait NodeData extends js.Object {
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
  @scala.inline
  def apply(
    title: String,
    active: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[NodeData] = null,
    data: js.Object = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    extraClasses: String = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    folder: js.UndefOr[Boolean] = js.undefined,
    hideCheckbox: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | String = null,
    iconTooltip: String = null,
    key: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    refKey: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    statusNodeType: String = null,
    tooltip: String = null,
    `type`: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    unselectableIgnore: js.UndefOr[Boolean] = js.undefined,
    unselectableStatus: js.UndefOr[Boolean] = js.undefined
  ): NodeData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (extraClasses != null) __obj.updateDynamic("extraClasses")(extraClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(folder)) __obj.updateDynamic("folder")(folder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCheckbox)) __obj.updateDynamic("hideCheckbox")(hideCheckbox.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconTooltip != null) __obj.updateDynamic("iconTooltip")(iconTooltip.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (refKey != null) __obj.updateDynamic("refKey")(refKey.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (statusNodeType != null) __obj.updateDynamic("statusNodeType")(statusNodeType.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectableIgnore)) __obj.updateDynamic("unselectableIgnore")(unselectableIgnore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectableStatus)) __obj.updateDynamic("unselectableStatus")(unselectableStatus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
}

