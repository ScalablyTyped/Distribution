package typings.jsonrpcSerializer.mod.err

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError
*/
trait ErrorName extends js.Object

object ErrorName {
  @scala.inline
  def InvalidParamsError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError = this.cast("InvalidParamsError")
  @scala.inline
  def InvalidRequestError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError = this.cast("InvalidRequestError")
  @scala.inline
  def JsonRpcError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError = this.cast("JsonRpcError")
  @scala.inline
  def MethodNotFoundError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError = this.cast("MethodNotFoundError")
  @scala.inline
  def ParseError: typings.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError = this.cast("ParseError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

