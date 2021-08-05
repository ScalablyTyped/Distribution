package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Node
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  val default: ComponentType[NativeSelectInputProps] = js.native
  
  trait NativeSelectInputProps extends StObject {
    
    var IconComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Node, Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
      ] = js.undefined
    
    var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.undefined
    
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object NativeSelectInputProps {
    
    inline def apply(): NativeSelectInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeSelectInputProps]
    }
    
    extension [Self <: NativeSelectInputProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIconComponent(value: ReactType[js.Any]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      inline def setInputRef(value: /* ref */ HTMLSelectElement | Node => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: (js.Array[String | Double | Boolean]) | String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ComponentType[NativeSelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectInputMod.foo` */
  override def _to: ComponentType[NativeSelectInputProps] = default
}
