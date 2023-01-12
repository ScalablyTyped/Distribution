package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  type Tab = Component[TabProps, js.Object, Any]
  
  trait TabProps
    extends StObject
       with SharedEnhancedButtonProps[Tab] {
    
    var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onActive: js.UndefOr[js.Function1[/* tab */ Tab, Unit]] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      inline def setButtonStyle(value: CSSProperties): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnActive(value: /* tab */ Tab => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Tabs = Component[TabsProps, js.Object, Any]
  
  trait TabsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentContainerClassName: js.UndefOr[String] = js.undefined
    
    var contentContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var initialSelectedIndex: js.UndefOr[Double] = js.undefined
    
    var inkBarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onChange: js.UndefOr[js.Function3[/* value */ Any, /* e */ FormEvent[js.Object], /* tab */ Tab, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabItemContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tabTemplate: js.UndefOr[ComponentClass[Any, ComponentState]] = js.undefined
    
    var tabTemplateStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentContainerClassName(value: String): Self = StObject.set(x, "contentContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setContentContainerClassNameUndefined: Self = StObject.set(x, "contentContainerClassName", js.undefined)
      
      inline def setContentContainerStyle(value: CSSProperties): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setInitialSelectedIndex(value: Double): Self = StObject.set(x, "initialSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIndexUndefined: Self = StObject.set(x, "initialSelectedIndex", js.undefined)
      
      inline def setInkBarStyle(value: CSSProperties): Self = StObject.set(x, "inkBarStyle", value.asInstanceOf[js.Any])
      
      inline def setInkBarStyleUndefined: Self = StObject.set(x, "inkBarStyle", js.undefined)
      
      inline def setOnChange(value: (/* value */ Any, /* e */ FormEvent[js.Object], /* tab */ Tab) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabItemContainerStyle(value: CSSProperties): Self = StObject.set(x, "tabItemContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setTabItemContainerStyleUndefined: Self = StObject.set(x, "tabItemContainerStyle", js.undefined)
      
      inline def setTabTemplate(value: ComponentClass[Any, ComponentState]): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
      
      inline def setTabTemplateStyle(value: CSSProperties): Self = StObject.set(x, "tabTemplateStyle", value.asInstanceOf[js.Any])
      
      inline def setTabTemplateStyleUndefined: Self = StObject.set(x, "tabTemplateStyle", js.undefined)
      
      inline def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
