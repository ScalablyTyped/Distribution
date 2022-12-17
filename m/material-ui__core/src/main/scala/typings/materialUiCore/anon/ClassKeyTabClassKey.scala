package typings.materialUiCore.anon

import typings.materialUiCore.tabTabMod.TabClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyTabClassKey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: TabClassKey
  
  var defaultComponent: D
  
  var props: P & FullWidth
}
object ClassKeyTabClassKey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: TabClassKey, defaultComponent: D, props: P & FullWidth): ClassKeyTabClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyTabClassKey[P, D]]
  }
  
  extension [Self <: ClassKeyTabClassKey[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ClassKeyTabClassKey[P, D])) {
    
    inline def setClassKey(value: TabClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & FullWidth): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
