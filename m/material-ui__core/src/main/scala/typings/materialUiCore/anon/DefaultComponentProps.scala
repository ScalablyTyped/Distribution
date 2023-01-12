package typings.materialUiCore.anon

import typings.materialUiCore.buttonButtonMod.ButtonClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponentProps[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: ButtonClassKey
  
  var defaultComponent: D
  
  var props: P & DisableElevation
}
object DefaultComponentProps {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: ButtonClassKey, defaultComponent: D, props: P & DisableElevation): DefaultComponentProps[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentProps[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultComponentProps[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (DefaultComponentProps[P, D])) extends AnyVal {
    
    inline def setClassKey(value: ButtonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & DisableElevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
