package typings.materialUi.MaterialUI.Menus

import typings.materialUi.MaterialUI.List.ListItemProps
import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemProps extends ListItemProps {
  
  // <ListItem/> is the element that get the 'other' properties
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  @JSName("containerElement")
  var containerElement_MenuItemProps: js.UndefOr[ReactNode | String] = js.native
  
  var desktop: js.UndefOr[Boolean] = js.native
  
  var focusState: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String | ReactNode] = js.native
  
  var menuItems: js.UndefOr[ReactNode] = js.native
}
object MenuItemProps {
  
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setContainerElement(value: ReactNode | String): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerElement: Self = this.set("containerElement", js.undefined)
    
    @scala.inline
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setFocusState(value: String): Self = this.set("focusState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusState: Self = this.set("focusState", js.undefined)
    
    @scala.inline
    def setLabel(value: String | ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMenuItems(value: ReactNode): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
  }
}
