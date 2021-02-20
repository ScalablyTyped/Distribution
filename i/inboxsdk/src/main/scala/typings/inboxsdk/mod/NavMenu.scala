package typings.inboxsdk.mod

import typings.inboxsdk.anon.PreventDefault
import typings.inboxsdk.inboxsdkStrings.CREATE
import typings.inboxsdk.inboxsdkStrings.DROPDOWN_BUTTON
import typings.inboxsdk.inboxsdkStrings.ICON_BUTTON
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.mod.Common.DropdownView
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavMenu {
  
  @js.native
  trait CreateAccessoryDescriptor extends StObject {
    
    def onClick(): Unit = js.native
    
    var `type`: CREATE = js.native
  }
  object CreateAccessoryDescriptor {
    
    @scala.inline
    def apply(onClick: () => Unit, `type`: CREATE): CreateAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAccessoryDescriptor]
    }
    
    @scala.inline
    implicit class CreateAccessoryDescriptorMutableBuilder[Self <: CreateAccessoryDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: CREATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropdownButtonAccessoryDescriptor extends StObject {
    
    var buttonBackgroundColor: String = js.native
    
    var buttonForegroundColor: String = js.native
    
    def onClick(event: DropdownButtonClickEvent): Unit = js.native
    
    var `type`: DROPDOWN_BUTTON = js.native
  }
  object DropdownButtonAccessoryDescriptor {
    
    @scala.inline
    def apply(
      buttonBackgroundColor: String,
      buttonForegroundColor: String,
      onClick: DropdownButtonClickEvent => Unit,
      `type`: DROPDOWN_BUTTON
    ): DropdownButtonAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
    }
    
    @scala.inline
    implicit class DropdownButtonAccessoryDescriptorMutableBuilder[Self <: DropdownButtonAccessoryDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonBackgroundColor(value: String): Self = StObject.set(x, "buttonBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonForegroundColor(value: String): Self = StObject.set(x, "buttonForegroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: DropdownButtonClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: DROPDOWN_BUTTON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropdownButtonClickEvent extends StObject {
    
    var dropdown: DropdownView = js.native
  }
  object DropdownButtonClickEvent {
    
    @scala.inline
    def apply(dropdown: DropdownView): DropdownButtonClickEvent = {
      val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonClickEvent]
    }
    
    @scala.inline
    implicit class DropdownButtonClickEventMutableBuilder[Self <: DropdownButtonClickEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IconButtonAccessoryDescriptor extends StObject {
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: String = js.native
    
    def onClick(): Unit = js.native
    
    var `type`: ICON_BUTTON = js.native
  }
  object IconButtonAccessoryDescriptor {
    
    @scala.inline
    def apply(iconUrl: String, onClick: () => Unit, `type`: ICON_BUTTON): IconButtonAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonAccessoryDescriptor]
    }
    
    @scala.inline
    implicit class IconButtonAccessoryDescriptorMutableBuilder[Self <: IconButtonAccessoryDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: ICON_BUTTON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor
    - typings.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor
  */
  trait NavItemDescriptor extends StObject
  object NavItemDescriptor {
    
    @scala.inline
    def NavItemIconHtmlDescriptor(name: String): typings.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor]
    }
    
    @scala.inline
    def NavItemIconUrlDescriptor(name: String): typings.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor]
    }
  }
  
  @js.native
  trait NavItemDescriptorBase extends StObject {
    
    var accessory: js.UndefOr[
        CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
      ] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var expanderForegroundColor: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ PreventDefault, Unit]] = js.native
    
    var orderHint: js.UndefOr[Double] = js.native
    
    var routeID: js.UndefOr[String] = js.native
    
    var routeParams: js.UndefOr[js.Object] = js.native
    
    var `type`: js.UndefOr[NavItemTypes] = js.native
  }
  object NavItemDescriptorBase {
    
    @scala.inline
    def apply(name: String): NavItemDescriptorBase = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemDescriptorBase]
    }
    
    @scala.inline
    implicit class NavItemDescriptorBaseMutableBuilder[Self <: NavItemDescriptorBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessory(
        value: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
      ): Self = StObject.set(x, "accessory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessoryUndefined: Self = StObject.set(x, "accessory", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setExpanderForegroundColor(value: String): Self = StObject.set(x, "expanderForegroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderForegroundColorUndefined: Self = StObject.set(x, "expanderForegroundColor", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* event */ PreventDefault => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      @scala.inline
      def setRouteID(value: String): Self = StObject.set(x, "routeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteIDUndefined: Self = StObject.set(x, "routeID", js.undefined)
      
      @scala.inline
      def setRouteParams(value: js.Object): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
      
      @scala.inline
      def setType(value: NavItemTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NavItemIconHtmlDescriptor
    extends NavItemDescriptorBase
       with NavItemDescriptor {
    
    var iconElement: js.UndefOr[HTMLElement] = js.native
  }
  object NavItemIconHtmlDescriptor {
    
    @scala.inline
    def apply(name: String): NavItemIconHtmlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemIconHtmlDescriptor]
    }
    
    @scala.inline
    implicit class NavItemIconHtmlDescriptorMutableBuilder[Self <: NavItemIconHtmlDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconElement(value: HTMLElement): Self = StObject.set(x, "iconElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconElementUndefined: Self = StObject.set(x, "iconElement", js.undefined)
    }
  }
  
  @js.native
  trait NavItemIconUrlDescriptor
    extends NavItemDescriptorBase
       with NavItemDescriptor {
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: js.UndefOr[String] = js.native
  }
  object NavItemIconUrlDescriptor {
    
    @scala.inline
    def apply(name: String): NavItemIconUrlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemIconUrlDescriptor]
    }
    
    @scala.inline
    implicit class NavItemIconUrlDescriptorMutableBuilder[Self <: NavItemIconUrlDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.inboxsdk.inboxsdkStrings.LINK
    - typings.inboxsdk.inboxsdkStrings.NAVIGATION
  */
  trait NavItemTypes extends StObject
  object NavItemTypes {
    
    @scala.inline
    def LINK: typings.inboxsdk.inboxsdkStrings.LINK = "LINK".asInstanceOf[typings.inboxsdk.inboxsdkStrings.LINK]
    
    @scala.inline
    def NAVIGATION: typings.inboxsdk.inboxsdkStrings.NAVIGATION = "NAVIGATION".asInstanceOf[typings.inboxsdk.inboxsdkStrings.NAVIGATION]
  }
  
  @js.native
  trait NavItemView extends StObject {
    
    def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView = js.native
    
    var destroyed: Boolean = js.native
    
    def isCollapsed(): Boolean = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
    
    def remove(): Unit = js.native
    
    def setCollapsed(collapseValue: Boolean): Unit = js.native
  }
  object NavItemView {
    
    @scala.inline
    def apply(
      addNavItem: NavItemDescriptor => NavItemView,
      destroyed: Boolean,
      isCollapsed: () => Boolean,
      on: (destroy, js.Function0[Unit]) => Unit,
      remove: () => Unit,
      setCollapsed: Boolean => Unit
    ): NavItemView = {
      val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem), destroyed = destroyed.asInstanceOf[js.Any], isCollapsed = js.Any.fromFunction0(isCollapsed), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCollapsed = js.Any.fromFunction1(setCollapsed))
      __obj.asInstanceOf[NavItemView]
    }
    
    @scala.inline
    implicit class NavItemViewMutableBuilder[Self <: NavItemView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = StObject.set(x, "addNavItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsed(value: () => Boolean): Self = StObject.set(x, "isCollapsed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCollapsed(value: Boolean => Unit): Self = StObject.set(x, "setCollapsed", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NavMenuInstance extends StObject {
    
    def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView = js.native
  }
  object NavMenuInstance {
    
    @scala.inline
    def apply(addNavItem: NavItemDescriptor => NavItemView): NavMenuInstance = {
      val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem))
      __obj.asInstanceOf[NavMenuInstance]
    }
    
    @scala.inline
    implicit class NavMenuInstanceMutableBuilder[Self <: NavMenuInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = StObject.set(x, "addNavItem", js.Any.fromFunction1(value))
    }
  }
}
