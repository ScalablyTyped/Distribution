package typings.lesgo

import typings.awsLambda.triggerSqsMod.SQSRecord
import typings.awsSdk.clientsS3Mod.BucketName
import typings.awsSdk.clientsS3Mod.GetObjectOutput
import typings.awsSdk.clientsS3Mod.ObjectKey
import typings.awsSdk.clientsSqsMod.SendMessageResult
import typings.lesgo.anon.Length
import typings.lesgo.anon.Sub
import typings.lesgo.middlewaresErrorHttpResponseMiddlewareMod.ErrorHttpMiddlewareOptions
import typings.lesgo.middlewaresNormalizeHttpRequestMiddlewareMod.NormalizeHttpMiddlewareOptions
import typings.lesgo.middlewaresSuccessHttpResponseMiddlewareMod.SuccessHttpMiddlewareOptions
import typings.lesgo.servicesAuroraDbServiceMod.default
import typings.lesgo.utilsValidateFieldsMod.Validation
import typings.node.cryptoMod.BinaryLike
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lesgo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TParams /* <: Record[String, Any] */](
    params: Partial[Record[/* keyof TParams */ String, Any]],
    validFields: js.Array[Validation[String]]
  ): Partial[Record[/* keyof TParams */ String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], validFields.asInstanceOf[js.Any])).asInstanceOf[Partial[Record[/* keyof TParams */ String, Any]]]
  
  @JSImport("lesgo", "LesgoException")
  @js.native
  open class LesgoException protected ()
    extends typings.lesgo.exceptionsMod.LesgoException {
    def this(message: String) = this()
    def this(message: String, errorCode: String) = this()
    def this(message: String, errorCode: String, httpStatusCode: Double) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Double) = this()
    def this(message: String, errorCode: String, httpStatusCode: Double, extra: Any) = this()
    def this(message: String, errorCode: String, httpStatusCode: Unit, extra: Any) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Double, extra: Any) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Unit, extra: Any) = this()
  }
  
  @JSImport("lesgo", "LogLevels")
  @js.native
  object LogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.lesgo.servicesLoggerServiceMod.LogLevels & Double] = js.native
    
    /* 3 */ val debug: typings.lesgo.servicesLoggerServiceMod.LogLevels.debug & Double = js.native
    
    /* 0 */ val error: typings.lesgo.servicesLoggerServiceMod.LogLevels.error & Double = js.native
    
    /* 2 */ val info: typings.lesgo.servicesLoggerServiceMod.LogLevels.info & Double = js.native
    
    /* 1 */ val warn: typings.lesgo.servicesLoggerServiceMod.LogLevels.warn & Double = js.native
  }
  
  @JSImport("lesgo", "db")
  @js.native
  val db: default | typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default = js.native
  
  inline def decrypt(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def del(key: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def dispatch(payload: Any, queueName: String): js.Promise[SendMessageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(payload.asInstanceOf[js.Any], queueName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendMessageResult]]
  
  @JSImport("lesgo", "dynamodb")
  @js.native
  val dynamodb: typings.lesgo.servicesDynamoDbServiceMod.default = js.native
  
  inline def ec(): typings.memcached.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("ec")().asInstanceOf[typings.memcached.mod.^]
  inline def ec(conn: String): typings.memcached.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("ec")(conn.asInstanceOf[js.Any]).asInstanceOf[typings.memcached.mod.^]
  
  inline def encrypt(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  inline def es(conn: String): typings.lesgo.servicesElasticsearchServiceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("es")(conn.asInstanceOf[js.Any]).asInstanceOf[typings.lesgo.servicesElasticsearchServiceMod.default]
  
  inline def generateUid(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUid")().asInstanceOf[js.Promise[String]]
  inline def generateUid(params: Length): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUid")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def get(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getObject(key: ObjectKey, bucketName: BucketName): js.Promise[GetObjectOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any], bucketName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetObjectOutput]]
  
  inline def getTokenData(authHeader: String): Sub = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenData")(authHeader.asInstanceOf[js.Any]).asInstanceOf[Sub]
  
  inline def hash(data: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashMD5(data: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMD5")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isDecimal(a: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lesgo", "logger")
  @js.native
  val logger: typings.lesgo.servicesLoggerServiceMod.default = js.native
  
  inline def normalizeHandler(records: js.Array[SQSRecord]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHandler")(records.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def normalizeHttpRequestBeforeHandler(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.HandlerLambda<HttpGatewayEvent> */ Any,
    next: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.NextFunction */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHttpRequestBeforeHandler")(handler.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeRequest(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")().asInstanceOf[Any]
  inline def normalizeRequest(opts: NormalizeHttpMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def set(key: String, `val`: Any, lifetime: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], lifetime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
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
