package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.auto
import typings.materialUiCore.materialUiCoreStrings.desktop
import typings.materialUiCore.materialUiCoreStrings.fullWidth
import typings.materialUiCore.materialUiCoreStrings.horizontal
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.off
import typings.materialUiCore.materialUiCoreStrings.on
import typings.materialUiCore.materialUiCoreStrings.primary
import typings.materialUiCore.materialUiCoreStrings.scrollable
import typings.materialUiCore.materialUiCoreStrings.secondary
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.materialUiCore.materialUiCoreStrings.vertical
import typings.materialUiCore.tabsTabsMod.TabsActions
import typings.react.mod.ChangeEvent
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabelledby extends StObject {
  
  /**
    * The component used to render the scroll buttons.
    */
  var ScrollButtonComponent: js.UndefOr[ElementType[Any]] = js.undefined
  
  /**
    * Props applied to the tab indicator element.
    */
  var TabIndicatorProps: js.UndefOr[PartialHTMLAttributesHTML] = js.undefined
  
  /**
    * Props applied to the [`TabScrollButton`](/api/tab-scroll-button/) element.
    */
  var TabScrollButtonProps: js.UndefOr[PartialTabScrollButtonPro] = js.undefined
  
  /**
    * Callback fired when the component mounts.
    * This is useful when you want to trigger an action programmatically.
    * It supports two actions: `updateIndicator()` and `updateScrollButtons()`
    *
    * @param {object} actions This object contains all possible actions
    * that can be triggered programmatically.
    */
  var action: js.UndefOr[typings.react.mod.Ref[TabsActions]] = js.undefined
  
  /**
    * The label for the Tabs as a string.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * An id or list of ids separated by a space that label the Tabs.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the tabs will be centered.
    * This property is intended for large views.
    */
  var centered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Determines the color of the indicator.
    */
  var indicatorColor: js.UndefOr[secondary | primary] = js.undefined
  
  /**
    * Callback fired when the value changes.
    *
    * @param {object} event The event source of the callback
    * @param {any} value We default to the index of the child (number)
    */
  var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[js.Object], /* value */ Any, Unit]] = js.undefined
  
  /**
    * The tabs orientation (layout flow direction).
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Determine behavior of scroll buttons when tabs are set to scroll:
    *
    * - `auto` will only present them when not all the items are visible.
    * - `desktop` will only present them on medium and larger viewports.
    * - `on` will always present them.
    * - `off` will never present them.
    */
  var scrollButtons: js.UndefOr[auto | desktop | on | off] = js.undefined
  
  /**
    * If `true` the selected tab changes on focus. Otherwise it only
    * changes on activation.
    */
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the color of the `Tab`.
    */
  var textColor: js.UndefOr[secondary | primary | inherit] = js.undefined
  
  /**
    * The value of the currently selected `Tab`.
    * If you don't want any selected `Tab`, you can set this property to `false`.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    *  Determines additional display behavior of the tabs:
    *
    *  - `scrollable` will invoke scrolling properties and allow for horizontally
    *  scrolling (or swiping) of the tab bar.
    *  -`fullWidth` will make the tabs grow to use all the available space,
    *  which should be used for small views, like on mobile.
    *  - `standard` will render the default state.
    */
  var variant: js.UndefOr[standard | scrollable | fullWidth] = js.undefined
}
object Arialabelledby {
  
  inline def apply(): Arialabelledby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arialabelledby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arialabelledby] (val x: Self) extends AnyVal {
    
    inline def setAction(value: typings.react.mod.Ref[TabsActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: /* instance */ TabsActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIndicatorColor(value: secondary | primary): Self = StObject.set(x, "indicatorColor", value.asInstanceOf[js.Any])
    
    inline def setIndicatorColorUndefined: Self = StObject.set(x, "indicatorColor", js.undefined)
    
    inline def setOnChange(value: (/* event */ ChangeEvent[js.Object], /* value */ Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScrollButtonComponent(value: ElementType[Any]): Self = StObject.set(x, "ScrollButtonComponent", value.asInstanceOf[js.Any])
    
    inline def setScrollButtonComponentUndefined: Self = StObject.set(x, "ScrollButtonComponent", js.undefined)
    
    inline def setScrollButtons(value: auto | desktop | on | off): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
    
    inline def setScrollButtonsUndefined: Self = StObject.set(x, "scrollButtons", js.undefined)
    
    inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    inline def setTabIndicatorProps(value: PartialHTMLAttributesHTML): Self = StObject.set(x, "TabIndicatorProps", value.asInstanceOf[js.Any])
    
    inline def setTabIndicatorPropsUndefined: Self = StObject.set(x, "TabIndicatorProps", js.undefined)
    
    inline def setTabScrollButtonProps(value: PartialTabScrollButtonPro): Self = StObject.set(x, "TabScrollButtonProps", value.asInstanceOf[js.Any])
    
    inline def setTabScrollButtonPropsUndefined: Self = StObject.set(x, "TabScrollButtonProps", js.undefined)
    
    inline def setTextColor(value: secondary | primary | inherit): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: standard | scrollable | fullWidth): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
