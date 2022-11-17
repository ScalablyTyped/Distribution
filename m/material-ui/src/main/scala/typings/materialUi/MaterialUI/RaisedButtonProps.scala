package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaisedButtonProps
  extends StObject
     with SharedEnhancedButtonProps[RaisedButton] {
  
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var disabledBackgroundColor: js.UndefOr[String] = js.undefined
  
  var disabledLabelColor: js.UndefOr[String] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[ReactNode] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var labelColor: js.UndefOr[String] = js.undefined
  
  var labelPosition: js.UndefOr["before" | "after"] = js.undefined
  
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var linkButton: js.UndefOr[Boolean] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
  
  var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var secondary: js.UndefOr[Boolean] = js.undefined
}
object RaisedButtonProps {
  
  inline def apply(): RaisedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaisedButtonProps]
  }
  
  extension [Self <: RaisedButtonProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setButtonStyle(value: CSSProperties): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledBackgroundColor(value: String): Self = StObject.set(x, "disabledBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledBackgroundColorUndefined: Self = StObject.set(x, "disabledBackgroundColor", js.undefined)
    
    inline def setDisabledLabelColor(value: String): Self = StObject.set(x, "disabledLabelColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledLabelColorUndefined: Self = StObject.set(x, "disabledLabelColor", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelPosition(value: "before" | "after"): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinkButton(value: Boolean): Self = StObject.set(x, "linkButton", value.asInstanceOf[js.Any])
    
    inline def setLinkButtonUndefined: Self = StObject.set(x, "linkButton", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseUp(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnTouchEnd(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchStart(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
    
    inline def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
    
    inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
