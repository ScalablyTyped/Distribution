package typings.lesgo

import typings.awsLambda.commonApiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventBase
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventHeaders
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventMultiValueHeaders
import typings.lesgo.anon.`0`
import typings.lesgo.middlewaresHttpMiddlewareMod.HttpMiddlewareOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresNormalizeHttpRequestMiddlewareMod {
  
  @JSImport("lesgo/middlewares/normalizeHttpRequestMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NormalizeHttpMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NormalizeHttpMiddleware]
  
  inline def normalizeHttpRequestBeforeHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHttpRequestBeforeHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeRequest(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")().asInstanceOf[Any]
  inline def normalizeRequest(opts: NormalizeHttpMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait HttpGatewayEvent
    extends StObject
       with APIGatewayProxyEventBase[APIGatewayEventDefaultAuthorizerContext] {
    
    var auth: js.UndefOr[`0`] = js.undefined
    
    var input: js.UndefOr[(Record[String, Any]) | Null | String] = js.undefined
  }
  object HttpGatewayEvent {
    
    inline def apply(
      headers: APIGatewayProxyEventHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      multiValueHeaders: APIGatewayProxyEventMultiValueHeaders,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext],
      resource: String
    ): HttpGatewayEvent = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], body = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
      __obj.asInstanceOf[HttpGatewayEvent]
    }
    
    extension [Self <: HttpGatewayEvent](x: Self) {
      
      inline def setAuth(value: `0`): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setInput(value: (Record[String, Any]) | String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  trait NormalizeHttpMiddleware extends StObject {
    
    var before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
  }
  object NormalizeHttpMiddleware {
    
    inline def apply(
      before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
    ): NormalizeHttpMiddleware = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizeHttpMiddleware]
    }
    
    extension [Self <: NormalizeHttpMiddleware](x: Self) {
      
      inline def setBefore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<HttpGatewayEvent, any> */ Any
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait NormalizeHttpMiddlewareOptions
    extends StObject
       with HttpMiddlewareOptions {
    
    var body: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
    
    var qs: js.UndefOr[Record[String, String]] = js.undefined
  }
  object NormalizeHttpMiddlewareOptions {
    
    inline def apply(): NormalizeHttpMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeHttpMiddlewareOptions]
    }
    
    extension [Self <: NormalizeHttpMiddlewareOptions](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setLogger(value: /* message */ Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setQs(value: Record[String, String]): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    }
  }
}
