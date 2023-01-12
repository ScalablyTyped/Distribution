package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.List.ListItemProps
import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.materialUi.MaterialUI.propTypes.origin
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menus {
  
  type DropDownMenu = Component[DropDownMenuProps, js.Object, Any]
  
  trait DropDownMenuProps extends StObject {
    
    // <div/> is the element that gets the 'other' properties
    var anchorOrigin: js.UndefOr[origin] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var iconButton: js.UndefOr[ReactNode] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var listStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var menuItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var menuStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* e */ SyntheticEvent[js.Object, Event], 
          /* index */ Double, 
          /* menuItemValue */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[js.Object, Event], Unit]] = js.undefined
    
    var openImmediately: js.UndefOr[Boolean] = js.undefined
    
    var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var selectionRenderer: js.UndefOr[js.Function2[/* value */ Any, /* menuItem */ Any, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object DropDownMenuProps {
    
    inline def apply(): DropDownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownMenuProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropDownMenuProps] (val x: Self) extends AnyVal {
      
      inline def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIconButton(value: ReactNode): Self = StObject.set(x, "iconButton", value.asInstanceOf[js.Any])
      
      inline def setIconButtonUndefined: Self = StObject.set(x, "iconButton", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "menuItemStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuItemStyleUndefined: Self = StObject.set(x, "menuItemStyle", js.undefined)
      
      inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(
        value: (/* e */ SyntheticEvent[js.Object, Event], /* index */ Double, /* menuItemValue */ Any) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: /* e */ SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOpenImmediately(value: Boolean): Self = StObject.set(x, "openImmediately", value.asInstanceOf[js.Any])
      
      inline def setOpenImmediatelyUndefined: Self = StObject.set(x, "openImmediately", js.undefined)
      
      inline def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
      
      inline def setSelectionRenderer(value: (/* value */ Any, /* menuItem */ Any) => Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction2(value))
      
      inline def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type IconMenu = Component[IconMenuProps, js.Object, Any]
  
  trait IconMenuProps extends StObject {
    
    // <Menu/> is the element that get the 'other' properties
    var anchorOrigin: js.UndefOr[origin] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
    
    // Other properties from <Menu/>
    var autoWidth: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clickCloseDelay: js.UndefOr[Double] = js.undefined
    
    var desktop: js.UndefOr[Boolean] = js.undefined
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    var iconButtonElement: ReactElement
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
    
    var listStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var menuStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ Any | js.Array[Any], Unit]
      ] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[js.Object, Event], Unit]] = js.undefined
    
    var onItemClick: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem, Unit]
      ] = js.undefined
    
    var onKeyboardFocus: js.UndefOr[
        js.Function2[/* e */ FocusEvent[js.Object, Element], /* isKeyboardFocused */ Boolean, Unit]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Any | js.Array[Any]] = js.undefined
  }
  object IconMenuProps {
    
    inline def apply(iconButtonElement: ReactElement): IconMenuProps = {
      val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconMenuProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconMenuProps] (val x: Self) extends AnyVal {
      
      inline def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClickCloseDelay(value: Double): Self = StObject.set(x, "clickCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setClickCloseDelayUndefined: Self = StObject.set(x, "clickCloseDelay", js.undefined)
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setIconButtonElement(value: ReactElement): Self = StObject.set(x, "iconButtonElement", value.asInstanceOf[js.Any])
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInitiallyKeyboardFocused(value: Boolean): Self = StObject.set(x, "initiallyKeyboardFocused", value.asInstanceOf[js.Any])
      
      inline def setInitiallyKeyboardFocusedUndefined: Self = StObject.set(x, "initiallyKeyboardFocused", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ Any | js.Array[Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* e */ SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnItemClick(value: (/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object, Element], /* isKeyboardFocused */ Boolean) => Unit): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2(value))
      
      inline def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): Self = StObject.set(x, "onRequestChange", js.Any.fromFunction2(value))
      
      inline def setOnRequestChangeUndefined: Self = StObject.set(x, "onRequestChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
      
      inline def setValue(value: Any | js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type Menu = Component[MenuProps, js.Object, Any]
  
  type MenuItem = Component[MenuItemProps, js.Object, Any]
  
  trait MenuItemProps
    extends StObject
       with ListItemProps {
    
    // <ListItem/> is the element that get the 'other' properties
    var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    @JSName("containerElement")
    var containerElement_MenuItemProps: js.UndefOr[ReactNode | String] = js.undefined
    
    var desktop: js.UndefOr[Boolean] = js.undefined
    
    var focusState: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String | ReactNode] = js.undefined
    
    var menuItems: js.UndefOr[ReactNode] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setContainerElement(value: ReactNode | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setFocusState(value: String): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
      
      inline def setFocusStateUndefined: Self = StObject.set(x, "focusState", js.undefined)
      
      inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMenuItems(value: ReactNode): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  trait MenuProps extends StObject {
    
    // <List/> is the element that get the 'other' properties
    var autoWidth: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var desktop: js.UndefOr[Boolean] = js.undefined
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
    
    var listStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ Any | js.Array[Any], Unit]
      ] = js.undefined
    
    var onEscKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
    
    var onItemClick: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem, Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
    
    var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    var valueLink: js.UndefOr[ReactLink[Any | js.Array[Any]]] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setInitiallyKeyboardFocused(value: Boolean): Self = StObject.set(x, "initiallyKeyboardFocused", value.asInstanceOf[js.Any])
      
      inline def setInitiallyKeyboardFocusedUndefined: Self = StObject.set(x, "initiallyKeyboardFocused", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ Any | js.Array[Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEscKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onEscKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      inline def setOnItemClick(value: (/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any | js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueLink(value: ReactLink[Any | js.Array[Any]]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      inline def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
