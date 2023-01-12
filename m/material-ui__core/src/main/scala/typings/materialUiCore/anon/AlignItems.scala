package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.`flex-start`
import typings.materialUiCore.materialUiCoreStrings.center
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItems extends StObject {
  
  var ContainerComponent: js.UndefOr[ElementType[HTMLAttributes[HTMLDivElement]]] = js.undefined
  
  var ContainerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  
  var alignItems: js.UndefOr[`flex-start` | center] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var button: js.UndefOr[Boolean] = js.undefined
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var disableGutters: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var divider: js.UndefOr[Boolean] = js.undefined
  
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
}
object AlignItems {
  
  inline def apply(): AlignItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignItems] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: `flex-start` | center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setContainerComponent(value: ElementType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "ContainerComponent", value.asInstanceOf[js.Any])
    
    inline def setContainerComponentUndefined: Self = StObject.set(x, "ContainerComponent", js.undefined)
    
    inline def setContainerProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "ContainerProps", value.asInstanceOf[js.Any])
    
    inline def setContainerPropsUndefined: Self = StObject.set(x, "ContainerProps", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
