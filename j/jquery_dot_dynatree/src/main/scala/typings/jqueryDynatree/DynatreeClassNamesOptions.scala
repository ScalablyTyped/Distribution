package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynatreeClassNamesOptions extends js.Object {
  var active: js.UndefOr[String] = js.native
  var checkbox: js.UndefOr[String] = js.native
  var combinedExpanderPrefix: js.UndefOr[String] = js.native
  var combinedIconPrefix: js.UndefOr[String] = js.native
  var connector: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var expanded: js.UndefOr[String] = js.native
  var expander: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var folder: js.UndefOr[String] = js.native
  var hasChildren: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[String] = js.native
  var lastsib: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[String] = js.native
  var noConnector: js.UndefOr[String] = js.native
  var node: js.UndefOr[String] = js.native
  var nodeError: js.UndefOr[String] = js.native
  var nodeIcon: js.UndefOr[String] = js.native
  var nodeWait: js.UndefOr[String] = js.native
  var partsel: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var vline: js.UndefOr[String] = js.native
}

object DynatreeClassNamesOptions {
  @scala.inline
  def apply(): DynatreeClassNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynatreeClassNamesOptions]
  }
  @scala.inline
  implicit class DynatreeClassNamesOptionsOps[Self <: DynatreeClassNamesOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCheckbox(value: String): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setCombinedExpanderPrefix(value: String): Self = this.set("combinedExpanderPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinedExpanderPrefix: Self = this.set("combinedExpanderPrefix", js.undefined)
    @scala.inline
    def setCombinedIconPrefix(value: String): Self = this.set("combinedIconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinedIconPrefix: Self = this.set("combinedIconPrefix", js.undefined)
    @scala.inline
    def setConnector(value: String): Self = this.set("connector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setExpanded(value: String): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setExpander(value: String): Self = this.set("expander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpander: Self = this.set("expander", js.undefined)
    @scala.inline
    def setFocused(value: String): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setHasChildren(value: String): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasChildren: Self = this.set("hasChildren", js.undefined)
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setLastsib(value: String): Self = this.set("lastsib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastsib: Self = this.set("lastsib", js.undefined)
    @scala.inline
    def setLazy(value: String): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setNoConnector(value: String): Self = this.set("noConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoConnector: Self = this.set("noConnector", js.undefined)
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setNodeError(value: String): Self = this.set("nodeError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeError: Self = this.set("nodeError", js.undefined)
    @scala.inline
    def setNodeIcon(value: String): Self = this.set("nodeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIcon: Self = this.set("nodeIcon", js.undefined)
    @scala.inline
    def setNodeWait(value: String): Self = this.set("nodeWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeWait: Self = this.set("nodeWait", js.undefined)
    @scala.inline
    def setPartsel(value: String): Self = this.set("partsel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartsel: Self = this.set("partsel", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVline(value: String): Self = this.set("vline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVline: Self = this.set("vline", js.undefined)
  }
  
}

