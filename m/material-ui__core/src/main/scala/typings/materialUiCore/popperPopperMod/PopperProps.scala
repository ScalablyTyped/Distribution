package typings.materialUiCore.popperPopperMod

import typings.materialUiCore.anon.Placement
import typings.popperJs.mod.ReferenceObject
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperProps extends HTMLAttributes[HTMLDivElement] {
  var anchorEl: js.UndefOr[
    Null | HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])
  ] = js.native
  @JSName("children")
  var children_PopperProps: ReactNode | (js.Function1[/* props */ Placement, ReactNode]) = js.native
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.native
  var disablePortal: js.UndefOr[Boolean] = js.native
  var keepMounted: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[js.Object] = js.native
  var open: Boolean = js.native
  var placement: js.UndefOr[PopperPlacementType] = js.native
  var popperOptions: js.UndefOr[js.Object] = js.native
  var transition: js.UndefOr[Boolean] = js.native
}

object PopperProps {
  @scala.inline
  def apply(open: Boolean): PopperProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperProps]
  }
  @scala.inline
  implicit class PopperPropsOps[Self <: PopperProps] (val x: Self) extends AnyVal {
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
    def setAnchorElFunction1(value: /* element */ HTMLElement => HTMLElement): Self = this.set("anchorEl", js.Any.fromFunction1(value))
    @scala.inline
    def setAnchorEl(value: HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])): Self = this.set("anchorEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorEl: Self = this.set("anchorEl", js.undefined)
    @scala.inline
    def setAnchorElNull: Self = this.set("anchorEl", null)
    @scala.inline
    def setChildrenFunction1(value: /* props */ Placement => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode | (js.Function1[/* props */ Placement, ReactNode])): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setContainerFunction0(value: () => ReactInstance): Self = this.set("container", js.Any.fromFunction0(value))
    @scala.inline
    def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setDisablePortal(value: Boolean): Self = this.set("disablePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePortal: Self = this.set("disablePortal", js.undefined)
    @scala.inline
    def setKeepMounted(value: Boolean): Self = this.set("keepMounted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepMounted: Self = this.set("keepMounted", js.undefined)
    @scala.inline
    def setModifiers(value: js.Object): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setPlacement(value: PopperPlacementType): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopperOptions(value: js.Object): Self = this.set("popperOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperOptions: Self = this.set("popperOptions", js.undefined)
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

