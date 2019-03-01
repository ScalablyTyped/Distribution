package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonrpc-serializer", "err")
@js.native
object errNs extends js.Object {
  trait ErrorCode extends js.Object
  
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

