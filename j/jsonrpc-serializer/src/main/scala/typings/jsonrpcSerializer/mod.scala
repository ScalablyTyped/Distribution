package typings.jsonrpcSerializer

import typings.jsonrpcSerializer.mod.err.JsonRpcError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonrpc-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserialize(msg: String): DeserializeObject_ = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(msg.asInstanceOf[js.Any]).asInstanceOf[DeserializeObject_]
  
  @scala.inline
  def deserializeObject(msg: PayloadObject): DeserializeObject_ = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeObject")(msg.asInstanceOf[js.Any]).asInstanceOf[DeserializeObject_]
  
  object err {
    
    @JSImport("jsonrpc-serializer", "err.InvalidParamsError")
    @js.native
    class InvalidParamsError protected () extends JsonRpcError {
      def this(args: js.Any*) = this()
    }
    
    @JSImport("jsonrpc-serializer", "err.InvalidRequestError")
    @js.native
    class InvalidRequestError protected () extends JsonRpcError {
      def this(args: js.Any*) = this()
    }
    
    // const ErrorCode = {
    //    JsonRpcError: -32603 as ErrorCode,
    //    ParseError: -32700 as ErrorCode,
    //    InvalidRequestError: -32600 as ErrorCode,
    //    MethodNotFoundError: -32601 as ErrorCode,
    //    InvalidParamsError: -32602 as ErrorCode
    // };
    @JSImport("jsonrpc-serializer", "err.JsonRpcError")
    @js.native
    class JsonRpcError protected ()
      extends StObject
         with SerializerError {
      def this(msg: String, args: js.Any*) = this()
      
      /* CompleteClass */
      var code: Double = js.native
      @JSName("code")
      var code_JsonRpcError: Double | ErrorCode = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      @JSName("name")
      var name_JsonRpcError: String | ErrorName = js.native
      
      def serialize(): String = js.native
    }
    
    @JSImport("jsonrpc-serializer", "err.MethodNotFoundError")
    @js.native
    class MethodNotFoundError protected () extends JsonRpcError {
      def this(args: js.Any*) = this()
    }
    
    @JSImport("jsonrpc-serializer", "err.ParseError")
    @js.native
    class ParseError protected () extends JsonRpcError {
      def this(args: js.Any*) = this()
    }
    
    // const ErrorName = {
    //    JsonRpcError: 'JsonRpcError' as ErrorName,
    //    ParseError: 'ParseError' as ErrorName,
    //    InvalidRequestError: 'InvalidRequestError' as ErrorName,
    //    MethodNotFoundError: 'MethodNotFoundError' as ErrorName,
    //    InvalidParamsError: 'InvalidParamsError' as ErrorName
    // };
    /* Rewritten from type alias, can be one of: 
      - typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32603`
      - typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32700`
      - typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32600`
      - typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32601`
      - typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32602`
    */
    trait ErrorCode extends StObject
    object ErrorCode {
      
      @scala.inline
      def `-32600`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32600` = -32600.asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32600`]
      
      @scala.inline
      def `-32601`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32601` = -32601.asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32601`]
      
      @scala.inline
      def `-32602`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32602` = -32602.asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32602`]
      
      @scala.inline
      def `-32603`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32603` = -32603.asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32603`]
      
      @scala.inline
      def `-32700`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32700` = -32700.asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32700`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError
      - typings.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError
      - typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError
      - typings.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError
      - typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError
    */
    trait ErrorName extends StObject
    object ErrorName {
      
      @scala.inline
      def InvalidParamsError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError = "InvalidParamsError".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError]
      
      @scala.inline
      def InvalidRequestError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError = "InvalidRequestError".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError]
      
      @scala.inline
      def JsonRpcError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError = "JsonRpcError".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError]
      
      @scala.inline
      def MethodNotFoundError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError = "MethodNotFoundError".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError]
      
      @scala.inline
      def ParseError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError = "ParseError".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError]
    }
  }
  
  @scala.inline
  def error(id: String, error: JsonRpcError): String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def error(id: Double, error: JsonRpcError): String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def errorObject(id: String, error: SerializerError): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("errorObject")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  @scala.inline
  def errorObject(id: Double, error: SerializerError): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("errorObject")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  @scala.inline
  def notification(method: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("notification")(method.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def notification(method: String, params: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def notificationObject(method: String): PayloadObject = ^.asInstanceOf[js.Dynamic].applyDynamic("notificationObject")(method.asInstanceOf[js.Any]).asInstanceOf[PayloadObject]
  @scala.inline
  def notificationObject(method: String, params: js.Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("notificationObject")(method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  @scala.inline
  def request(id: String, method: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def request(id: String, method: String, params: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def request(id: Double, method: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def request(id: Double, method: String, params: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def requestObject(id: String, method: String): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  @scala.inline
  def requestObject(id: String, method: String, params: js.Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  @scala.inline
  def requestObject(id: Double, method: String): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  @scala.inline
  def requestObject(id: Double, method: String, params: js.Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  @scala.inline
  def success(id: String, result: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def success(id: Double, result: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def successObject(id: String, result: js.Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("successObject")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  @scala.inline
  def successObject(id: Double, result: js.Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("successObject")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  trait DeserializeObject_ extends StObject {
    
    var payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
    
    var `type`: PayloadType
  }
  object DeserializeObject_ {
    
    @scala.inline
    def apply(
      payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject,
      `type`: PayloadType
    ): DeserializeObject_ = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeserializeObject_]
    }
    
    @scala.inline
    implicit class DeserializeObject_MutableBuilder[Self <: DeserializeObject_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(
        value: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PayloadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("error")
    var error_ErrorPayloadObject: SerializerError
    
    @JSName("id")
    var id_ErrorPayloadObject: String | Double
  }
  object ErrorPayloadObject {
    
    @scala.inline
    def apply(error: SerializerError, id: String | Double): ErrorPayloadObject = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPayloadObject]
    }
    
    @scala.inline
    implicit class ErrorPayloadObjectMutableBuilder[Self <: ErrorPayloadObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: SerializerError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("method")
    var method_NotificationPayloadObject: String
  }
  object NotificationPayloadObject {
    
    @scala.inline
    def apply(method: String): NotificationPayloadObject = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayloadObject]
    }
    
    @scala.inline
    implicit class NotificationPayloadObjectMutableBuilder[Self <: NotificationPayloadObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadObject extends StObject {
    
    var error: js.UndefOr[SerializerError] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
    
    var result: js.UndefOr[js.Any] = js.undefined
  }
  object PayloadObject {
    
    @scala.inline
    def apply(): PayloadObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadObject]
    }
    
    @scala.inline
    implicit class PayloadObjectMutableBuilder[Self <: PayloadObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: SerializerError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonrpcSerializer.jsonrpcSerializerStrings.request
    - typings.jsonrpcSerializer.jsonrpcSerializerStrings.notification
    - typings.jsonrpcSerializer.jsonrpcSerializerStrings.success
    - typings.jsonrpcSerializer.jsonrpcSerializerStrings.error
  */
  trait PayloadType extends StObject
  object PayloadType {
    
    @scala.inline
    def error: typings.jsonrpcSerializer.jsonrpcSerializerStrings.error = "error".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.error]
    
    @scala.inline
    def notification: typings.jsonrpcSerializer.jsonrpcSerializerStrings.notification = "notification".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.notification]
    
    @scala.inline
    def request: typings.jsonrpcSerializer.jsonrpcSerializerStrings.request = "request".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.request]
    
    @scala.inline
    def success: typings.jsonrpcSerializer.jsonrpcSerializerStrings.success = "success".asInstanceOf[typings.jsonrpcSerializer.jsonrpcSerializerStrings.success]
  }
  
  trait RequestPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("id")
    var id_RequestPayloadObject: String
    
    @JSName("method")
    var method_RequestPayloadObject: String
  }
  object RequestPayloadObject {
    
    @scala.inline
    def apply(id: String, method: String): RequestPayloadObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPayloadObject]
    }
    
    @scala.inline
    implicit class RequestPayloadObjectMutableBuilder[Self <: RequestPayloadObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializerError
    extends StObject
       with Error {
    
    var code: Double
    
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object SerializerError {
    
    @scala.inline
    def apply(code: Double, message: String, name: String): SerializerError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializerError]
    }
    
    @scala.inline
    implicit class SerializerErrorMutableBuilder[Self <: SerializerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
  
  trait SuccessPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("id")
    var id_SuccessPayloadObject: String | Double
  }
  object SuccessPayloadObject {
    
    @scala.inline
    def apply(id: String | Double): SuccessPayloadObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessPayloadObject]
    }
    
    @scala.inline
    implicit class SuccessPayloadObjectMutableBuilder[Self <: SuccessPayloadObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type errorHandler = js.Function1[/* errors */ js.Array[String] | Null, Unit]
}
