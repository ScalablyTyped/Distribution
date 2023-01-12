package typings.materialUiCore.anon

import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Callback fired when the value changes.
    *
    * @param {object} event The event source of the callback.
    * @param {any} value We default to the index of the child.
    */
  var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[js.Object], /* value */ Any, Unit]] = js.undefined
  
  /**
    * If `true`, all `BottomNavigationAction`s will show their labels.
    * By default, only the selected `BottomNavigationAction` will show its label.
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the currently selected `BottomNavigationAction`.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object OnChange {
  
  inline def apply(): OnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnChange(value: (/* event */ ChangeEvent[js.Object], /* value */ Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
