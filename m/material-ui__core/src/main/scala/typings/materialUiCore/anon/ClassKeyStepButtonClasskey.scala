package typings.materialUiCore.anon

import typings.materialUiCore.stepButtonStepButtonMod.StepButtonClasskey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyStepButtonClasskey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: StepButtonClasskey
  
  var defaultComponent: D
  
  var props: P & Active
}
object ClassKeyStepButtonClasskey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: StepButtonClasskey, defaultComponent: D, props: P & Active): ClassKeyStepButtonClasskey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyStepButtonClasskey[P, D]]
  }
  
  extension [Self <: ClassKeyStepButtonClasskey[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ClassKeyStepButtonClasskey[P, D])) {
    
    inline def setClassKey(value: StepButtonClasskey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Active): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
