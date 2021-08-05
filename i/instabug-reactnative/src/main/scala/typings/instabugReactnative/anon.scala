package typings.instabugReactnative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ComponentId extends StObject {
    
    var componentId: js.Any
    
    var componentName: js.Any
    
    var passProps: js.Any
  }
  object ComponentId {
    
    inline def apply(componentId: js.Any, componentName: js.Any, passProps: js.Any): ComponentId = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], passProps = passProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentId]
    }
    
    extension [Self <: ComponentId](x: Self) {
      
      inline def setComponentId(value: js.Any): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentName(value: js.Any): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setPassProps(value: js.Any): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
    }
  }
}
