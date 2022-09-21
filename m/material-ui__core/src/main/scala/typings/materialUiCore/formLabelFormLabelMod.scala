package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Focused
import typings.materialUiCore.materialUiCoreStrings.label
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import typings.react.mod.LabelHTMLAttributes
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/api/form-label/)
    */
  @JSImport("@material-ui/core/FormLabel/FormLabel", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormLabelTypeMap[js.Object, label]] = js.native
  
  type FormLabelBaseProps = LabelHTMLAttributes[HTMLLabelElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.colorSecondary
    - typings.materialUiCore.materialUiCoreStrings.focused
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.error
    - typings.materialUiCore.materialUiCoreStrings.filled
    - typings.materialUiCore.materialUiCoreStrings.required
    - typings.materialUiCore.materialUiCoreStrings.asterisk
  */
  trait FormLabelClassKey extends StObject
  object FormLabelClassKey {
    
    inline def asterisk: typings.materialUiCore.materialUiCoreStrings.asterisk = "asterisk".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.asterisk]
    
    inline def colorSecondary: typings.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typings.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.error]
    
    inline def filled: typings.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.filled]
    
    inline def focused: typings.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focused]
    
    inline def required: typings.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.required]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type FormLabelProps[D /* <: ElementType[Any] */, P] = OverrideProps[FormLabelTypeMap[P, D], D]
  
  trait FormLabelTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: FormLabelClassKey
    
    var defaultComponent: D
    
    var props: P & FormLabelBaseProps & Focused
  }
  object FormLabelTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: FormLabelClassKey, defaultComponent: D, props: P & FormLabelBaseProps & Focused): FormLabelTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelTypeMap[P, D]]
    }
    
    extension [Self <: FormLabelTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (FormLabelTypeMap[P, D])) {
      
      inline def setClassKey(value: FormLabelClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FormLabelBaseProps & Focused): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[FormLabelTypeMap[js.Object, label]]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: OverridableComponent[FormLabelTypeMap[js.Object, label]] = default
}
