package typings.lesgo

import typings.lesgo.middlewaresHttpMiddlewareMod.HttpMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresErrorHttpResponseMiddlewareMod {
  
  @JSImport("lesgo/middlewares/errorHttpResponseMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ErrorHttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ErrorHttpMiddleware]
  inline def default(opts: ErrorHttpMiddlewareOptions): ErrorHttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[ErrorHttpMiddleware]
  
  inline def errorHttpResponseAfterHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorHttpResponseAfterHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def errorHttpResponseAfterHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any,
    opts: ErrorHttpMiddlewareOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorHttpResponseAfterHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def errorHttpResponseHandler(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHttpResponseHandler")().asInstanceOf[Any]
  inline def errorHttpResponseHandler(opts: ErrorHttpMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHttpResponseHandler")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ErrorHttpMiddleware extends StObject {
    
    var onError: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
  }
  object ErrorHttpMiddleware {
    
    inline def apply(
      onError: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
    ): ErrorHttpMiddleware = {
      val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorHttpMiddleware]
    }
    
    extension [Self <: ErrorHttpMiddleware](x: Self) {
      
      inline def setOnError(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorHttpMiddlewareOptions
    extends StObject
       with HttpMiddlewareOptions {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
  }
  object ErrorHttpMiddlewareOptions {
    
    inline def apply(): ErrorHttpMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorHttpMiddlewareOptions]
    }
    
    extension [Self <: ErrorHttpMiddlewareOptions](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLogger(value: /* message */ Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
