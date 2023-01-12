package typings.materialUiCore.anon

import typings.materialUiCore.iconButtonIconButtonMod.IconButtonClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyIconButtonClassKey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: IconButtonClassKey
  
  var defaultComponent: D
  
  var props: P & Color
}
object ClassKeyIconButtonClassKey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: IconButtonClassKey, defaultComponent: D, props: P & Color): ClassKeyIconButtonClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyIconButtonClassKey[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassKeyIconButtonClassKey[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ClassKeyIconButtonClassKey[P, D])) extends AnyVal {
    
    inline def setClassKey(value: IconButtonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
