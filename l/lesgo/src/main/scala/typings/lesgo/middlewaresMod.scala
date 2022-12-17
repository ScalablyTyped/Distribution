package typings.lesgo

import typings.awsLambda.triggerSqsMod.SQSRecord
import typings.lesgo.middlewaresErrorHttpResponseMiddlewareMod.ErrorHttpMiddlewareOptions
import typings.lesgo.middlewaresNormalizeHttpRequestMiddlewareMod.NormalizeHttpMiddlewareOptions
import typings.lesgo.middlewaresSuccessHttpResponseMiddlewareMod.SuccessHttpMiddlewareOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresMod {
  
  @JSImport("lesgo/middlewares", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def normalizeHandler(records: js.Array[SQSRecord]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHandler")(records.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def normalizeHttpRequestBeforeHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHttpRequestBeforeHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeRequest(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")().asInstanceOf[Any]
  inline def normalizeRequest(opts: NormalizeHttpMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  
  inline def token(headers: Record[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(headers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def verifyJwtMiddlewareBeforeHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<JwtGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwtMiddlewareBeforeHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
