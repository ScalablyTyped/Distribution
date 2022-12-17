package typings.materialUiCore.anon

import typings.materialUiCore.fabFabMod.FabClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyFabClassKey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: FabClassKey
  
  var defaultComponent: D
  
  var props: P & DisableRipple
}
object ClassKeyFabClassKey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: FabClassKey, defaultComponent: D, props: P & DisableRipple): ClassKeyFabClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyFabClassKey[P, D]]
  }
  
  extension [Self <: ClassKeyFabClassKey[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ClassKeyFabClassKey[P, D])) {
    
    inline def setClassKey(value: FabClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & DisableRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
