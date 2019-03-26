package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

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
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibNumbers.`-32603`
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibNumbers.`-32700`
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibNumbers.`-32600`
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibNumbers.`-32601`
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibNumbers.`-32602`
  */
  trait ErrorCode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.JsonRpcError
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.ParseError
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.InvalidRequestError
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.MethodNotFoundError
    - jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.InvalidParamsError
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
  class JsonRpcError protected ()
    extends jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.SerializerError {
    def this(msg: java.lang.String, args: js.Any*) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    @JSName("code")
    var code_JsonRpcError: scala.Double | ErrorCode = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    @JSName("name")
    var name_JsonRpcError: java.lang.String | ErrorName = js.native
    def serialize(): java.lang.String = js.native
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

