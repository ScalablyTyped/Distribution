package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod.err

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.JsonRpcError
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.ParseError
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.InvalidRequestError
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.MethodNotFoundError
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.InvalidParamsError
*/
trait ErrorName extends js.Object

object ErrorName {
  @scala.inline
  def InvalidParamsError: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.InvalidParamsError = this.cast("InvalidParamsError")
  @scala.inline
  def InvalidRequestError: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.InvalidRequestError = this.cast("InvalidRequestError")
  @scala.inline
  def JsonRpcError: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.JsonRpcError = this.cast("JsonRpcError")
  @scala.inline
  def MethodNotFoundError: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.MethodNotFoundError = this.cast("MethodNotFoundError")
  @scala.inline
  def ParseError: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.ParseError = this.cast("ParseError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

