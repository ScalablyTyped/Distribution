package typings.inversifyRestifyUtils

import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.restify.mod.RequestHandler
import typings.restify.mod.Server
import typings.std.PropertyKey
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object interfaces {
    
    type ConfigFunction = js.Function1[/* app */ Server, Unit]
    
    trait Controller extends StObject
    
    trait ControllerMetadata extends StObject {
      
      var middleware: js.Array[Middleware]
      
      var path: String
      
      var target: js.Any
    }
    object ControllerMetadata {
      
      @scala.inline
      def apply(middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMetadata = {
        val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMetadata]
      }
      
      @scala.inline
      implicit class ControllerMetadataMutableBuilder[Self <: ControllerMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value :_*))
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    trait ControllerMethodMetadata extends StObject {
      
      var key: String
      
      var method: String
      
      var middleware: js.Array[Middleware]
      
      var options: RouteOptions
      
      var target: js.Any
    }
    object ControllerMethodMetadata {
      
      @scala.inline
      def apply(
        key: String,
        method: String,
        middleware: js.Array[Middleware],
        options: RouteOptions,
        target: js.Any
      ): ControllerMethodMetadata = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMethodMetadata]
      }
      
      @scala.inline
      implicit class ControllerMethodMetadataMutableBuilder[Self <: ControllerMethodMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value :_*))
        
        @scala.inline
        def setOptions(value: RouteOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ String, /* value */ js.Any, Unit]
    
    type Middleware = ServiceIdentifier[js.Any] | RequestHandler
    
    /* Rewritten from type alias, can be one of: 
      - typings.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
      - typings.inversifyRestifyUtils.anon.Path
      - typings.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg
    */
    type RouteOptions = _RouteOptions | StrOrRegex
    
    trait ServerOptions
      extends StObject
         with typings.restify.mod.ServerOptions {
      
      var defaultRoot: js.UndefOr[String] = js.undefined
    }
    object ServerOptions {
      
      @scala.inline
      def apply(): ServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ServerOptions]
      }
      
      @scala.inline
      implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultRoot(value: String): Self = StObject.set(x, "defaultRoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultRootUndefined: Self = StObject.set(x, "defaultRoot", js.undefined)
      }
    }
    
    type StrOrRegex = String | RegExp
    
    trait _RouteOptions extends StObject
    object _RouteOptions {
      
      @scala.inline
      def Path(path: StrOrRegex): typings.inversifyRestifyUtils.anon.Path = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.inversifyRestifyUtils.anon.Path]
      }
      
      @scala.inline
      def optionsObjectpathStrOrReg(
        constructor: js.Function,
        hasOwnProperty: PropertyKey => Boolean,
        options: js.Object,
        path: StrOrRegex,
        propertyIsEnumerable: PropertyKey => Boolean
      ): typings.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg = {
        val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
        __obj.asInstanceOf[typings.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg]
      }
    }
  }
}
