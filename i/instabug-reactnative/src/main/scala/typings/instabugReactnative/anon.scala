package typings.instabugReactnative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ComponentId extends StObject {
    
    var componentId: js.Any = js.native
    
    var componentName: js.Any = js.native
    
    var passProps: js.Any = js.native
  }
  object ComponentId {
    
    @scala.inline
    def apply(componentId: js.Any, componentName: js.Any, passProps: js.Any): ComponentId = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], passProps = passProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentId]
    }
    
    @scala.inline
    implicit class ComponentIdMutableBuilder[Self <: ComponentId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentId(value: js.Any): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentName(value: js.Any): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassProps(value: js.Any): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
    }
  }
}
