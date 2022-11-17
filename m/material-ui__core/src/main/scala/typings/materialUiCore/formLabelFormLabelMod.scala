package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Focused
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
  val default: OverridableComponent[FormLabelTypeMap[js.Object, "label"]] = js.native
  
  type FormLabelBaseProps = LabelHTMLAttributes[HTMLLabelElement]
  
  object FormLabelClassKey {
    
    inline def asterisk: "asterisk" = "asterisk".asInstanceOf["asterisk"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def error: "error" = "error".asInstanceOf["error"]
    
    inline def filled: "filled" = "filled".asInstanceOf["filled"]
    
    inline def focused: "focused" = "focused".asInstanceOf["focused"]
    
    inline def required: "required" = "required".asInstanceOf["required"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type FormLabelClassKey = "root" | "colorSecondary" | "focused" | "disabled" | "error" | "filled" | "required" | "asterisk"
  
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
  
  type _To = OverridableComponent[FormLabelTypeMap[js.Object, "label"]]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: OverridableComponent[FormLabelTypeMap[js.Object, "label"]] = default
}
