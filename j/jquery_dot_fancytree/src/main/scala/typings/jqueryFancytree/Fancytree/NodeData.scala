package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Data object passed to FancytreeNode() constructor. Note: typically these attributes are accessed by meber methods, e.g. `node.isExpanded()` and `node.setSelected(false)`.  */
@js.native
trait NodeData extends js.Object {
  /** (initialization only, but will not be stored with the node). */
  var active: js.UndefOr[Boolean] = js.native
  /** optional array of child nodes */
  var children: js.UndefOr[js.Array[NodeData]] = js.native
  /** all properties from will be copied to `node.data` */
  var data: js.UndefOr[js.Object] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  /** class names added to the node markup (separate with space) */
  var extraClasses: js.UndefOr[String] = js.native
  /** (initialization only, but will not be stored with the node). */
  var focus: js.UndefOr[Boolean] = js.native
  var folder: js.UndefOr[Boolean] = js.native
  var hideCheckbox: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Boolean | String] = js.native
  /** Will be added as title attribute of the node's icon span,thus enabling a tooltip. */
  var iconTooltip: js.UndefOr[String] = js.native
  /** unique key for this node (auto-generated if omitted) */
  var key: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  /** (reserved) */
  var refKey: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  /** If set, make this node a status node. Values: 'error', 'loading', 'nodata', 'paging'. */
  var statusNodeType: js.UndefOr[String] = js.native
  /** node text (may contain HTML tags) */
  var title: String = js.native
  var tooltip: js.UndefOr[String] = js.native
  /** Made available as node.type. */
  var `type`: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[Boolean] = js.native
  /** Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[Boolean] = js.native
  /** Use this as constant selected value(overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[Boolean] = js.native
}

object NodeData {
  @scala.inline
  def apply(title: String): NodeData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
  @scala.inline
  implicit class NodeDataOps[Self <: NodeData] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: NodeData*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[NodeData]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setExtraClasses(value: String): Self = this.set("extraClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraClasses: Self = this.set("extraClasses", js.undefined)
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFolder(value: Boolean): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setHideCheckbox(value: Boolean): Self = this.set("hideCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCheckbox: Self = this.set("hideCheckbox", js.undefined)
    @scala.inline
    def setIcon(value: Boolean | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconTooltip(value: String): Self = this.set("iconTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconTooltip: Self = this.set("iconTooltip", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setRefKey(value: String): Self = this.set("refKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefKey: Self = this.set("refKey", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setStatusNodeType(value: String): Self = this.set("statusNodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusNodeType: Self = this.set("statusNodeType", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnselectable(value: Boolean): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setUnselectableIgnore(value: Boolean): Self = this.set("unselectableIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectableIgnore: Self = this.set("unselectableIgnore", js.undefined)
    @scala.inline
    def setUnselectableStatus(value: Boolean): Self = this.set("unselectableStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectableStatus: Self = this.set("unselectableStatus", js.undefined)
  }
  
}

