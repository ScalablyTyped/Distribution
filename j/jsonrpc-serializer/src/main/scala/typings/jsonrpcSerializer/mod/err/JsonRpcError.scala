package typings.jsonrpcSerializer.mod.err

import typings.jsonrpcSerializer.mod.SerializerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// const ErrorCode = {
//    JsonRpcError: -32603 as ErrorCode,
//    ParseError: -32700 as ErrorCode,
//    InvalidRequestError: -32600 as ErrorCode,
//    MethodNotFoundError: -32601 as ErrorCode,
//    InvalidParamsError: -32602 as ErrorCode
// };
@JSImport("jsonrpc-serializer", "err.JsonRpcError")
@js.native
class JsonRpcError protected () extends SerializerError {
  def this(msg: String, args: js.Any*) = this()
  
  @JSName("code")
  var code_JsonRpcError: Double | ErrorCode = js.native
  
  @JSName("name")
  var name_JsonRpcError: String | ErrorName = js.native
  
  def serialize(): String = js.native
}
