package typings.materialUiCore.anon

import typings.react.mod.ChangeEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  /**
    * This prop isn't supported.
    * Use the `component` prop if you need to change the children structure.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The icon element.
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The label element.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[js.Object], /* value */ Any, Unit]] = js.undefined
  
  var onClick: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the `BottomNavigationAction` will show its label.
    * By default, only the selected `BottomNavigationAction`
    * inside `BottomNavigation` will show its label.
    */
  var showLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * You can provide your own value. Otherwise, we fallback to the child position index.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object Icon {
  
  inline def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnChange(value: (/* event */ ChangeEvent[js.Object], /* value */ Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: SyntheticEvent[Any, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
