package typings.lesgo

import typings.awsLambda.commonApiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventBase
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventHeaders
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventMultiValueHeaders
import typings.lesgo.anon.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresVerifyJwtMiddlewareMod {
  
  @JSImport("lesgo/middlewares/verifyJwtMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): VerifyJwtMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[VerifyJwtMiddleware]
  
  inline def token(headers: Record[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(headers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def verifyJwtMiddlewareBeforeHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<JwtGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwtMiddlewareBeforeHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JwtGatewayEvent
    extends StObject
       with APIGatewayProxyEventBase[APIGatewayEventDefaultAuthorizerContext] {
    
    var decodedJwt: js.UndefOr[`1`] = js.undefined
  }
  object JwtGatewayEvent {
    
    inline def apply(
      headers: APIGatewayProxyEventHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      multiValueHeaders: APIGatewayProxyEventMultiValueHeaders,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext],
      resource: String
    ): JwtGatewayEvent = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], body = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
      __obj.asInstanceOf[JwtGatewayEvent]
    }
    
    extension [Self <: JwtGatewayEvent](x: Self) {
      
      inline def setDecodedJwt(value: `1`): Self = StObject.set(x, "decodedJwt", value.asInstanceOf[js.Any])
      
      inline def setDecodedJwtUndefined: Self = StObject.set(x, "decodedJwt", js.undefined)
    }
  }
  
  trait VerifyJwtMiddleware extends StObject {
    
    var before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<JwtGatewayEvent, any> */ Any
  }
  object VerifyJwtMiddleware {
    
    inline def apply(
      before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<JwtGatewayEvent, any> */ Any
    ): VerifyJwtMiddleware = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyJwtMiddleware]
    }
    
    extension [Self <: VerifyJwtMiddleware](x: Self) {
      
      inline def setBefore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<JwtGatewayEvent, any> */ Any
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
}
