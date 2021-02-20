package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsComponentObject extends StObject {
  
  var component: js.UndefOr[GriddleComponent[_]] = js.native
  
  var order: Double = js.native
}
object SettingsComponentObject {
  
  @scala.inline
  def apply(order: Double): SettingsComponentObject = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsComponentObject]
  }
  
  @scala.inline
  implicit class SettingsComponentObjectMutableBuilder[Self <: SettingsComponentObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: GriddleComponent[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
