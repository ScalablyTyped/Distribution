package typings.lesgo

import typings.lesgo.lesgoStrings.APIGATEWAY
import typings.lesgo.lesgoStrings.ELB
import typings.lesgo.middlewaresErrorHttpResponseMiddlewareMod.ErrorHttpMiddleware
import typings.lesgo.middlewaresNormalizeHttpRequestMiddlewareMod.NormalizeHttpMiddleware
import typings.lesgo.middlewaresSuccessHttpResponseMiddlewareMod.SuccessHttpMiddleware
import typings.lesgo.servicesAuroraDbServiceMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresHttpMiddlewareMod {
  
  @JSImport("lesgo/middlewares/httpMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): HttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[HttpMiddleware]
  inline def default(opts: HttpMiddlewareOptions): HttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[HttpMiddleware]
  
  trait HttpMiddleware
    extends StObject
       with NormalizeHttpMiddleware
       with SuccessHttpMiddleware
       with ErrorHttpMiddleware
  object HttpMiddleware {
    
    inline def apply(
      after: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any,
      before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any,
      onError: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
    ): HttpMiddleware = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpMiddleware]
    }
  }
  
  trait HttpMiddlewareOptions extends StObject {
    
    var db: js.UndefOr[default | typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var event: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var zipWhenRequest: js.UndefOr[js.Array[ELB | APIGATEWAY]] = js.undefined
  }
  object HttpMiddlewareOptions {
    
    inline def apply(): HttpMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpMiddlewareOptions]
    }
    
    extension [Self <: HttpMiddlewareOptions](x: Self) {
      
      inline def setDb(value: default | typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setZipWhenRequest(value: js.Array[ELB | APIGATEWAY]): Self = StObject.set(x, "zipWhenRequest", value.asInstanceOf[js.Any])
      
      inline def setZipWhenRequestUndefined: Self = StObject.set(x, "zipWhenRequest", js.undefined)
      
      inline def setZipWhenRequestVarargs(value: (ELB | APIGATEWAY)*): Self = StObject.set(x, "zipWhenRequest", js.Array(value*))
    }
  }
}
