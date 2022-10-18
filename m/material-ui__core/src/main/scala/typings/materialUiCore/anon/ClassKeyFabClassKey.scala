package typings.materialUiCore.anon

import typings.materialUiCore.fabFabMod.FabClassKey
import typings.materialUiCore.materialUiCoreStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyFabClassKey extends StObject {
  
  var classKey: FabClassKey
  
  var defaultComponent: button
  
  var props: js.Object & DisableRipple
}
object ClassKeyFabClassKey {
  
  inline def apply(classKey: FabClassKey, props: js.Object & DisableRipple): ClassKeyFabClassKey = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyFabClassKey]
  }
  
  extension [Self <: ClassKeyFabClassKey](x: Self) {
    
    inline def setClassKey(value: FabClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & DisableRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
