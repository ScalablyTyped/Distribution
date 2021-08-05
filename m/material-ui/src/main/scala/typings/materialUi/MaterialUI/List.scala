package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  type List = Component[ListProps, js.Object, js.Any]
  
  type ListItem = Component[ListItemProps, js.Object, js.Any]
  
  trait ListItemProps
    extends StObject
       with EnhancedButtonProps {
    
    // <EnhancedButton/> is the element that get the 'other' properties
    var autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined
    
    var hoverColor: js.UndefOr[String] = js.undefined
    
    var initiallyOpen: js.UndefOr[Boolean] = js.undefined
    
    var innerDivStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var insetChildren: js.UndefOr[Boolean] = js.undefined
    
    var leftAvatar: js.UndefOr[ReactElement] = js.undefined
    
    var leftCheckbox: js.UndefOr[ReactElement] = js.undefined
    
    var leftIcon: js.UndefOr[ReactElement] = js.undefined
    
    var nestedItems: js.UndefOr[js.Array[ReactElement]] = js.undefined
    
    var nestedLevel: js.UndefOr[Double] = js.undefined
    
    var nestedListStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onNestedListToggle: js.UndefOr[js.Function1[/* item */ ListItem, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var primaryText: js.UndefOr[ReactNode] = js.undefined
    
    var primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined
    
    var rightAvatar: js.UndefOr[ReactElement] = js.undefined
    
    var rightIcon: js.UndefOr[ReactElement] = js.undefined
    
    var rightIconButton: js.UndefOr[ReactElement] = js.undefined
    
    var rightToggle: js.UndefOr[ReactElement] = js.undefined
    
    var secondaryText: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryTextLines: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setAutoGenerateNestedIndicator(value: Boolean): Self = StObject.set(x, "autoGenerateNestedIndicator", value.asInstanceOf[js.Any])
      
      inline def setAutoGenerateNestedIndicatorUndefined: Self = StObject.set(x, "autoGenerateNestedIndicator", js.undefined)
      
      inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      inline def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
      
      inline def setInnerDivStyle(value: CSSProperties): Self = StObject.set(x, "innerDivStyle", value.asInstanceOf[js.Any])
      
      inline def setInnerDivStyleUndefined: Self = StObject.set(x, "innerDivStyle", js.undefined)
      
      inline def setInsetChildren(value: Boolean): Self = StObject.set(x, "insetChildren", value.asInstanceOf[js.Any])
      
      inline def setInsetChildrenUndefined: Self = StObject.set(x, "insetChildren", js.undefined)
      
      inline def setLeftAvatar(value: ReactElement): Self = StObject.set(x, "leftAvatar", value.asInstanceOf[js.Any])
      
      inline def setLeftAvatarUndefined: Self = StObject.set(x, "leftAvatar", js.undefined)
      
      inline def setLeftCheckbox(value: ReactElement): Self = StObject.set(x, "leftCheckbox", value.asInstanceOf[js.Any])
      
      inline def setLeftCheckboxUndefined: Self = StObject.set(x, "leftCheckbox", js.undefined)
      
      inline def setLeftIcon(value: ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setNestedItems(value: js.Array[ReactElement]): Self = StObject.set(x, "nestedItems", value.asInstanceOf[js.Any])
      
      inline def setNestedItemsUndefined: Self = StObject.set(x, "nestedItems", js.undefined)
      
      inline def setNestedItemsVarargs(value: ReactElement*): Self = StObject.set(x, "nestedItems", js.Array(value :_*))
      
      inline def setNestedLevel(value: Double): Self = StObject.set(x, "nestedLevel", value.asInstanceOf[js.Any])
      
      inline def setNestedLevelUndefined: Self = StObject.set(x, "nestedLevel", js.undefined)
      
      inline def setNestedListStyle(value: CSSProperties): Self = StObject.set(x, "nestedListStyle", value.asInstanceOf[js.Any])
      
      inline def setNestedListStyleUndefined: Self = StObject.set(x, "nestedListStyle", js.undefined)
      
      inline def setOnNestedListToggle(value: /* item */ ListItem => Unit): Self = StObject.set(x, "onNestedListToggle", js.Any.fromFunction1(value))
      
      inline def setOnNestedListToggleUndefined: Self = StObject.set(x, "onNestedListToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      inline def setPrimaryTogglesNestedList(value: Boolean): Self = StObject.set(x, "primaryTogglesNestedList", value.asInstanceOf[js.Any])
      
      inline def setPrimaryTogglesNestedListUndefined: Self = StObject.set(x, "primaryTogglesNestedList", js.undefined)
      
      inline def setRightAvatar(value: ReactElement): Self = StObject.set(x, "rightAvatar", value.asInstanceOf[js.Any])
      
      inline def setRightAvatarUndefined: Self = StObject.set(x, "rightAvatar", js.undefined)
      
      inline def setRightIcon(value: ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconButton(value: ReactElement): Self = StObject.set(x, "rightIconButton", value.asInstanceOf[js.Any])
      
      inline def setRightIconButtonUndefined: Self = StObject.set(x, "rightIconButton", js.undefined)
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setRightToggle(value: ReactElement): Self = StObject.set(x, "rightToggle", value.asInstanceOf[js.Any])
      
      inline def setRightToggleUndefined: Self = StObject.set(x, "rightToggle", js.undefined)
      
      inline def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextLines(value: Double): Self = StObject.set(x, "secondaryTextLines", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextLinesUndefined: Self = StObject.set(x, "secondaryTextLines", js.undefined)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ListProps = HTMLAttributes[js.Object]
  
  trait SelectableProps extends StObject {
    
    var onChange: js.UndefOr[js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any, Unit]] = js.undefined
    
    var selectedItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object SelectableProps {
    
    inline def apply(): SelectableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableProps]
    }
    
    extension [Self <: SelectableProps](x: Self) {
      
      inline def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSelectedItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedItemStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemStyleUndefined: Self = StObject.set(x, "selectedItemStyle", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
