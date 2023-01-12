package typings.lesgo

import typings.lesgo.middlewaresHttpMiddlewareMod.HttpMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresSuccessHttpResponseMiddlewareMod {
  
  @JSImport("lesgo/middlewares/successHttpResponseMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): SuccessHttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[SuccessHttpMiddleware]
  inline def default(opts: SuccessHttpMiddlewareOptions): SuccessHttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[SuccessHttpMiddleware]
  
  inline def successHttpResponseAfterHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("successHttpResponseAfterHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def successHttpResponseAfterHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any,
    opts: SuccessHttpMiddlewareOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("successHttpResponseAfterHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def successHttpResponseHandler(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("successHttpResponseHandler")().asInstanceOf[Any]
  inline def successHttpResponseHandler(opts: SuccessHttpMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("successHttpResponseHandler")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait SuccessHttpMiddleware extends StObject {
    
    var after: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
  }
  object SuccessHttpMiddleware {
    
    inline def apply(
      after: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
    ): SuccessHttpMiddleware = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessHttpMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccessHttpMiddleware] (val x: Self) extends AnyVal {
      
      inline def setAfter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
      ): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuccessHttpMiddlewareOptions
    extends StObject
       with HttpMiddlewareOptions
  object SuccessHttpMiddlewareOptions {
    
    inline def apply(): SuccessHttpMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessHttpMiddlewareOptions]
    }
  }
}
