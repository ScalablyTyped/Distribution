package typings.instabugReactnative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ComponentId extends StObject {
    
    var componentId: Any
    
    var componentName: Any
    
    var passProps: Any
  }
  object ComponentId {
    
    inline def apply(componentId: Any, componentName: Any, passProps: Any): ComponentId = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], passProps = passProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentId]
    }
    
    extension [Self <: ComponentId](x: Self) {
      
      inline def setComponentId(value: Any): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentName(value: Any): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setPassProps(value: Any): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
    }
  }
}
