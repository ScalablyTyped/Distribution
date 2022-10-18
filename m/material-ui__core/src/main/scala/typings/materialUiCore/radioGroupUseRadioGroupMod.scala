package typings.materialUiCore

import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupUseRadioGroupMod {
  
  @JSImport("@material-ui/core/RadioGroup/useRadioGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[RadioGroupState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[RadioGroupState]]
  
  /* Inlined parent std.Pick<@material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupProps, 'name' | 'onChange' | 'value'> */
  trait RadioGroupState extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* value */ String, Unit]
      ] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object RadioGroupState {
    
    inline def apply(): RadioGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupState]
    }
    
    extension [Self <: RadioGroupState](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* value */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
