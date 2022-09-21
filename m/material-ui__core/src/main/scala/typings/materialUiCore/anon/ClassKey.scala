package typings.materialUiCore.anon

import typings.materialUiCore.iconButtonIconButtonMod.IconButtonClassKey
import typings.materialUiCore.materialUiCoreStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKey extends StObject {
  
  var classKey: IconButtonClassKey
  
  var defaultComponent: button
  
  var props: js.Object & Color
}
object ClassKey {
  
  inline def apply(classKey: IconButtonClassKey, props: js.Object & Color): ClassKey = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKey]
  }
  
  extension [Self <: ClassKey](x: Self) {
    
    inline def setClassKey(value: IconButtonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
