package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisablePointerEvents
import typings.materialUiCore.materialUiCoreStrings.div
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
  val default: OverridableComponent[InputAdornmentTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.filled
    - typings.materialUiCore.materialUiCoreStrings.positionStart
    - typings.materialUiCore.materialUiCoreStrings.positionEnd
    - typings.materialUiCore.materialUiCoreStrings.disablePointerEvents
    - typings.materialUiCore.materialUiCoreStrings.hiddenLabel
    - typings.materialUiCore.materialUiCoreStrings.marginDense
  */
  trait InputAdornmentClassKey extends StObject
  object InputAdornmentClassKey {
    
    inline def disablePointerEvents: typings.materialUiCore.materialUiCoreStrings.disablePointerEvents = "disablePointerEvents".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disablePointerEvents]
    
    inline def filled: typings.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.filled]
    
    inline def hiddenLabel: typings.materialUiCore.materialUiCoreStrings.hiddenLabel = "hiddenLabel".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.hiddenLabel]
    
    inline def marginDense: typings.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def positionEnd: typings.materialUiCore.materialUiCoreStrings.positionEnd = "positionEnd".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.positionEnd]
    
    inline def positionStart: typings.materialUiCore.materialUiCoreStrings.positionStart = "positionStart".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.positionStart]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputAdornmentTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (InputAdornmentTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: InputAdornmentClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisablePointerEvents): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[InputAdornmentTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `inputAdornmentInputAdornmentMod.foo` */
  override def _to: OverridableComponent[InputAdornmentTypeMap[js.Object, div]] = default
}
