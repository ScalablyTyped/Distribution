package typings.koaDocs

import typings.koaJoiRouter.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var extendedDescription: js.UndefOr[String] = js.undefined
    
    var groupName: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var routes: js.Array[Spec]
  }
  object Description {
    
    inline def apply(groupName: String, routes: js.Array[Spec]): Description = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtendedDescription(value: String): Self = StObject.set(x, "extendedDescription", value.asInstanceOf[js.Any])
      
      inline def setExtendedDescriptionUndefined: Self = StObject.set(x, "extendedDescription", js.undefined)
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRoutes(value: js.Array[Spec]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: Spec*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
}
