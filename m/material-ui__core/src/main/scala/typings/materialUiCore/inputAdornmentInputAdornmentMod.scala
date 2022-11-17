package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisablePointerEvents
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentInputAdornmentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/api/input-adornment/)
    */
  @JSImport("@material-ui/core/InputAdornment/InputAdornment", JSImport.Default)
  @js.native
  val default: OverridableComponent[InputAdornmentTypeMap[js.Object, "div"]] = js.native
  
  object InputAdornmentClassKey {
    
    inline def disablePointerEvents: "disablePointerEvents" = "disablePointerEvents".asInstanceOf["disablePointerEvents"]
    
    inline def filled: "filled" = "filled".asInstanceOf["filled"]
    
    inline def hiddenLabel: "hiddenLabel" = "hiddenLabel".asInstanceOf["hiddenLabel"]
    
    inline def marginDense: "marginDense" = "marginDense".asInstanceOf["marginDense"]
    
    inline def positionEnd: "positionEnd" = "positionEnd".asInstanceOf["positionEnd"]
    
    inline def positionStart: "positionStart" = "positionStart".asInstanceOf["positionStart"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type InputAdornmentClassKey = "root" | "filled" | "positionStart" | "positionEnd" | "disablePointerEvents" | "hiddenLabel" | "marginDense"
  
  type InputAdornmentProps[D /* <: ElementType[Any] */, P] = OverrideProps[InputAdornmentTypeMap[P, D], D]
  
  trait InputAdornmentTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: InputAdornmentClassKey
    
    var defaultComponent: D
    
    var props: P & DisablePointerEvents
  }
  object InputAdornmentTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: InputAdornmentClassKey, defaultComponent: D, props: P & DisablePointerEvents): InputAdornmentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputAdornmentTypeMap[P, D]]
    }
    
    extension [Self <: InputAdornmentTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (InputAdornmentTypeMap[P, D])) {
      
      inline def setClassKey(value: InputAdornmentClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisablePointerEvents): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[InputAdornmentTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `inputAdornmentInputAdornmentMod.foo` */
  override def _to: OverridableComponent[InputAdornmentTypeMap[js.Object, "div"]] = default
}
