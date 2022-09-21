package typings.handlebarsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ProjectHelpers extends StObject {
    
    var projectHelpers: String
  }
  object ProjectHelpers {
    
    inline def apply(projectHelpers: String): ProjectHelpers = {
      val __obj = js.Dynamic.literal(projectHelpers = projectHelpers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectHelpers]
    }
    
    extension [Self <: ProjectHelpers](x: Self) {
      
      inline def setProjectHelpers(value: String): Self = StObject.set(x, "projectHelpers", value.asInstanceOf[js.Any])
    }
  }
}
