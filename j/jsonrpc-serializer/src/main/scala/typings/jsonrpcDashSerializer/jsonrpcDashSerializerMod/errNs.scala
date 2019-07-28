package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

import typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod.errNs.ErrorCode
import typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod.errNs.ErrorName
import typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod.errNs.JsonRpcError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonrpc-serializer", "err")
@js.native
object errNs extends js.Object {
  // const ErrorName = {
  //    JsonRpcError: 'JsonRpcError' as ErrorName,
  //    ParseError: 'ParseError' as ErrorName,
  //    InvalidRequestError: 'InvalidRequestError' as ErrorName,
  //    MethodNotFoundError: 'MethodNotFoundError' as ErrorName,
  //    InvalidParamsError: 'InvalidParamsError' as ErrorName
  // };
  /* Rewritten from type alias, can be one of: 
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerNumbers.`-32603`
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerNumbers.`-32700`
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerNumbers.`-32600`
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerNumbers.`-32601`
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerNumbers.`-32602`
  */
  trait ErrorCode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.JsonRpcError
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.ParseError
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.InvalidRequestError
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.MethodNotFoundError
    - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.InvalidParamsError
  */
  trait ErrorName extends js.Object
  
  @js.native
  class InvalidParamsError protected () extends JsonRpcError {
    def this(args: js.Any*) = this()
  }
  
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
  @js.native
  class JsonRpcError protected () extends SerializerError {
    def this(msg: String, args: js.Any*) = this()
    /* CompleteClass */
    override var code: Double = js.native
    @JSName("code")
    var code_JsonRpcError: Double | ErrorCode = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("name")
    var name_JsonRpcError: String | ErrorName = js.native
    def serialize(): String = js.native
  }
  
  @js.native
  class MethodNotFoundError protected () extends JsonRpcError {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class ParseError protected () extends JsonRpcError {
    def this(args: js.Any*) = this()
  }
  
}

