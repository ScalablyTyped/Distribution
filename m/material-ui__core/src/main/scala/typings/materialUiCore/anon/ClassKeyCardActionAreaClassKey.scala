package typings.materialUiCore.anon

import typings.materialUiCore.cardActionAreaCardActionAreaMod.CardActionAreaClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyCardActionAreaClassKey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: CardActionAreaClassKey
  
  var defaultComponent: D
  
  var props: P & FocusVisibleClassName
}
object ClassKeyCardActionAreaClassKey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: CardActionAreaClassKey, defaultComponent: D, props: P & FocusVisibleClassName): ClassKeyCardActionAreaClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyCardActionAreaClassKey[P, D]]
  }
  
  extension [Self <: ClassKeyCardActionAreaClassKey[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ClassKeyCardActionAreaClassKey[P, D])) {
    
    inline def setClassKey(value: CardActionAreaClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & FocusVisibleClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
