package typings.graphqlPlaygroundHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: String
    
    var script: String
  }
  object Container {
    
    inline def apply(container: String, script: String): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
}
