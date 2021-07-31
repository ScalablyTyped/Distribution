package typings.koaJoiRouterDocs

import typings.koaJoiRouter.mod.Router
import typings.koaJoiRouterDocs.anon.Description
import typings.koaJoiRouterDocs.anon.Name
import typings.koaJoiRouterDocs.mod.koaJoiRouterDocs.RouterOptions
import typings.koaJoiRouterDocs.mod.koaJoiRouterDocs.SpecConfig
import typings.koaJoiRouterDocs.mod.koaJoiRouterDocs.SpecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-joi-router-docs", "SwaggerAPI")
  @js.native
  class SwaggerAPI () extends StObject {
    
    def addJoiRouter(router: Router): js.Any = js.native
    def addJoiRouter(router: Router, options: RouterOptions): js.Any = js.native
    
    def generateSpec(config: SpecConfig): js.Object = js.native
    def generateSpec(config: SpecConfig, options: SpecOptions): js.Object = js.native
  }
  
  object koaJoiRouterDocs {
    
    type RouterOptions = js.Object | String
    
    trait SpecConfig extends StObject {
      
      var basePath: String
      
      var info: Description
      
      var tags: js.Array[Name]
    }
    object SpecConfig {
      
      @scala.inline
      def apply(basePath: String, info: Description, tags: js.Array[Name]): SpecConfig = {
        val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
        __obj.asInstanceOf[SpecConfig]
      }
      
      @scala.inline
      implicit class SpecConfigMutableBuilder[Self <: SpecConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfo(value: Description): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTags(value: js.Array[Name]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsVarargs(value: Name*): Self = StObject.set(x, "tags", js.Array(value :_*))
      }
    }
    
    trait SpecOptions extends StObject {
      
      var defaultResponses: js.UndefOr[js.Object] = js.undefined
      
      var warnFunc: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object SpecOptions {
      
      @scala.inline
      def apply(): SpecOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SpecOptions]
      }
      
      @scala.inline
      implicit class SpecOptionsMutableBuilder[Self <: SpecOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultResponses(value: js.Object): Self = StObject.set(x, "defaultResponses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultResponsesUndefined: Self = StObject.set(x, "defaultResponses", js.undefined)
        
        @scala.inline
        def setWarnFunc(value: () => Unit): Self = StObject.set(x, "warnFunc", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWarnFuncUndefined: Self = StObject.set(x, "warnFunc", js.undefined)
      }
    }
  }
}
