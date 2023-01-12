package typings.materialUiCore.anon

import typings.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseActions
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Props applied to the `TouchRipple` element.
    */
  var TouchRippleProps: js.UndefOr[PartialTouchRippleProps] = js.undefined
  
  /**
    * A ref for imperative actions.
    * It currently only supports `focusVisible()` action.
    */
  var action: js.UndefOr[typings.react.mod.Ref[ButtonBaseActions]] = js.undefined
  
  /**
    * @ignore
    *
    * Use that prop to pass a ref to the native button component.
    * @deprecated Use `ref` instead.
    */
  var buttonRef: js.UndefOr[typings.react.mod.Ref[Any]] = js.undefined
  
  /**
    * If `true`, the ripples will be centered.
    * They won't start at the cursor interaction position.
    */
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * If `true`, the ripple effect will be disabled.
    *
    * ⚠️ Without a ripple there is no styling for :focus-visible by default. Be sure
    * to highlight the element by applying separate styles with the `focusVisibleClassName`.
    */
  var disableRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the touch ripple effect will be disabled.
    */
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the base button will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the base button will have a keyboard focus ripple.
    */
  var focusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This prop can help identify which element has keyboard focus.
    * The class name will be applied when the element gains the focus through keyboard interaction.
    * It's a polyfill for the [CSS :focus-visible selector](https://drafts.csswg.org/selectors-4/#the-focus-visible-pseudo).
    * The rationale for using this feature [is explained here](https://github.com/WICG/focus-visible/blob/master/explainer.md).
    * A [polyfill can be used](https://github.com/WICG/focus-visible) to apply a `focus-visible` class to other components
    * if needed.
    */
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Callback fired when the component is focused with a keyboard.
    * We trigger a `onFocus` callback too.
    */
  var onFocusVisible: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  // @types/react is stricter
  var tabIndex: js.UndefOr[String | Double] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: typings.react.mod.Ref[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: /* instance */ ButtonBaseActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setButtonRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "buttonRef", value.asInstanceOf[js.Any])
    
    inline def setButtonRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "buttonRef", js.Any.fromFunction1(value))
    
    inline def setButtonRefNull: Self = StObject.set(x, "buttonRef", null)
    
    inline def setButtonRefUndefined: Self = StObject.set(x, "buttonRef", js.undefined)
    
    inline def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    inline def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusRipple(value: Boolean): Self = StObject.set(x, "focusRipple", value.asInstanceOf[js.Any])
    
    inline def setFocusRippleUndefined: Self = StObject.set(x, "focusRipple", js.undefined)
    
    inline def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    inline def setOnFocusVisible(value: FocusEvent[Any, Element] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
    
    inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
    inline def setTabIndex(value: String | Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTouchRippleProps(value: PartialTouchRippleProps): Self = StObject.set(x, "TouchRippleProps", value.asInstanceOf[js.Any])
    
    inline def setTouchRipplePropsUndefined: Self = StObject.set(x, "TouchRippleProps", js.undefined)
  }
}
