package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Filled
import typings.materialUiCore.materialUiCoreStrings.p
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextFormHelperTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormHelperText API](https://mui.com/api/form-helper-text/)
    */
  @JSImport("@material-ui/core/FormHelperText/FormHelperText", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormHelperTextTypeMap[js.Object, p]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.error
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.marginDense
    - typings.materialUiCore.materialUiCoreStrings.focused
    - typings.materialUiCore.materialUiCoreStrings.filled
    - typings.materialUiCore.materialUiCoreStrings.contained
    - typings.materialUiCore.materialUiCoreStrings.required
  */
  trait FormHelperTextClassKey extends StObject
  object FormHelperTextClassKey {
    
    inline def contained: typings.materialUiCore.materialUiCoreStrings.contained = "contained".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.contained]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typings.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.error]
    
    inline def filled: typings.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.filled]
    
    inline def focused: typings.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focused]
    
    inline def marginDense: typings.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def required: typings.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.required]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type FormHelperTextProps[D /* <: ElementType[Any] */, P] = OverrideProps[FormHelperTextTypeMap[P, D], D]
  
  trait FormHelperTextTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: FormHelperTextClassKey
    
    var defaultComponent: D
    
    var props: P & Filled
  }
  object FormHelperTextTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: FormHelperTextClassKey, defaultComponent: D, props: P & Filled): FormHelperTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormHelperTextTypeMap[P, D]]
    }
    
    extension [Self <: FormHelperTextTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (FormHelperTextTypeMap[P, D])) {
      
      inline def setClassKey(value: FormHelperTextClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Filled): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[FormHelperTextTypeMap[js.Object, p]]
  
  /* This means you don't have to write `default`, but can instead just say `formHelperTextFormHelperTextMod.foo` */
  override def _to: OverridableComponent[FormHelperTextTypeMap[js.Object, p]] = default
}
