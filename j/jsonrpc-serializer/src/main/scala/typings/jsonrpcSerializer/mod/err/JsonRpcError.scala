package typings.jsonrpcSerializer.mod.err

import typings.jsonrpcSerializer.mod.SerializerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

