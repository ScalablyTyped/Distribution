package typings.materialUiCore.anon

import typings.materialUiCore.buttonButtonMod.ButtonClassKey
import typings.materialUiCore.materialUiCoreStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponentProps extends StObject {
  
  var classKey: ButtonClassKey
  
  var defaultComponent: button
  
  var props: js.Object & DisableElevation
}
object DefaultComponentProps {
  
  inline def apply(classKey: ButtonClassKey, props: js.Object & DisableElevation): DefaultComponentProps = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentProps]
  }
  
  extension [Self <: DefaultComponentProps](x: Self) {
    
    inline def setClassKey(value: ButtonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & DisableElevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
