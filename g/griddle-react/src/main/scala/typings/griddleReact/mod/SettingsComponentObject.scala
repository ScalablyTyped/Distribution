package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsComponentObject extends StObject {
  
  var component: js.UndefOr[GriddleComponent[Any]] = js.undefined
  
  var order: Double
}
object SettingsComponentObject {
  
  inline def apply(order: Double): SettingsComponentObject = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsComponentObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsComponentObject] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: GriddleComponent[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
