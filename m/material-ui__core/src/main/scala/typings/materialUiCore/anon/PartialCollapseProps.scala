package typings.materialUiCore.anon

import typings.materialUiCore.collapseCollapseMod.CollapseProps
import typings.materialUiCore.materialUiCoreStrings.auto
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/Collapse.CollapseProps> */
@js.native
trait PartialCollapseProps extends js.Object {
  var addEndListener: js.UndefOr[js.Any] = js.native
  var appear: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapCollap] = js.native
  var collapsedHeight: js.UndefOr[String] = js.native
  var component: js.UndefOr[ReactType[CollapseProps]] = js.native
  var enter: js.UndefOr[Boolean] = js.native
  var exit: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[js.Any] = js.native
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var mountOnEnter: js.UndefOr[js.Any] = js.native
  var onEnter: js.UndefOr[js.Any] = js.native
  var onEntered: js.UndefOr[js.Any] = js.native
  var onEntering: js.UndefOr[js.Any] = js.native
  var onExit: js.UndefOr[js.Any] = js.native
  var onExited: js.UndefOr[js.Any] = js.native
  var onExiting: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var theme: js.UndefOr[typings.materialUiCore.createMuiThemeMod.Theme] = js.native
  var timeout: js.UndefOr[js.Any | auto] = js.native
  var unmountOnExit: js.UndefOr[js.Any] = js.native
}

object PartialCollapseProps {
  @scala.inline
  def apply(): PartialCollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapseProps]
  }
  @scala.inline
  implicit class PartialCollapsePropsOps[Self <: PartialCollapseProps] (val x: Self) extends AnyVal {
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
    def setAddEndListener(value: js.Any): Self = this.set("addEndListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddEndListener: Self = this.set("addEndListener", js.undefined)
    @scala.inline
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClasses(value: PartialClassNameMapCollap): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCollapsedHeight(value: String): Self = this.set("collapsedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsedHeight: Self = this.set("collapsedHeight", js.undefined)
    @scala.inline
    def setComponent(value: ReactType[CollapseProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setEnter(value: Boolean): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: Boolean): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setIn(value: js.Any): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[_] | RefObject[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setMountOnEnter(value: js.Any): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    @scala.inline
    def setOnEnter(value: js.Any): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: js.Any): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: js.Any): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: js.Any): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: js.Any): Self = this.set("onExited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: js.Any): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTheme(value: typings.materialUiCore.createMuiThemeMod.Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTimeout(value: js.Any | auto): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUnmountOnExit(value: js.Any): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
  
}

