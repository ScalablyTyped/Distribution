package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait DialogProps
  extends DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.native
  var actions: js.UndefOr[js.Array[DialogAction | ReactElement]] = js.native
  var actionsContainerClassName: js.UndefOr[String] = js.native
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.native
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.native
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.native
  var bodyClassName: js.UndefOr[String] = js.native
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  var className: js.UndefOr[String] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var key: js.UndefOr[Key] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.native
  var open: Boolean = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var paperClassName: js.UndefOr[String] = js.native
  var paperProps: js.UndefOr[js.Any] = js.native
  var ref: js.UndefOr[LegacyRef[Dialog]] = js.native
  var repositionOnUpdate: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var titleClassName: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[CSSProperties] = js.native
}

object DialogProps {
  @scala.inline
  def apply(open: Boolean): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
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
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionFocus(value: String): Self = this.set("actionFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionFocus: Self = this.set("actionFocus", js.undefined)
    @scala.inline
    def setActionsVarargs(value: (DialogAction | ReactElement)*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[DialogAction | ReactElement]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setActionsContainerClassName(value: String): Self = this.set("actionsContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsContainerClassName: Self = this.set("actionsContainerClassName", js.undefined)
    @scala.inline
    def setActionsContainerStyle(value: CSSProperties): Self = this.set("actionsContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsContainerStyle: Self = this.set("actionsContainerStyle", js.undefined)
    @scala.inline
    def setAutoDetectWindowHeight(value: Boolean): Self = this.set("autoDetectWindowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDetectWindowHeight: Self = this.set("autoDetectWindowHeight", js.undefined)
    @scala.inline
    def setAutoScrollBodyContent(value: Boolean): Self = this.set("autoScrollBodyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScrollBodyContent: Self = this.set("autoScrollBodyContent", js.undefined)
    @scala.inline
    def setBodyClassName(value: String): Self = this.set("bodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyClassName: Self = this.set("bodyClassName", js.undefined)
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setOnRequestClose(value: /* buttonClicked */ Boolean => Unit): Self = this.set("onRequestClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPaperClassName(value: String): Self = this.set("paperClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperClassName: Self = this.set("paperClassName", js.undefined)
    @scala.inline
    def setPaperProps(value: js.Any): Self = this.set("paperProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperProps: Self = this.set("paperProps", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ Dialog | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[Dialog]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setRepositionOnUpdate(value: Boolean): Self = this.set("repositionOnUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositionOnUpdate: Self = this.set("repositionOnUpdate", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleClassName(value: String): Self = this.set("titleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleClassName: Self = this.set("titleClassName", js.undefined)
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
  }
  
}

