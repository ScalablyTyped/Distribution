package typings.materialUiCore.anon

import typings.materialUiCore.iconButtonIconButtonMod.IconButtonClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponent extends StObject {
  
  var classKey: IconButtonClassKey
  
  var defaultComponent: "button"
  
  var props: js.Object & Color
}
object DefaultComponent {
  
  inline def apply(classKey: IconButtonClassKey, props: js.Object & Color): DefaultComponent = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponent]
  }
  
  extension [Self <: DefaultComponent](x: Self) {
    
    inline def setClassKey(value: IconButtonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: "button"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
