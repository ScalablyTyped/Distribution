package typings.jsonrpcSerializer.mod.err

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def `-32600`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32600` = this.cast(-32600)
  @scala.inline
  def `-32601`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32601` = this.cast(-32601)
  @scala.inline
  def `-32602`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32602` = this.cast(-32602)
  @scala.inline
  def `-32603`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32603` = this.cast(-32603)
  @scala.inline
  def `-32700`: typings.jsonrpcSerializer.jsonrpcSerializerNumbers.`-32700` = this.cast(-32700)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

