package typings.materialUiCore.anon

import typings.materialUiCore.fabFabMod.FabClassKey
import typings.materialUiCore.materialUiCoreStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyFabClassKeyDefaultComponent extends StObject {
  
  var classKey: FabClassKey
  
  var defaultComponent: button
  
  var props: js.Object & DisableRipple
}
object ClassKeyFabClassKeyDefaultComponent {
  
  inline def apply(classKey: FabClassKey, props: js.Object & DisableRipple): ClassKeyFabClassKeyDefaultComponent = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyFabClassKeyDefaultComponent]
  }
  
  extension [Self <: ClassKeyFabClassKeyDefaultComponent](x: Self) {
    
    inline def setClassKey(value: FabClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & DisableRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
