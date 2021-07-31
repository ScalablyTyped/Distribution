package typings.koaDocs

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaDocs.anon.Description
import typings.koaDocs.mod.koaDocs.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-docs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def get(path: String, options: Options): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  object koaDocs {
    
    trait Options extends StObject {
      
      var groups: js.Array[Description]
      
      var routeHandlers: js.UndefOr[String] = js.undefined
      
      var theme: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var version: String
    }
    object Options {
      
      @scala.inline
      def apply(groups: js.Array[Description], version: String): Options = {
        val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGroups(value: js.Array[Description]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsVarargs(value: Description*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        @scala.inline
        def setRouteHandlers(value: String): Self = StObject.set(x, "routeHandlers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRouteHandlersUndefined: Self = StObject.set(x, "routeHandlers", js.undefined)
        
        @scala.inline
        def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
