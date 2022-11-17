package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.Ref
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectNativeSelectInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  val default: ComponentType[NativeSelectInputProps] = js.native
  
  trait NativeSelectInputProps
    extends StObject
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    var IconComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLSelectElement]] = js.undefined
    
    var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
  }
  object NativeSelectInputProps {
    
    inline def apply(): NativeSelectInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeSelectInputProps]
    }
    
    extension [Self <: NativeSelectInputProps](x: Self) {
      
      inline def setIconComponent(value: ElementType[Any]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLSelectElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLSelectElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ComponentType[NativeSelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectNativeSelectInputMod.foo` */
  override def _to: ComponentType[NativeSelectInputProps] = default
}
