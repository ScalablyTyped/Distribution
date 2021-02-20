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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  type List = Component[ListProps, js.Object, js.Any]
  
  type ListItem = Component[ListItemProps, js.Object, js.Any]
  
  @js.native
  trait ListItemProps extends EnhancedButtonProps {
    
    // <EnhancedButton/> is the element that get the 'other' properties
    var autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.native
    
    var hoverColor: js.UndefOr[String] = js.native
    
    var initiallyOpen: js.UndefOr[Boolean] = js.native
    
    var innerDivStyle: js.UndefOr[CSSProperties] = js.native
    
    var insetChildren: js.UndefOr[Boolean] = js.native
    
    var leftAvatar: js.UndefOr[ReactElement] = js.native
    
    var leftCheckbox: js.UndefOr[ReactElement] = js.native
    
    var leftIcon: js.UndefOr[ReactElement] = js.native
    
    var nestedItems: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var nestedLevel: js.UndefOr[Double] = js.native
    
    var nestedListStyle: js.UndefOr[CSSProperties] = js.native
    
    var onNestedListToggle: js.UndefOr[js.Function1[/* item */ ListItem, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var primaryText: js.UndefOr[ReactNode] = js.native
    
    var primaryTogglesNestedList: js.UndefOr[Boolean] = js.native
    
    var rightAvatar: js.UndefOr[ReactElement] = js.native
    
    var rightIcon: js.UndefOr[ReactElement] = js.native
    
    var rightIconButton: js.UndefOr[ReactElement] = js.native
    
    var rightToggle: js.UndefOr[ReactElement] = js.native
    
    var secondaryText: js.UndefOr[ReactNode] = js.native
    
    var secondaryTextLines: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGenerateNestedIndicator(value: Boolean): Self = StObject.set(x, "autoGenerateNestedIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGenerateNestedIndicatorUndefined: Self = StObject.set(x, "autoGenerateNestedIndicator", js.undefined)
      
      @scala.inline
      def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      @scala.inline
      def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
      
      @scala.inline
      def setInnerDivStyle(value: CSSProperties): Self = StObject.set(x, "innerDivStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerDivStyleUndefined: Self = StObject.set(x, "innerDivStyle", js.undefined)
      
      @scala.inline
      def setInsetChildren(value: Boolean): Self = StObject.set(x, "insetChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetChildrenUndefined: Self = StObject.set(x, "insetChildren", js.undefined)
      
      @scala.inline
      def setLeftAvatar(value: ReactElement): Self = StObject.set(x, "leftAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAvatarUndefined: Self = StObject.set(x, "leftAvatar", js.undefined)
      
      @scala.inline
      def setLeftCheckbox(value: ReactElement): Self = StObject.set(x, "leftCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftCheckboxUndefined: Self = StObject.set(x, "leftCheckbox", js.undefined)
      
      @scala.inline
      def setLeftIcon(value: ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      @scala.inline
      def setNestedItems(value: js.Array[ReactElement]): Self = StObject.set(x, "nestedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedItemsUndefined: Self = StObject.set(x, "nestedItems", js.undefined)
      
      @scala.inline
      def setNestedItemsVarargs(value: ReactElement*): Self = StObject.set(x, "nestedItems", js.Array(value :_*))
      
      @scala.inline
      def setNestedLevel(value: Double): Self = StObject.set(x, "nestedLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedLevelUndefined: Self = StObject.set(x, "nestedLevel", js.undefined)
      
      @scala.inline
      def setNestedListStyle(value: CSSProperties): Self = StObject.set(x, "nestedListStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedListStyleUndefined: Self = StObject.set(x, "nestedListStyle", js.undefined)
      
      @scala.inline
      def setOnNestedListToggle(value: /* item */ ListItem => Unit): Self = StObject.set(x, "onNestedListToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNestedListToggleUndefined: Self = StObject.set(x, "onNestedListToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      @scala.inline
      def setPrimaryTogglesNestedList(value: Boolean): Self = StObject.set(x, "primaryTogglesNestedList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryTogglesNestedListUndefined: Self = StObject.set(x, "primaryTogglesNestedList", js.undefined)
      
      @scala.inline
      def setRightAvatar(value: ReactElement): Self = StObject.set(x, "rightAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAvatarUndefined: Self = StObject.set(x, "rightAvatar", js.undefined)
      
      @scala.inline
      def setRightIcon(value: ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconButton(value: ReactElement): Self = StObject.set(x, "rightIconButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconButtonUndefined: Self = StObject.set(x, "rightIconButton", js.undefined)
      
      @scala.inline
      def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      @scala.inline
      def setRightToggle(value: ReactElement): Self = StObject.set(x, "rightToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightToggleUndefined: Self = StObject.set(x, "rightToggle", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextLines(value: Double): Self = StObject.set(x, "secondaryTextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextLinesUndefined: Self = StObject.set(x, "secondaryTextLines", js.undefined)
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ListProps = HTMLAttributes[js.Object]
  
  @js.native
  trait SelectableProps extends StObject {
    
    var onChange: js.UndefOr[js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any, Unit]] = js.native
    
    var selectedItemStyle: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object SelectableProps {
    
    @scala.inline
    def apply(): SelectableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableProps]
    }
    
    @scala.inline
    implicit class SelectablePropsMutableBuilder[Self <: SelectableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSelectedItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedItemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemStyleUndefined: Self = StObject.set(x, "selectedItemStyle", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
