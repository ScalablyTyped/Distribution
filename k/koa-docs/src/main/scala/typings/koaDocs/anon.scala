package typings.koaDocs

import typings.koaJoiRouter.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var extendedDescription: js.UndefOr[String] = js.native
    
    var groupName: String = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var routes: js.Array[Spec] = js.native
  }
  object Description {
    
    @scala.inline
    def apply(groupName: String, routes: js.Array[Spec]): Description = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExtendedDescription(value: String): Self = StObject.set(x, "extendedDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedDescriptionUndefined: Self = StObject.set(x, "extendedDescription", js.undefined)
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[Spec]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: Spec*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
}
