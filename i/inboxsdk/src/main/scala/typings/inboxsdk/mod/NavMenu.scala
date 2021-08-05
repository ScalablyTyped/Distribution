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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavMenu {
  
  trait CreateAccessoryDescriptor extends StObject {
    
    def onClick(): Unit
    
    var `type`: CREATE
  }
  object CreateAccessoryDescriptor {
    
    inline def apply(onClick: () => Unit): CreateAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
      __obj.updateDynamic("type")("CREATE")
      __obj.asInstanceOf[CreateAccessoryDescriptor]
    }
    
    extension [Self <: CreateAccessoryDescriptor](x: Self) {
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setType(value: CREATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownButtonAccessoryDescriptor extends StObject {
    
    var buttonBackgroundColor: String
    
    var buttonForegroundColor: String
    
    def onClick(event: DropdownButtonClickEvent): Unit
    
    var `type`: DROPDOWN_BUTTON
  }
  object DropdownButtonAccessoryDescriptor {
    
    inline def apply(
      buttonBackgroundColor: String,
      buttonForegroundColor: String,
      onClick: DropdownButtonClickEvent => Unit
    ): DropdownButtonAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.updateDynamic("type")("DROPDOWN_BUTTON")
      __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
    }
    
    extension [Self <: DropdownButtonAccessoryDescriptor](x: Self) {
      
      inline def setButtonBackgroundColor(value: String): Self = StObject.set(x, "buttonBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setButtonForegroundColor(value: String): Self = StObject.set(x, "buttonForegroundColor", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: DropdownButtonClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setType(value: DROPDOWN_BUTTON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownButtonClickEvent extends StObject {
    
    var dropdown: DropdownView
  }
  object DropdownButtonClickEvent {
    
    inline def apply(dropdown: DropdownView): DropdownButtonClickEvent = {
      val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonClickEvent]
    }
    
    extension [Self <: DropdownButtonClickEvent](x: Self) {
      
      inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconButtonAccessoryDescriptor extends StObject {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: String
    
    def onClick(): Unit
    
    var `type`: ICON_BUTTON
  }
  object IconButtonAccessoryDescriptor {
    
    inline def apply(iconUrl: String, onClick: () => Unit): IconButtonAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.updateDynamic("type")("ICON_BUTTON")
      __obj.asInstanceOf[IconButtonAccessoryDescriptor]
    }
    
    extension [Self <: IconButtonAccessoryDescriptor](x: Self) {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setType(value: ICON_BUTTON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor
    - typings.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor
  */
  trait NavItemDescriptor extends StObject
  object NavItemDescriptor {
    
    inline def NavItemIconHtmlDescriptor(name: String): typings.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor]
    }
    
    inline def NavItemIconUrlDescriptor(name: String): typings.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor]
    }
  }
  
  trait NavItemDescriptorBase extends StObject {
    
    var accessory: js.UndefOr[
        CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
      ] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var expanderForegroundColor: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var onClick: js.UndefOr[js.Function1[/* event */ PreventDefault, Unit]] = js.undefined
    
    var orderHint: js.UndefOr[Double] = js.undefined
    
    var routeID: js.UndefOr[String] = js.undefined
    
    var routeParams: js.UndefOr[js.Object] = js.undefined
    
    var `type`: js.UndefOr[NavItemTypes] = js.undefined
  }
  object NavItemDescriptorBase {
    
    inline def apply(name: String): NavItemDescriptorBase = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemDescriptorBase]
    }
    
    extension [Self <: NavItemDescriptorBase](x: Self) {
      
      inline def setAccessory(
        value: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
      ): Self = StObject.set(x, "accessory", value.asInstanceOf[js.Any])
      
      inline def setAccessoryUndefined: Self = StObject.set(x, "accessory", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setExpanderForegroundColor(value: String): Self = StObject.set(x, "expanderForegroundColor", value.asInstanceOf[js.Any])
      
      inline def setExpanderForegroundColorUndefined: Self = StObject.set(x, "expanderForegroundColor", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ PreventDefault => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      inline def setRouteID(value: String): Self = StObject.set(x, "routeID", value.asInstanceOf[js.Any])
      
      inline def setRouteIDUndefined: Self = StObject.set(x, "routeID", js.undefined)
      
      inline def setRouteParams(value: js.Object): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
      
      inline def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
      
      inline def setType(value: NavItemTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NavItemIconHtmlDescriptor
    extends StObject
       with NavItemDescriptorBase
       with NavItemDescriptor {
    
    var iconElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object NavItemIconHtmlDescriptor {
    
    inline def apply(name: String): NavItemIconHtmlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemIconHtmlDescriptor]
    }
    
    extension [Self <: NavItemIconHtmlDescriptor](x: Self) {
      
      inline def setIconElement(value: HTMLElement): Self = StObject.set(x, "iconElement", value.asInstanceOf[js.Any])
      
      inline def setIconElementUndefined: Self = StObject.set(x, "iconElement", js.undefined)
    }
  }
  
  trait NavItemIconUrlDescriptor
    extends StObject
       with NavItemDescriptorBase
       with NavItemDescriptor {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
  }
  object NavItemIconUrlDescriptor {
    
    inline def apply(name: String): NavItemIconUrlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemIconUrlDescriptor]
    }
    
    extension [Self <: NavItemIconUrlDescriptor](x: Self) {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.inboxsdk.inboxsdkStrings.LINK
    - typings.inboxsdk.inboxsdkStrings.NAVIGATION
  */
  trait NavItemTypes extends StObject
  object NavItemTypes {
    
    inline def LINK: typings.inboxsdk.inboxsdkStrings.LINK = "LINK".asInstanceOf[typings.inboxsdk.inboxsdkStrings.LINK]
    
    inline def NAVIGATION: typings.inboxsdk.inboxsdkStrings.NAVIGATION = "NAVIGATION".asInstanceOf[typings.inboxsdk.inboxsdkStrings.NAVIGATION]
  }
  
  trait NavItemView extends StObject {
    
    def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
    
    var destroyed: Boolean
    
    def isCollapsed(): Boolean
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
    
    def remove(): Unit
    
    def setCollapsed(collapseValue: Boolean): Unit
  }
  object NavItemView {
    
    inline def apply(
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
    
    extension [Self <: NavItemView](x: Self) {
      
      inline def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = StObject.set(x, "addNavItem", js.Any.fromFunction1(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsed(value: () => Boolean): Self = StObject.set(x, "isCollapsed", js.Any.fromFunction0(value))
      
      inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setSetCollapsed(value: Boolean => Unit): Self = StObject.set(x, "setCollapsed", js.Any.fromFunction1(value))
    }
  }
  
  trait NavMenuInstance extends StObject {
    
    def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
  }
  object NavMenuInstance {
    
    inline def apply(addNavItem: NavItemDescriptor => NavItemView): NavMenuInstance = {
      val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem))
      __obj.asInstanceOf[NavMenuInstance]
    }
    
    extension [Self <: NavMenuInstance](x: Self) {
      
      inline def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = StObject.set(x, "addNavItem", js.Any.fromFunction1(value))
    }
  }
}
